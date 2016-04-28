package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static java.net.http.HttpRequest.noBody;
import static java.net.http.HttpResponse.asString;

/**
 * New HttpClient API using blocking and async calls.
 * @author lkoniecki
 */
public class Http2Example {
    public static final String URL = "https://http2.akamai.com/demo/h2_demo_frame.html";

    public static String doGet() throws IOException, InterruptedException, URISyntaxException {
        URI uri = new URI(URL);
        HttpResponse response = HttpRequest
                .create(uri)
                .body(noBody())
                .GET().response();
        int responseCode = response.statusCode();
        return response.body(asString());
    }

    public static String doGetAsync() throws URISyntaxException, InterruptedException, ExecutionException {
        HttpRequest req = HttpRequest
                .create(new URI(URL))
                .body(noBody())
                .GET();
        CompletableFuture<HttpResponse> aResp = req.responseAsync();
        Thread.sleep(1000);
        if (!aResp.isDone()) {
            aResp.cancel(true);
            System.out.println("Failed to reply quickly...");
            return null;
        }
        HttpResponse response = aResp.get();
        return response.body(asString());
    }

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException, ExecutionException {
        System.out.println(doGet());
        System.out.println(doGetAsync());
    }
}

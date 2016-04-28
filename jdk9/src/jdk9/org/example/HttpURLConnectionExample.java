package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Old HttpURLConnection style GET
 * @author lkoniecki
 */
public class HttpURLConnectionExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://http2.akamai.com/demo/h2_demo_frame.html");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        StringBuilder result = new StringBuilder();
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        System.out.println(result.toString());
    }
}

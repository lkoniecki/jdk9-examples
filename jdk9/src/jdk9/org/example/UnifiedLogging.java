package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class to show how unified logging in JDK9 works.
 * @author lkoniecki
 */
public class UnifiedLogging {
    //cache
    private final List<Integer> list = new ArrayList<>();
    //random
    private static final Random RND = new Random();

    public synchronized void add(int element) {
        list.add(element);
    }

    public static void main(String[] args) {
        UnifiedLogging test = new UnifiedLogging();
        while (true) {
            try {
                test.add(RND.nextInt());
                Thread.currentThread().sleep(1000l);
                System.gc();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

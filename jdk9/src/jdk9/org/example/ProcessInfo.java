package org.example;

/**
 * Example how to get process id without JNA library
 */
public class ProcessInfo {
    public static void main(String[] args) {
        System.out.println("Your pid is " + ProcessHandle.current().getPid());
        System.out.println("---- info --- ");
        System.out.println(ProcessHandle.current().info());
    }
}
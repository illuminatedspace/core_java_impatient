package ch01.sec01;

import java.util.Random;

public class Method {
    public static void main(String[] args) {
        String hello = "Hello, World!";
        System.out.println(hello.length());

        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
    }
}

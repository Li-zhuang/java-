package org.com.chapter3;

public class StaticTest3 {

    static {
        System.out.println("test static 1");
    }

    public static void main(String[] args) {

    }

    static {
        System.out.println("test static 2");
    }
}

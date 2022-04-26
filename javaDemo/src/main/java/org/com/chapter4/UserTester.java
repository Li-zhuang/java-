package org.com.chapter4;

public class UserTester {

    public static void main(String[] args) {
        wantToWash(() -> {



        });
    }


    public static void wantToWash(Washer washer) {
        washer.doWash();



    }
}

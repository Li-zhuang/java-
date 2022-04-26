package org.com.chapter3;

public class YouSelf {


    public static void main(String[] args) {
        IWasher washer = new MyWahser();
        wantToWash(washer);
    }


    public static void wantToWash(IWasher washer) {
        washer.doWash();
    }
}

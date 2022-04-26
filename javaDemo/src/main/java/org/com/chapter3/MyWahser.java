package org.com.chapter3;

public class MyWahser implements IWasher{
    @Override
    public void doWash() {
        beforeWash();
        //....
        System.out.println("do wash...");
        //
        afterWash();
    }

    public void beforeWash(){
        System.out.println("进水...");
    }

    public void afterWash(){
        System.out.println("洗完了...");
    }


}

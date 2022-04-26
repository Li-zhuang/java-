package org.com.chapter4;

public class HaierWasher extends AbstractWasher implements Washer{
    @Override
    public void doWash() {
        System.out.println("Haier do Wash....");
    }
}

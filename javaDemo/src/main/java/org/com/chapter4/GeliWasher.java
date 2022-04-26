package org.com.chapter4;

public class GeliWasher  extends AbstractWasher implements Washer{
    @Override
    public void doWash() {
        beforeWasher();
        System.out.println("Geli do wash....");
        afterWasher();
    }

}

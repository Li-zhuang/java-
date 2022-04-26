package org.com.chapter3;

public class MainArgsTest {

    public static void main(String[] args) {
        if (args.length == 0 || args[0].equals("-h"))
            System.out.println("HELLO");
        else if (args[0].equals("-g"))
            System.out.println("Goodbye");
        for (int i = 1; i < args.length; i++)
            System.out.println("" + args[i]);
        System.out.println("!");
    }

    //每一个Java程序都带有一个String arg[]参数的main方法。
    //这个参数表明main方法将接收一个字符串数组，也就是命令行上指定的参数。

    //数组排序
    //





}

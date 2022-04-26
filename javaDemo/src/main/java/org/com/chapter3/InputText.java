package org.com.chapter3;

import java.util.Scanner;

public class InputText
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //在控制台进行输入，首先需要构建一个与"标准输入流"System.in 关联的Scanner对象。
        //get first input
        System.out.print("what's your name?");
        String name = in.nextLine();

        //get second input
        System.out.print("how old are you ?");
        int age = in.nextInt();

        System.out.println("hello,"+name+".next year,you'll be"+(age+1));


    }
}

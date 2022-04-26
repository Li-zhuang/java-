package org.com.chapter3;


import java.util.*;
//要以分号结束

public class Retirement {
    /**
     * 判断示例
     *
     * @version 1.0
     * @auther lizhuangzhuang
     */
    public static void main(String[] args) {

        xunHuan();

        Scanner in = new Scanner(System.in);
        //控制台输入
        System.out.println("how much do you need to retire?");
        double goal = in.nextDouble();

        System.out.println("how much money will you contribute every year?");
        double payment = in.nextDouble();
        System.out.println("interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            System.out.println(balance);
            years++;
        }
        System.out.println("you can retire in " + years + "years.");

        retirement2();

    }

    public static void retirement2() {
        Scanner in = new Scanner(System.in);
        //控制台输入
        System.out.println("how much do you need to retire?");
        double goal = in.nextDouble();

        System.out.println("how much money will you contribute every year?");
        double payment = in.nextDouble();
        System.out.println("interest rate in %: ");
        double interestRate = in.nextDouble();
        int balance = 0;
        int years = 0;
        do {
            balance += payment;
            //balance=balance+payment
            double interest = balance * interestRate / 100;
            balance += interest;
            System.out.println("balance:" + balance);
            years++;
            System.out.println(years + "year.");
//            System.out.printf("After year %d, your balance is %,.2f%n",years,balance);
        } while (balance < goal);
    }

    //确定循环
    //支持迭代
    //第一部分是对计数器的初始化；第二部分检测的循环条件；第三部分是如何更新计数器；
    //当for语句第一部分声明之后，这个变量的作用域扩展到这个for的末尾
    public static void xunHuan(){
        int s = 0;
        for(int i =10;i>0;i--) {
            s++;
            System.out.println("没有大括号的for循环"+s);
        }
            System.out.println(s);
    }

}

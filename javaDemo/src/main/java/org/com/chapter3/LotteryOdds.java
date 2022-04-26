package org.com.chapter3;

import java.math.BigInteger;
import java.util.Scanner;

public class LotteryOdds<lotteryOdds> {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("what is the highest number you can draw?");
        int n = in.nextInt();

        int lotteryOdds = 1;

        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        System.out.println("your odds are 1 in" + lotteryOdds + ".Good luck!");
        //对象可以传递给一个方法！！！ 对象可以作为方法的参数！！！

        switch1();
        breakTest();
    }

    //switch语句；switch语句见她刚从与选项值匹配的case标签开始执行；直到遇到break语句或者执行到switch
    //语句结束处为止，如果没有匹配的case标签，而有default子句，就执行这个子句。分号结束子句
    //如果在case分支语句的末尾没有break语句。那么就会执行下一个case语句。
    /*

    case标签可以是：
    1、类型为char byte short 或 int的常量表达式
    2、枚举常量
    3、还可以是字符串字面量
     */

    /*
    swich(choice){
        case1:
        ...
            break;
        case2:
        ...
            break;

    }
     */
    public static void switch1() {
        String input = "YES";
        switch (input.toLowerCase()) {
            case "yes":
                System.out.println("判断字符串正确");
                break;

        }
    }
    /*
    当在switch语句中使用枚常量时，不必在每个标签指明枚举名，可由switch的表达式值推导得出。
    //找个例子
     */

    /**
     * 中断控制流程的语句
     * 1、break 2、带标签的break 3、continue
     */
    public static void breakTest() {
        Scanner in = new Scanner(System.in);
        //new的是一个构造器 参数是带括号的！！！
        int i;
        int n;
        read_data:
        //标签，用于带标签的break语句；
        //标签必须放在希望跳出的最外层循环之前，必须紧跟一个冒号；
        while (true) {
            for (i = 1; i < 10; i++) {
                System.out.println("enter a number >=0");
                n = in.nextInt();
                if (n < 0)
                    break read_data;
                System.out.println("没有返回标签处");
            }
            //break;
            System.out.println("计数结束");
        }
        System.out.println("已返回标签处");
        //返回标签处后，不在执行跳出的循环体，直接跳过循环体，执行后续的语句。
        //即：执行带标签的break会跳转到带标签的语句块末尾。
    }

    //continue语句；将中断正常的控制流程，continue语句将控制转移到最内层循环的首部。

    /**
     * 大数
     */

    //对于基本的整数及浮点数精度不能满足需求，可以使用java.math中的两个很有用的类：BigInteger和BigDecimal
    //BigInteger类实现任意精度的整数运算；
    //BigDecimal实现任意精度的浮点数运算；

    //使用静态的valueOf方法可以及那个普通的数值转换为大数；
    BigInteger a = BigInteger.valueOf(100);
    //对于更大的数，可以使用一个带字符串参数的构造器；
    BigInteger reallyBig = new BigInteger("7874837847238947823473473284723947239473298472398");
    //大数不能使用常用的算术运算符（+；-）处理的大数；需要使用add,multiply;

    public static void BigIntegerTest() {
        int n = 1;
        int k = 10;
        //int lotteryOdds = 1;
        //必须定义为大数类型；
        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++)
            //lotteryOdds = lotteryOdds * (n - i + 1) / i;
        //转换为大数的写法、//使用静态的valueOf方法可以及那个普通的数值转换为大数；
        lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        System.out.println("your odds are 1 in" + lotteryOdds + ".Good luck!");
    }


    //
}

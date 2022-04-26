package org.com.chapter4;


//封装是一种将抽象函式接口的实现细节部分包装、隐藏起来的方法。
//封装是一种保护屏障，防止该类的代码和数据被外部类定义的代码随机访问。
//封装最主要的功能在于我们能修改自己的实现代码，而不用修改那些调用我们代码的程序片段。

import java.util.Scanner;

public class EncapsulationTest {


    //1、修改属性的可见性来限制对属性的访问（一般限制为private）
    public class Person{
        private String name;
        private int age;
    //这段代码中，将name和age属性设置为私有，只能本类访问。就实现了对信息的隐藏。
    }

    //2、对每个值属性提供对外的公共方法访问，也就是常见一对赋取值方法，用于对私有属性的访问，例如：
    public static class Person1{
        private String name;
        private int age;

        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        //采用this关键字是为了解决实例变量（private int age）与setAge（int age）中的age变量之间发生的同名冲突
        }
    }
    //以上实例中public方法是外部类访问该类成员变量的入口。这些方法被称为getter和setter方法。
    public static void main(String[] args){
        Person1 person = new Person1();
        //为什么必须为static  public static class Person1{}
        //对于非静态的方法 不是实例化就可以了吗？
        System.out.println("请输入：");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        person.setAge(age);
        System.out.println("输入值为："+person.getAge());

    }

}

package org.com.chapter3;

public class InnerClass {
    //成员内部类

    //1、静态内部类
    //使用static修饰的内部类我们称之为静态内部类
    static class InnerClass1{
        static String test = "test";
        int a = 1;
        static void fun1(){ }
        void fun2(){ }
    }
    //1.2非静态成员内部类
    public class Cricle{
        private double radius = 0.0;
        public   int count = 1;
        public Cricle(double radius){
            this.radius = radius;
        }
        public class Draw {
            public  void drawShape(){
                System.out.println(radius);
                System.out.println(count);
            }
        }

    }


    //局部内部类




    //匿名内部类





    //静态内部类





}

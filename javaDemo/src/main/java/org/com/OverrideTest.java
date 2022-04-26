package org.com;

/**
 * java 重写（override）与重载（overload）
 */
/*
重写是子类重新编写可以访问父类的方法的实现过程。
返回值和形参都不能改变。即外壳不变，核心重写！
重写的好处是子类可以根据需要，定义特定于自己的行为，即子类能够根据需要实现父类的方法。、
重写方法不能抛出新的检查异常或者比被重写方法申明更加宽泛的异常。


 */
public class OverrideTest {

    public static void main(String[] args) {

        //外部非静态类引用
//        Animal a = new Animal();
//        Animal b = new Dog();
//        a.move(); //执行 animal类的方法
//        b.move(); //执行 dog类的方法

        //内部静态类引用
//        Animal.move();
//        Dog.move();

        //引用类内部非静态方法
//        OverrideTest overrideTest=new OverrideTest();
//        overrideTest.fangfa();

        //引用类内部的非静态类  内部类的引用方式.
        /*
        定义了成员内部类后，必须使用外部类对象来创建内部类对象，而不能直接去 new 一个内部类对象，
        即：内部类 对象名 = 外部类对象.new 内部类( );来创建内部类对象
         */
        OverrideTest overrideTest = new OverrideTest();
        Animal a = overrideTest.new Animal();
        Animal b = overrideTest.new Dog();
        a.move(); //执行 animal类的方法
        b.move(); //执行 dog类的方法

    }



    //内部类 静态引用 静态类内部必须为静态方法
//    static class Animal{
//        public static void move(){
//            System.out.println("动物可以移动");
//        }
//    }
//
//    static class Dog extends Animal {
//        //重写了父类的方法
//        public static void move() {
//            System.out.println("狗可以跑和走");
//        }
//    }

    class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}

    class Dog extends Animal{
    //重写了父类的方法
    public void move() {
        System.out.println("狗可以跑和走");
    }

}

}


//外部非静态类
//class Animal{
//    public void move(){
//        System.out.println("动物可以移动");
//    }
//}
//
//class Dog extends Animal{
//    //重写了父类的方法
//    public void move() {
//        System.out.println("狗可以跑和走");
//    }
//}

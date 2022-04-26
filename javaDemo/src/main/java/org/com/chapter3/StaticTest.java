package org.com.chapter3;

public class StaticTest extends Base {
    static {
        System.out.println("test static");
    }

    //Java中使用 new关键字 加上 构造方法，来创建一个对象。
    //每个类都有构造方法。如果没有显式地为类定义构造方法，Java 编译器将会为该类提供一个默认构造方法。
    //在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。
    //构造器没有返回值类型！也不需要void方法,方法必须要有返回值，能返回任何类型的值或者无返回值（void）。其主要功能是用来在创建对象时初始化对象，只负责初始化，不负责创建对象，new负责创建
    //构造器是为了创建一个类的实例。创建对象时被调用,同时可以给属性做初始化，而且只会调用一次。

    //构造方法与普通方法不同，首字母大写，而且没有返回值类型。
    //构造器可以有任何访问的修饰： public, protected, private或者没有修饰
    //构造器不能有以下非访问性质的修饰： abstract, final, native, static, 或者 synchronized
    public StaticTest() {
        System.out.println("test constructor");
    }

    //在main方法中执行new StaticTest()的时候会先调用父类的构造器，然后再调用自身的构造器
    public static void main(String[] args) {
        new StaticTest();

        /*
        new 类名或接口名(){
            //重写方法;
            }；     //注意分号
        上述为内部类的格式，整体相当于是new出来的一个对象
        本质：其实是继承该类或者实现接口的子类匿名对象
        */
        //只创建某类的一个对象时，就不必将该类进行命名,可采用内部类的方式；
        //匿名内部类的前提是存在一个类或者接口，且匿名内部类是写在方法中的。
        StaticTest test = new StaticTest();
        //左侧为声明：在内存中分配了一个变量,名字为test,这个变量是 StaticTest类型的,后半部分初始化 new关键字，调用StaticTest()构造方法初始化对象；
        //new会把这个对象在内存中的地址返回，通过这个地址就可以找到这个对象。= 表示把这个对象在内存中的地址 赋值 给变量c；c是一个内存地址。
        new Outer().method();
    }
}

class Base {
    static {
        System.out.println("base static");
    }

public Base() {
        System.out.println("base constructor");
    }
}

/**
 * 匿名内部类
 */

//一个编译单元（java文件）可以存在多个类，在编译时产生多个不同的.class文件
//java将public类作为每个编译单元的数据接口，public修饰的类的类名与文件名相同,只能存在一个。

class NiMing {
    public void show() {
    }
}

abstract class NiMing2 {
    public abstract void show();
}

class Outer {
    public void method() {
        //匿名内部类是写在方法中的。
        //必须要重写
        new NiMing() {
            public void show() {
                System.out.println("匿名内部类示例");
            }
        }.show();
    }
}

/**
 * 内部类
 */


package org.com.chapter4;

/**
 * java接口
 */

public interface InterfaceTest {

    /*
    1、接口，是Java编程语言中一种抽象类型，是抽象方法的集合；通常以interface来声明。
    2、一个类通过实现接口的方式，从而来继承接口的抽象方法。接口不是被继承了，而是被实现了。
    3、除非实现接口的类是抽象类，否则该类要定义接口中的所有抽象方法。
    4、接口无法被实例化，但是可以被实现。一个实现接口的类，必须实现接口内所描述的所有方法；否则就声明为抽象类。
    5、接口为抽象方法的集合，没有构造方法，也不包含成员变量，除了static和final变量。

    1、接口中的方法是隐式抽象的，接口中的方法会被隐式的指定为public abstract(显示指定只能为public abstract，其他修饰符都会报错)。
    2、接口中可以含有变量，但是接口中的变量会被隐式的指定为public static final变量（并且只能是public，private会报错。）
    3、接口中只能为抽象方法，不能在接口中实现，由实现接口的类来实现接口中的方法。

    1、抽象类中的方法可以有方法体，可以实现方法的具体功能，但是接口中的方法不行。

    1、接口是隐式抽象的，当声明一个接口时，不必使用abstract关键字。
    2、接口中每一个方法也是隐式抽象的，声明时同样不需要abstract关键字。
    3、接口中的方法都是公有的。
     */
}
interface Animal{
    void eat();
    void travel();
}

//在实现接口时，要注意一些规则：
//一个类可以同时实现多个接口；
//一个类只能继承一个类，但是能实现多个接口；
//一个接口能继承另一个接口，这和类之间的继承比较相似。



class MammalInt implements Animal{
    //实现接口的类需要将接口中所有的方法都进行重写
    public void eat(){
        System.out.println("Mammal eats");
    }
    public void travel(){
        System.out.println("Mammal travels");
    }
    public int noOfLegs(){
        return 0;
    }
    public static void main(String[] args) {
        //静态方法引用非静态方法，首先需要实例化。

        Animal m = new MammalInt();
        m.eat();
        m.travel();
    }
}

/**
 *接口的继承
 */

interface Sports{
    //只能有一个public
    public void setHomeTeam(String name);
    void setVisitingTeam(String name);
}
interface Football extends Sports{
    void homeTeamScored(int points);
}
//Football接口声明了一个方法，从Sports接口继承了两个方法，这样实现Football接口，需要实现六个方法。

/**
 * 接口的多继承
 */
//在java中，类的多继承是不合法的，但是接口允许多继承。
//在接口的多继承中extends关键字只需要使用一次，在其后跟着继承接口。
interface Hockey extends Sports,Football{

}


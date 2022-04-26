package org.com.chapter4;

/**
 * 抽象类
 *
 */

public class AbstractClassTest {

        //尽管不能实例化一个Employee对象，但是可以实例化一个salary对象，该对象从Employee类继承3个成员方法，且通过该方法可以设置或获取三个成员变量
        //
        public static void main(String[] args){

            Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);

            Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

            System.out.println("Call mailCheck using Salary reference --");
            s.mailCheck();

            System.out.println("\n Call mailCheck using Employee reference--");
            e.mailCheck();
        }

}


//所有的对象都是通过类来描述，抽象类不能实例化为对象；
//抽象类必须被继承才能被使用
//在Java中抽象类表示一种继承关系；一个类只能继承一个抽象类，而一个类可以实现多个接口！
class Employee{
    private String name;
    private String address;
    private int number;

    //构造方法可以带参数，默认是不带参。
    //与方法不同，首字母大写，构造方法和它所在类的名字相同，但构造方法没有返回值。
    //可以给一个类的实例变量赋初值


    public Employee(String name,String address,int number){
        //this指当前这个对象
        //this.方法引用 this指向正在执行方法的类的实例(当前对象)。
        //静态方法不能使用this关键字，因为静态方法不属于类的实例，所以this也就没有什么东西去指向\
        this.name=name;
        this.address=address;
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void mailCheck()
    {
        System.out.println("Mailing a check to " + this.name
                + " " + this.address);
    }

    public void setAddress(String newAddress){
        //注意无返回值void的返回值类型
        address = newAddress;
    }
}


//虽然该类是抽象类，但是依然有三个成员变量，三个成员方法，一个构造方法。
//继承抽象类
class Salary extends Employee {

    private double salary;

    public Salary(String name, String address, int number, double salary) {
        //super的用法。
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Mailing check to" + getName() + "with salary" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }
}

/**
 *
 * 抽象方法
 */

//若设计一个类包含一个特别的成员方法，该方法的具体实现由他的子类确定，那么可以在父类中声明该方法为抽象方法。
//抽象方法同样采用Abstract关键字，抽象方法只包含一个方法名，而没有方法体。但是有返回值类型。
//抽象方法没有定义，方法名后边直接跟一个分号，而不是花括号。

/*
声明抽象方法会造成两个结果：
1、如果一个类包含抽象方法，那么该类必须是抽象类。
2、任何子类必须重写父类的抽象方法。

 */

abstract class Employee1{
    private String name;
    private String address;
    private int number;

    public String getName(){
        return name;
    }

    //抽象方法 没有方法体，没有大括号，
    public abstract double computePay();

}

class Salary1 extends Employee1{

    private double salary;
    //继承抽象方法的子类，必须重写该方法;
    //否则，该子类也必须声明为抽象类。
    //最终，必须有子类实现该抽象方法，否则，从最初的父类到最终的子类都不能用来实例化对象。
    //如果Salary类继承了Employee类，那么它必须实现computePay()方法：
    public double computePay(){
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}


/*
抽象类的总结：
1、抽象类不能被实例化（new），如果被实例化，就会被报错，编译无法通过。
只有抽象类的非抽象子类可以创建对象。
2、抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
3、抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现。
4、构造方法、类方法（static修饰的方法）不能声明为抽象方法
5、抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。
 */

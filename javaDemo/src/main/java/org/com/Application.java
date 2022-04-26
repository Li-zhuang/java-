package org.com;


import java.util.Date;

/**
 * 1、首先是启动类，启动类里面有一个main()函数，
 * 2、注释的写法：此种注释会自动生成文档
 * 3、相关函数调用
 */

public class Application {
    //main()函数的写法
    //public 访问修饰符 控制程序其他部分对这段代码的访问级别
    //关键字class表明Java程序全部的内容都包含在类中
    //关键字class后边紧跟类名，类名应该大写

    //类常量可以在一个类的多个方法中使用， 可使用关键字static final设置一个类常量。
    //声明为public可以为其他类使用
    public static final double CM_PER_INCH = 2.54;


    //因为程序在执行main方法的时候没有创建任何对象，因此只有通过类名来访问,所以必须为static
    //非静态成员方法/变量都是必须依赖具体的对象才能够被调用
    public static void main(String[] args) {

        /*
        Java虚拟机总是从指定类中的main()方法的代码开始执行 必须声明为public
        .代表函数调用
        Java中每个句子都以;结束
        双引号界定字符串
        Java中得方法可以没有参数，但是必须有()；
        */

        //“即使没有显示地使用static关键字，构造器实际上也是静态方法“

        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("paper size in centimeters；" + paperWidth * CM_PER_INCH + "by" + paperHeight * CM_PER_INCH);

        /**
         *变量
         */
        int vacationDays;
        vacationDays = 12;
        double salary = 6500.00;
        System.out.println(salary);
        double x = 3333.33333;
        //会打印一个前导的空格和7个字符；
        System.out.printf("%8.2f", x);

        //在java中每一个变量都有一个类型；
        //声明一个变量后， 需要用赋值语句对其进行显式初始化；


        //静态类中只能包含包含静态成员（字段属性、方法）
        changLiang1();
        ziChuan();
        pinJie();
        pinJie2();
        join();
        jianCe();
        kongChuan();
        Kong();
        builder();
        block();



        //静态方法无法直接调用非静态方法
        //在静态方法中引用同一个类内部的非静态方法，需要先将该类实例化为一个对象（创建实例对象），再通过对象去引用这个非静态的方法。

        Application application = new Application();
        //对象变量引用了一个对象！！！！
        /**
         * new的是Application()这个构造器！！！
         * 对象变量只是引用了一个对象，并没有实际包含一个对象，它只是一个引用对象！！！！！！可以看作对象指针！
         * 在java中，任何对象变量的值都是对存储在另外一个地方的某个对象的引用！！！！！
         * new操作符的返回值也是一个引用！！！！
         * 可以显示的将对象变量设置为null  application = null
         */

        /**
         * 所有的Java对象都存储在堆中，当一个对象包含另一个对象变量时，他只是包含着另一个堆对象的指针。
         */

        application.changLiang();


        //内部类对象的创建
        //引用类内部的非静态类  采用内部类的引用方式.
        /*
        定义了成员内部类后，必须使用外部类对象来创建内部类对象，而不能直接去 new 一个内部类对象，
        即：内部类 对象名 = 外部类对象.new 内部类( );来创建内部类对象
         */
        Application application1 = new Application();
        NotStatic notStatic1 = application1.new NotStatic();
        notStatic1.changLiang();


        //main()方法调用外部非静态类的非静态方法，需先将类实例化一个对象再去引用。
        NotStatic2 notStatic = new NotStatic2();
        notStatic.changLiang1();




    }


    /**
     * 常量
     */
    //在Java中，利用该关键字final指示常量
    //常量的名字使用纯大写

        public void changLiang() {
            final double CM_PER_INCH = 2.54;
            //final关键字只能被赋值一次，赋值后不能修改；常量名使用全大写
            double paperWidth = 8.5;
            double paperHeight = 11;
            System.out.println("paper size in centimeters；" + paperWidth * CM_PER_INCH + "by" + paperHeight * CM_PER_INCH);
            System.out.println("正常引用非静态方法");
        }

        public static void changLiang1() {
            final double CM_PER_INCH = 2.54;
            //final关键字只能被赋值一次，赋值后不能修改；常量名使用全大写
            double paperWidth = 8.5;
            double paperHeight = 11;
            System.out.println("paper size in centimeters；" + paperWidth * CM_PER_INCH + "by" + paperHeight * CM_PER_INCH);
            System.out.println("正常引用静态方法");
        }


        //这种方式 如何去引用。
        //静态类里面必须只能有静态方法。
        public class NotStatic{
            public void changLiang() {
                final double CM_PER_INCH = 2.54;
                //final关键字只能被赋值一次，赋值后不能修改；常量名使用全大写
                double paperWidth = 8.5;
                double paperHeight = 11;
                System.out.println("paper size in centimeters；" + paperWidth * CM_PER_INCH + "by" + paperHeight * CM_PER_INCH);
                System.out.println("正常引用非静态方法");
            }
        }



    //强制类型转化


    //枚举类型


    /**
     * 字符串
     */
    //java内部没有内置的字符串类型，类库中提供了预定义类String；
    public static void ziChuan() {
        String e = "";
        String greeting = "ceshi";
        //子串
        //String类的substring方法可以从一个较大的字符串，提取出一个子串；
        //String最后的一个位置，不包含在内；
        String s = greeting.substring(0, 2);
        System.out.println("s:" + s);
    }

    //拼接
    //java语言，允许使用+号拼接两个字符串
    public static void pinJie() {
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        System.out.println(message);
    }

    //当一个字符串与一个非空字符串进行拼接时，后者会转换成字符串
    public static void pinJie2() {
        int age = 13;
        String rating = "PG" + age;
        System.out.println(rating);
        System.out.println("输出语句：" + rating);
    }

    //如果需要将多个字符串放在一起，用一个界定符分隔，可以采用静态join方法；
    public static void join() {
        String all = String.join("/", "s", "m");
        System.out.println(all);
    }

    //java中不能修改字符串中的单个字符
    //检测字符串是否相等
    public static void jianCe() {
        String s = "hello";
        String t = "greeting";
        if (s.equals(t)) {
            System.out.println("相等");
        }
        if ("hello".equals(s)) {
            System.out.println("s:" + s);
        }
    }
    //不能用==检测两个字符串是否相等！这个运算符只能确定两个字符串是否存在一个位置上；判断的是地址的指针

    //空字符串与NULL串
    //空串是长度为0的字符串，
    //空串是一个Java对象有自己的串长度（0）和内容（空）；
    public static boolean kongChuan() {
        boolean t = true;
        String s = "";
        if (s.length() == 0 || s.equals("")) {
            return t;
        }
        return false;
    }
    //String变量还可以存null这个特殊的值，标识目前没有任何对象与该变量关联；
    //检查一个字符串的方式如下;

    public static void Kong() {
        String str = null;
        if (str == null) {
            System.out.println("是个空字符串");
        } else if (str != null && str.length() != 0) {
            System.out.println("str不为空！");
        }
        System.out.println("判断失败！");
    }

    //构建字符串 StringBuilder类；
    public static String builder() {
        StringBuilder builder = new StringBuilder();
        String ch = "hello";
        String str = "java";
        builder.append(ch);
        builder.append(str);
        String completedString = builder.toString();
        System.out.println("输出字符串：" + completedString);

        System.out.printf("%tc", new Date());
        //System.out.println("%tc", new Date());无法输出
        return completedString;
    }

    //静态的String.format方法可以创建一个格式化的字符串，而不用打印输出
    String message = String.format("Hello,%s. Next year,you'll be %d ,name,age");


    /**
     * 块作用域与控制结构
     */
    //块是指有若干条Java语句组成的语句，并用一对大括号括起来。
    //块决定了变量的作用域
    public static void block() {
        int n;
        {
            int k;
            //int n; ERROR--不能在嵌套的两个块中声明同名的变量。
        }
        //Java语句中 条件语句 if(condition) statement1 else statement2
        //else子句与最邻近

        //if(){}else if{}else;
        //先将异常值进行判断，对异常进行处理，再进行主体代码的运行
        int yourSales = 1000;
        //java 新建参数要进行赋值初始化吗？？
        //声明一个变量之后，必须用赋值语句对变量进行显示的初始化；不可使用未初始化的变量值；
        int target;
        target = 20;
        String performance;
        int bonus = 0;
        if (yourSales >= 2 * target) {
            performance = "Excellent";
            bonus = 1000;
            System.out.println(performance + bonus);
        } else if (yourSales >= 1.5 * target) {
            performance = "Fine";
            bonus = 500;
            System.out.println(performance + bonus);
        } else if (yourSales >= target) {
            performance = "Staisfactory";
            bonus = 100;
            System.out.println(performance + bonus);
        } else {
            performance = "";
            System.out.println("your qre fired,performance:" + performance);
        }

        int balance = 10;
        int goal = 2000;
        int payment = 1;
        int interestRate = 110;

        int year = 0;
        while (balance < goal) {
            balance += payment;
            //balance=balance+payment
            double interest = balance + interestRate / 100;
            balance += interest;
            System.out.println("balance:" + balance);
            year++;
        }
        System.out.println(year + "year.");

        {
            balance = 10;
            do {
                balance += payment;
                //balance=balance+payment
                double interest = balance + interestRate / 100;
                balance += interest;
                System.out.println("balance:" + balance);
                year++;
                System.out.println(year + "year.");
            } while (balance < goal);
        }
    }
}

//静态类里面必须只能有静态方法。
//每个编译单元（文件）都只能有一个public类。即每个编译单元都有单一的公共接口，用public类实现。此时，mian()就必须要包含在public类中。
//一个类文件里，只能有一个public类。public类类名必须与文件名一致，
class NotStatic2{
    public void changLiang1() {
        final double CM_PER_INCH = 2.54;
        //final关键字只能被赋值一次，赋值后不能修改；常量名使用全大写
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("paper size in centimeters；" + paperWidth * CM_PER_INCH + "by" + paperHeight * CM_PER_INCH);
        System.out.println("正常引用非静态方法");
    }
}

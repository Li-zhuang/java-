package org.com.chapter3;

import java.util.Arrays;

public class ShuZu<smallPrimes> {

    public static void main(String[] args){

        /**
         * 声明数组
         */
        //存储同一类型的值的集合，通过一个整型下标可以访问数组中的每一个值a[i]；
        //在声明变量时，需要指出数组类型（数组元素类型紧跟[]）和数组变量的名字。int[] a;
        //int[] a; int a[];
        //但是这条语句只声明了变量a；但是并没有将a初始化为一个真正的数组，应该使用new操作符创建数组。
        int[] a = new int[100];
//      var c = new int[100];
        //声明并初始化了一个可以存储100个整数的数组。
        //数组长度不要求是必须是常量；new int[n];会创建一个长度为n的数组。

    /*
    一旦创建了数组，就不能再改变它的长度。
    如果程序运行中需要经常扩充数组的大小，应该选用另一种数据结构——数组列表（array list)
     */
      //java中提供了一种创建数组对象并同时提供初始值的简写形式。 不需要使用new，以及指定长度。

        int[] smallPrimes = {1,2,3,4,5};
        //
        //    另外可以声明一个匿名数组； new int[] {1,2,3,4};

        //    smallPrime = new int[] {1,2,3,4};

        //    上述语句的简写形式
        int smallPrime2[] = new int[5];
        int[] annoymous = {1,2,3,4,5};
        smallPrime2 = annoymous;


        /**
         * 访问数组元素
         */

        //一旦创建了数组，就可以在数组中填入元素
        int[] b = new int[100];
        for(int i=0;i<100;i++)
            a[i] = i;

        //创建一个数字数组时，所有元素都初始化为0；boolean数组的元素会初始化为false。
        //对象数组的元素初始化为一个特殊值null，表示这些元素（还）未存放任何对象。

        String[] names = new String[10]; //所有字符串都为null。
        //会创建一个包含10个字符串的数组，所有字符串都为null。
        //如果希望这个数组空串，必须为元素指定空串。
        for (int i=0;i<=10;i++) names[i]="";

        //要想获得数组中的元素个数，可以使用array.length。
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        /**
         *  for each 循环
         */

        //一种功能很强的循环结构，可以用来依次处理数组（或者其他元素集合）中的每个元素，而不必考虑指定下标值。
        //被称为增强的for循环的语句格式： for(variable:collection) statement;
        //它定义一个变量用于暂存集合中的每一个元素，并执行相应的语句。collection这一集合表达式必须是一个数组或者是实现了Iterable接口的类对象。

        for(int element :a)
            System.out.println(element);
        //打印数组a中的每一个元素，一个元素占一行；

        //for each 循环语句的循环变量将遍历数组中的每个元素，而不是下标值。

        //更加简单打印数组中所有值的方法，调用Arrays.toString(a),返回一个包含数组元素的字符串，这些元素包围在中括号内，并用逗号分隔。

        int n = 0;
        //类里定义的数据成员称为属性，属性可不赋初值，若不赋初值，java会为其添上默认值；以final修饰的成员变量。必须显性的初始化赋值。
        //方法里定义的数据成员称为变量，变量在参与运算之前必须赋初值。参数传递的形参变量不需进行初始化。
        int[] e = new int[0];
        //数组必须进行初始化吗
        System.out.println(Arrays.toString(e));


    }
    public static void weiChuShiHua(){
        //定义并初始化nums 数组
        int[] nums = new int[]{3, 5, 20, 12};
        //定义一个 prices 数组变量
        int[] prices;
        //让 prices数组指向 nums 所引用的数组
        prices = nums;
        for (int i = 0 ; i < prices.length ; i++ )
        {
            System.out.println(prices[i]);
        }
        //将 prices数组的第 3个元素赋值为34
        prices[2] = 34;
        //访问 nums数组的第3个元素，将看到输出34
        System.out.println("nums数组的第 3个元素的值是：" + nums[2]);
    }

    public static void copy() {
        //数组拷贝
        //在java中，允许将一个数组变量拷贝到另一个数组变量。这时，两个变量将引用同一个数组；
        int[] smallPrimes = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[5] = 12;
        //如果希望数将一个组的所有值拷贝到一个新的数组中去，就的要使用Arrays类copyOf方法。
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        //第2个参数是新数组的长度。这个方法通常用来增加数组的长度。
        luckyNumbers = Arrays.copyOf(luckyNumbers,2*luckyNumbers.length);
        //如果数组元素是数值型，那么额外的元素将会被赋值为0；如果数值是布尔型，则将赋值为false。
        //相反，如果长度小于原始数组的长度，则只拷贝前边的值。



    }







}

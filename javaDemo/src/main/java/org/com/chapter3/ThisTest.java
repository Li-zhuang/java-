package org.com.chapter3;

public class ThisTest {
    static int value = 33;

    public static void main(String[] args) throws Exception {
        new ThisTest().printValue();
    }

    //this指当前这个对象
    //方法引用 this指向正在执行方法的类的实例(当前对象)。
    //静态方法不能使用this关键字，因为静态方法不属于类的实例，所以this也就没有什么东西去指向
    private void printValue() {
        int value = 3;
        System.out.println(this.value);
    }
}

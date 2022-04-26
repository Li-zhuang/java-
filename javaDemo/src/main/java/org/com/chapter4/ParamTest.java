package org.com.chapter4;

public class ParamTest {
    public static void main(String[] args) {

        System.out.println("Testing tripleValue:");
        double percent = 10.0;
        System.out.println("Before percent:"+percent);
        tripleValue(percent);
        System.out.println("After: percent："+percent);

        System.out.println("\nTesting tripleSalary");
        Employee5 harry = new Employee5("Harry",5000);


        // 非静态的内部类 必须使用外部类对象引用内部类对象
        ParamTest paramTest = new ParamTest();
        Employee harry1 = paramTest.new Employee("Harry",5000);


        System.out.println("Before salary:"+ harry.getSalary());
        tripleSalary(harry);
        System.out.println("After salary:"+ harry.getSalary());


    }

    public static void tripleValue(double x){
        x = 3 * 3;
        System.out.println("End of method:"+x);
    }

    //静态的方法 这样调用不需要实例化吗

    public static void tripleSalary(Employee5 x) {
        x.raiseSalary(200);
        System.out.println("End of method:" + x.getSalary());
    }

    public static void swap(Employee x,Employee y){
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of methond:"+x.getName());
        System.out.println("End of method:"+y.getName());
    }
    class Employee{

        private String name;
        private double salary;

        public Employee(String n,double s){
            name = n;
            salary = s;
        }
        public String getName(){
            return name;
        }
        public double getSalary(){
            return salary;
        }
        public void raiseSalary(double byPercent){

            double raise = salary* byPercent;
            salary +=raise;
        }
    }

}

class Employee5{

    private String name;
    private double salary;

    public Employee5(String n,double s){
        name = n;
        salary = s;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void raiseSalary(double byPercent){

        double raise = salary* byPercent;
        salary +=raise;
    }
}

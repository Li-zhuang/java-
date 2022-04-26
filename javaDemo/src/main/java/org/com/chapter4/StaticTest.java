package org.com.chapter4;

public class StaticTest {

    public static void main(String[] args) {


        Employee3[] staff = new Employee3[3];
        //用var为什么会报红
        //var staff = new Employee3[3];

        staff[0] = new Employee3("Tom", 40000);
        staff[1] = new Employee3("Dick",60000);
        staff[2] = new Employee3("Harry",65000);

        for(Employee3 e : staff){
            e.setId();
            System.out.println("name:"+e.getName()+",id:"+e.getId()+",salary:"+e.getSalary());
        }

        int n =Employee3.getNextId();
        System.out.println("next available id:"+n);

    }
}
class Employee3{

        private static int nextId = 1;

        private String name;
        private double salary;
        private int id;

        //构造方法可以用来变量初始化
        public Employee3(String n, double s){
            name = n;
            salary = s;
            id = 0;
        }

        public String getName(){
            return name;
        }
        public double getSalary(){
            return salary;
        }
        public int getId(){
            return id;
        }
        public void setId(){
            id = nextId;
        //定义了一个静态变量，不需要进行实例化便可计算。
            nextId++;
        }

        public static int getNextId(){
            return nextId;
        }

        //该类也可以有一个main方法，可用于单元测试。
        public static void main(String[] args){
            Employee3 e = new Employee3("Harry",50000);
            System.out.println(e.getName()+" "+e.getSalary());
        }


}


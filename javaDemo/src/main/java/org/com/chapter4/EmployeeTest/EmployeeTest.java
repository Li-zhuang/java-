package org.com.chapter4.EmployeeTest;

import java.time.*;


public class EmployeeTest {
    public static void main(String[] args) {
        //创建一个数组
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tony Tester",40000,1990,3,15);

        //增强for循环
        for(Employee e :staff)
            e.raiseSalary(5);
        for(Employee e : staff)
            System.out.println("name=" + e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
    }
}

class Employee{
    //java中最简单的类定义形式
    private String name;
    private  double salary;
    private LocalDate hireDay;


    //构造器 首字母大写 没有返回类型 可传参 构造器可以有任何的访问权限修饰符
    public Employee(String n,double s,int year,int month,int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    //构建get方法
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary += raise;
    }

}



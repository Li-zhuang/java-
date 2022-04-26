package org.com.chapter4;


import java.time.*;

public class CalendarTest {
    /**
     * @version
     * @author
     */
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        //构造一个表示当前日期的对象；获得当前日期；
        int month = date.getMonthValue();
        //先去取值保存；
        int today = date.getDayOfMonth();
        //得到当前日期的年月日；

        date = date.minusDays(today-1);
        //生成当前日期之后或之前n天的日期；
        DayOfWeek weekday = date.getDayOfWeek();
        //获得当前日期是星期几；
        int value= weekday.getValue();
        //1=monday

        System.out.println("");

        for(int i=1; i<value; i++)
            System.out.println(" ");
        while(date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today)
                System.out.println("*");
                else
                    System.out.println("");
                date= date.plusDays(1);
                if(date.getDayOfWeek().getValue()!=1) System.out.println();
                //不等于的写法
        }
        if(date.getDayOfWeek().getValue()!=1) System.out.println();
    }
}

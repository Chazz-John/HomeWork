package com.chazz.localTime;

import com.sun.glass.ui.Pixels.Format;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTime {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();//静态方法，根据当前时间创建对象
        System.out.println(now);
        LocalDate of = LocalDate.of(2020, 9, 17);//静态方法，根据指定日期、时间创建对象
        System.out.println(of);
        LocalDate parse = LocalDate.parse("2020-09-17");//静态方法，通过字符串指定日期
        System.out.println(parse);

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate.getYear()); //2020
        System.out.println(currentDate.getMonth()); // SEPTEMBER
        System.out.println(currentDate.getMonthValue()); //9
        System.out.println(currentDate.getDayOfYear()); //261
        System.out.println(currentDate.getDayOfMonth()); //17
        System.out.println(currentDate.getDayOfWeek());//THURSDAY

        LocalDate date1 = LocalDate.of(2020, 9, 16);
        LocalDate date2 = LocalDate.of(2020, 9, 17);
        System.out.println(date1.isBefore(date2)); //true
        System.out.println(date1.isAfter(date2)); //false
        System.out.println(date1.equals(date2)); //false
        System.out.println(date1.isLeapYear()); //true

        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);  //2020-09-017
        System.out.println(nowDate.plusDays(1)); //2020-09-018
        System.out.println(nowDate.plusWeeks(1)); //2020-09-24
        System.out.println(nowDate.plusMonths(1)); //2020-10-17
        System.out.println(nowDate.plusYears(1)); //2021-09-17
        //减法为：minus

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant.toString()); // 2020-09-16T19:10:33.946Z
        System.out.println(nowInstant.toEpochMilli()); // 毫秒数， 1600283433946


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 1. 日期时间转化为字符串。有两种方式
        String format = dtf.format(LocalDateTime.now());
        System.out.println(format); // 2020-09-17 03:13:48
        String format1 = LocalDateTime.now().format(dtf); //实际上调用的也是 DateTimeFormatter 类的format方法
        System.out.println(format1); // 2020-09-17 03:13:48

        // 2. 字符串转化为日期。有两种方式，需要注意，月和日位数要补全两位
        //第一种方式用的是，DateTimeFormatter.ISO_LOCAL_DATE_TIME ，格式如下
        LocalDateTime parsLocalDateTime = LocalDateTime.parse("2020-09-17T00:00:00");
        System.out.println(parsLocalDateTime); // 2020-09-17T00:00
        //第二种方式可以自定义格式
        LocalDateTime parse1 = LocalDateTime.parse("2020-09-17 00:00:00", dtf);
        System.out.println(parse1); // 2020-09-17T00:00
    }
}

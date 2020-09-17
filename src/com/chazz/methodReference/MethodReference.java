package com.chazz.methodReference;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        //创建一个数组，通过循环添加5个值
        List<Integer> list = new ArrayList<> ();
        for (int i = 1; i < 6; i++) {
          list.add(i);
        }

        //常规for循环输出
        for (Integer i : list) {
            System.out.println(i);
        }

        //forEach+lambda写法
        list.forEach((i)->System.out.println(i));

        //通过::打印输出
        list.forEach(System.out::println);
    }
}

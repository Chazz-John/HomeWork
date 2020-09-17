package com.chazz.staticMethod;

public interface StaticInterface {

    static void Method() {
        System.out.println("我是接口的静态方法！");
    }

}

class Main {
    //不能通过实现类的实例化对象去调用接口的静态方法。
    public static void main(String[] args) {
        StaticInterface.Method();
    }
}
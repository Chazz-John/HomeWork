package com.chazz.defaultMethod;

public interface Animal {

    //定义一个“吃”的方法，具体吃什么，子类去实现
    void eat();

    default void run() {
        System.out.println("我能跑！");
    }

    default void fly() {
        System.out.println("我能飞！");
    }
}

class Cat implements Animal {

    @Override
    public void run() {
        System.out.println("我跑得快");
    }

    @Override
    public void eat() {//定义猫实现动物接口，实现“吃”方法
        System.out.print("猫:我吃鱼,");
    }

}

class Bird implements Animal {//定义鸟实现动物接口，实现“吃”方法

    @Override
    public void eat() {
        System.out.print("鸟:我吃虫,");
    }

    @Override
    public void fly() {
        System.out.println("我飞得高");
    }

}

//意义：能够提高代码的重用性，并且可以在不影响原来的继承体系的情况下，进行功能的拓展，实现接口的向下兼容
class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.fly();
        Cat cat = new Cat();
        cat.eat();
        cat.run();
    }
}
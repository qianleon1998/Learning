package com.company.Demo05Thread;
/*
    主线程：执行主方法的线程

    单线程的程序：java程序中只有一个线程
    执行从main方法开始，从上到下依次执行

 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();

        Person p2  = new Person("旺财");
        p2.run();
    }
}

package com.company.demo06.Thread.demo01.getName;
/*
    获取线程的名称
        1.使用Thread类中的方法getName()
            String getName() 返回线程的名称
        2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
            static Thread currentThread() 返回当前正在执行的的线程对象的引用。
 */
//定义一个Thread类的之类
public class MyThread extends Thread{
    //重写run方法
    public void run(){
        //获取线程名称
//        String name = getName();
//        System.out.println(name);
//
//        Thread t = Thread.currentThread();
//        System.out.println(t);//Thread[Thread-1,5,main]
//
//        String name = t.getName();
//        System.out.println(name);//Thread-0
        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}

package com.company.demo06.Thread.demo09.Lock;

/*
    模拟卖票案例
    创建三个线程，同时开启，对共享的票出售
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象，创建了一个实现类，让三个线程来实现就确保票就一百张
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start方法
        t0.start();
        t1.start();
        t2.start();



    }
}

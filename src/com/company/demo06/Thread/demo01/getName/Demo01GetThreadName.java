package com.company.demo06.Thread.demo01.getName;
/*
    线程的名称：
        主线程：main
        新线程：Thread-0，Thread-1.....
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt = new MyThread();
        //调用start方法，开启新线程，执行run方法
        mt.start();

        new MyThread().start();
        //获取主线程的名称，不能直接用getname因为当前测试类没有继承Thread类，所以要先用currentThread，再用getname
        System.out.println(Thread.currentThread().getName());
    }

}

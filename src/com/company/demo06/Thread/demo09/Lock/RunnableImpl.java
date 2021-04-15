package com.company.demo06.Thread.demo09.Lock;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    实现卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的第三种方案：使用lock锁
    Lock接口的方法：
        void lock（）获取锁
        void unlock() 释放锁


    使用步骤：
        1.在成员位置创建一个ReentrantLock对象
        2.在可能出现安全问题的代码前调用Lock接口的方法Lock获取锁
        3.在可能出现安全问题的代码后调用lock接口中的方法unlock释放锁
 */
public class RunnableImpl implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //1.在成员位置创建一个Ree+ntrantLock对象
    Lock l = new ReentrantLock();

    //设置线程任务：卖票
    public void run(){
        //使用死循环，让卖票动作重复执行
        while(true){
            //2.在可能出现安全问题的代码前调用Lock接口的方法Lock获取锁
            l.lock();
            //先判断ticket是否存在
            if(ticket>0){
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                    //票存在，卖票 ticket--
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //3.在可能出现安全问题的代码后调用lock接口中的方法unlock释放锁
                    l.unlock();//无论程序是否异常，都会把锁释放
                }


            }

        }
    }

/*    //设置线程任务：卖票
    public void run(){
        //使用死循环，让卖票动作重复执行
        while(true){
            //2.在可能出现安全问题的代码前调用Lock接口的方法Lock获取锁
            l.lock();
            //先判断ticket是否存在
            if(ticket>0){
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //票存在，卖票 ticket--
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
        }
    //3.在可能出现安全问题的代码后调用lock接口中的方法unlock释放锁
            l.unlock();
        }
    }*/
}

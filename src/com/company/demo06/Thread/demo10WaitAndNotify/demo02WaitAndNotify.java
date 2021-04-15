package com.company.demo06.Thread.demo10WaitAndNotify;
/*
    进入到TimeWaiting（记时等待）有两种方式
    1.使用sleep（Long m）方法，在毫秒值结束之后，进程睡醒进入到Runnable/Blocked状态
    2.使用wait（Long m）方法，wait方法在毫秒值结束之后，还没有被Notify唤醒，就会自动醒来，线程睡醒进入到Runnable/Blocked状态


    唤醒的方法：
        void notify（）唤醒在此对象监视器上等待的单个线程
        void notifyAll() 唤醒在此对象监视器上等待的所有线程
 */
public class demo02WaitAndNotify {
    public static void main(String[] args) {
        //创建一个锁对象，保证唯一
        Object obj = new Object();
        //创建一个顾客线程（消费者）
        new Thread(){
            public void run(){
                //一直等着买包子
                while(true){
                    //保证等待和唤醒的线程只能有一个在执行
                    synchronized (obj){
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，顾客1开吃");
                        System.out.println("-----------------");
                    }
                }
            }

        }.start();

        //创建一个顾客线程（消费者）
        new Thread(){
            public void run(){
                //一直等着买包子
                while(true){
                    //保证等待和唤醒的线程只能有一个在执行
                    synchronized (obj){
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，顾客2开吃");
                        System.out.println("-----------------");
                    }
                }
            }

        }.start();

        //创建老板线程
        new Thread(){
            public  void run(){
                //一直做包子
                while(true){
                    //花5秒钟做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //保证等待和唤醒的线程只能有一个在执行
                    synchronized (obj){
                        System.out.println("老板5秒之后做好包子，告知顾客可以吃包子");
                       // obj.notify();
                        obj.notifyAll();
                    }
                }
            }

        }.start();
    }
}

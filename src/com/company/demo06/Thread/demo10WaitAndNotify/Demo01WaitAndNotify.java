package com.company.demo06.Thread.demo10WaitAndNotify;
/*
    等待唤醒案例：线程之间的通信
        创建一个顾客线程（消费者）：告知老板要的包子的种类和数量，调用wait方法，放弃cpu的执行，进入WAITING状态（无限等待）
        创建一个老板线程（生产者）：花了5秒做包子，做好包子之后，调用notify方法，唤醒顾客吃包子

    注意：
        1.顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒，只能有一个在执行
        同步使用的锁对象必须保证是唯一，
        只有锁对象才能调用wait和notify方法
 */
public class Demo01WaitAndNotify {
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
                        System.out.println("告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，开吃");
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
                       obj.notify();
                   }
               }
            }

        }.start();

    }
}

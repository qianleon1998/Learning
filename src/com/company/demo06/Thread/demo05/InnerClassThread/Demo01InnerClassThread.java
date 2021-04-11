package com.company.demo06.Thread.demo05.InnerClassThread;
/*
    匿名内部类方式创建线程
    匿名:没有名字
    内部类：写在其他类内部的类

    匿名内部类作用：简化代码
        把子类继承父类，重写父类的方法，创建子类对象一步完成
        把实现实现类接口，重写接口中的方法，创建实现类对象合成一步完成
   匿名内部类的最终产物：子类/实现类对象，而这个类没有名字

   格式：
        new 父类/接口（）{
            重复父类/接口中的方法
        }.start();//即可开启多线程
 */
public class Demo01InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        //new MyThread.start();以前
        new Thread(){
            //重写run方法，设置线程任务
            public void run(){
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        }.start();


        //线程的接口Runnable
        //Runnable r = new RunnableImpl();//多态
        Runnable r = new Runnable(){
            //重写run方法，设置线程任务
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"haha");
                }
            }
        };
        new Thread(r).start();
        //还可以简化
        new Thread(
                new Runnable(){
            //重写run方法，设置线程任务
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"hehe");
                }
            }
        }
        ).start();
    }
}

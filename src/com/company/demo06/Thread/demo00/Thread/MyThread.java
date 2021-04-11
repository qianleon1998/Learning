package com.company.demo06.Thread.demo00.Thread;

 //1.创建一个Thread类的子类
public class MyThread extends Thread {
    //2.重写Thread的run方法，设置线程任务（开启线程要干的事）
     public void run(){
         for (int i = 0; i < 20; i++) {
             System.out.println("run"+ i);
         }
     }

}

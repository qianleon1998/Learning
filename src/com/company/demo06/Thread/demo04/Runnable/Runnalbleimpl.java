package com.company.demo06.Thread.demo04.Runnable;
//1.创建Runnable接口的一个实现类
public class Runnalbleimpl implements Runnable{
   // 2.在实现类中重写Runnable的接口的run方法，设置线程任务
    public void run(){
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}

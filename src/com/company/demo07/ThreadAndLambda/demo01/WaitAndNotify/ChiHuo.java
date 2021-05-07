package com.company.demo07.ThreadAndLambda.demo01.WaitAndNotify;
/*
    消费者类：一个线程类，可以继承Thread
    设置线程任务（run）:吃包子
    对包子的状态进行判断
        false：没有，
            调用wait进入等待状态
         true：有
            消费
            吃完修改状态为false
            唤醒包子铺线程，生产

 */
public class ChiHuo extends Thread{
    //1.需要在成员位置创建一个包子变量
    private Baozi bz;
    //2.使用带参数的构造方法，为这个包子变量赋值
    public ChiHuo(Baozi bz) {
        this.bz = bz;
    }
    //设置线程任务（run）:生产包子


    //设置线程任务（run）:吃包子
    @Override
    public void run() {
        //使用死循环，让吃货一直吃包子
        while(true){
            //必须使用同步技术保证两个线程只能有一个在执行
            synchronized (bz){
                if(bz.flag==false){
                    //没有包子调用wait方法进入等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行的代码
                System.out.println("正在吃"+bz.pi+bz.xian+"的包子");
                //吃完修改状态：false
                bz.flag = false;
                //唤醒包子铺线程，生产
                bz.notify();
                System.out.println("已经吃完"+bz.pi+bz.xian+"包子铺开始生产");
                System.out.println("-----------------------------------");
            }
        }
    }
}

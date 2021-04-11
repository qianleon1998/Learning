package com.company.demo06.Thread.demo03.sleep.Demo01;
/*
    public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停
    毫秒数结束后，线程继续执行
 */
public class Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);
            //使用Thread类中的sleep方法让程序睡眠1秒钟，方法为静态可以直接调用
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

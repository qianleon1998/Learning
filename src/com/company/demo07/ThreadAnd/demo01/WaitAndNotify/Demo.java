package com.company.demo07.ThreadAnd.demo01.WaitAndNotify;
/*
    测试类：
        包含main方法，程序执行的入口，启动程序
        创建包子对象；
        创建包子铺线程，开启，生产包子
        创建吃货线程开启吃包子
 */
public class Demo {
    public static void main(String[] args) {
        //创建包子对象
        Baozi bz = new Baozi();
        //创建包子铺线程，开启生产包子
        new BaoZiPu(bz).start();
        //吃货线程，吃包子
        new ChiHuo(bz).start();
    }
}

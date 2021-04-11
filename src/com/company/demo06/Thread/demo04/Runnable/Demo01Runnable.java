package com.company.demo06.Thread.demo04.Runnable;
/*
    创建多线程程序的第二种方法：实现Runnable接口
    java.lang.Runnable
        Runnable 接口应该由打算通过某一线程执行其实例的类来实现，类必须定义为一个成为run的无参数方法
    java.lang.Thread类的构造方法
        Thread(Runnable target)分配新的Thread对象
        Thread(Runanlbe target,String name)分配新的Thread 对象


     实现步骤：
        1、创建一个Runnable接口的实现类
        2.在实现类中重写Runnable的接口的run方法，设置线程任务
        3、创建一个Runnable接口的实现类对象
        4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        5.调用Thread类中的start方法，开启新的线程执行run方法

        实现Runnable接口创建的多线程程序好处：
           1.避免了单继承的局限性
            一个类只能继承一个类（一个人只有一个父亲），类继承了Thread类就不能继承其他类
            实现了Runnable接口，还可以继承其他的类，实现其他接口

           2.增强了程序的扩展性，降低了程序的耦合性（解藕），传递不同的实现类，执行不同的任务
            实现Runnable接口的方式，把设置线程任务和开启新线程任务进行了分离（解耦）
            实现类中，重写了run方法，用来设置线程任务
            创建Thread类对象，调用Start方法，用来开启新线程

            （新的实现类重写新的run方法，传递新的实现类给Thread对象就可以执行新的run方法，）

 */
public class Demo01Runnable {
    public static void main(String[] args) {
        //    3、创建一个Runnable接口的实现类对象
        Runnalbleimpl run = new Runnalbleimpl();
        //4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t = new Thread(run);
        //5.调用Thread类中的start方法，开启新的线程执行run方法
        t.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }

}

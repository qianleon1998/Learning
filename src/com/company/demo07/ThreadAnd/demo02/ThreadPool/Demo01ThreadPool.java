package com.company.demo07.ThreadAnd.demo02.ThreadPool;
/*
    线程池：jdk1.5之后提供的
    java.util.concurrent.Executors：线程池的工厂类，用来生产线程池
    Executors类中的静态方法：
        static ExecutorService newFixedThreadPool(int nTreadd)创建一个可重用固定的线程数的线程池
        参数:
            int nThread:创建线程池中包含的线程数量
        返回值:
            ExecutorService接口，返回的是ExecutorService接口的实现类对象，可以使用ExecetorService接口接收（面向接口编程）
     java.util.concurrent.ExecutorsService:线程池接口
            用来从线程池中获取线程，调用start方法，执行线程任务
            submit(Runnable task)提交一个Runnable任务用于执行，并返回一个表示该任务的Future
      线程池的使用步骤：
        1.使用线程池的工厂类Executors里面提供的静态方法，newFixedThreadPool生产一个指定线程数量的线程池
        2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
        3.调用ExecutorService中的summit方法，传递线程任务（实现类），开启线程执行run方法
        4.调用ExecutorService中的shutdown方法,销毁线程池（不建议执行）
 */
public class Demo01ThreadPool {
}
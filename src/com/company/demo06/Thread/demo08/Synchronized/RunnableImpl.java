package com.company.demo06.Thread.demo08.Synchronized;
/*
    卖票案例出现的线程安全问题，卖出了不存在的票和重复的票
    解决线程安全的第二种方案：使用同步方法
    使用步骤：
        1，把访问了共享数据的代码抽取出来，放到一个方法中
        2.在方法上添加Synchronized修饰符

    格式：定义方法的格式
    修饰符 synchronized 返回值类型 方法名（参数列表）{
        可能会出现线程安全问题的代码（访问了共享数据的代码）
    }
 */
public class RunnableImpl implements Runnable{
    //定义一个多个线程共享的票源
    private static int ticket = 100;

    //设置线程任务：卖票
    public void run() {
        //使用死循环，让卖票动作重复执行
        while (true) {
            payTicket();
        }
    }
    /*
        定义一个同步方法
        同步方法也会把方法内部的代码锁住，只让一个线程执行
        同步方法的锁对象是实现类对象 new RunnableImpl（）
        也就是this
     */
    /*
        静态的同步方法
        锁对象是谁？
        不能是this
        this是创建对象之后产生的，静态方法优先于对象
        静态方法的锁对象是本类的class属性--》class文件对象（反射）
     */
    public static synchronized void payTicket(){
            //先判断ticket是否存在
            if(ticket>0){
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //票存在，卖票 ticket--
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
            }
        }

}

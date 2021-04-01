package com.company;

import java.io.FileNotFoundException;

/*
      throws关键字：异常处理的第一种方式，交给别人处理
      作用：
        当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对象
        可以使用throws关键字处理对象，会把异常对象声明抛出方法的调用者处理（自己不处理，交给别人处理），最终交给jvm处理，中断处理
      使用格式：在方法声明时处理
        修饰符 返回值类型 方法名（参数列表）throws{
        throw new AAAException("产生原因");
        throw new BBBException("产生原因");
        }
       注意:
       1.throws关键字必须写在声明处
       2.throws关键字后边声明的异常必须时Exception或者是其子类
       3.方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常
        如果抛出的多个异常对象有子父类异常，直接声明父类异常即可
       4.调用了一个声明抛出异常的方法，必须处理声明的异常
        要么继续使用throws声明抛出，交给方法的调用者处理，最终交给jvm处理
        要么try。。。。catch自己处理异常
 */
public class Demo05Throws {
    public static void main(String[] args) {
        readFile("c:\\a.txt");
    }
    /*
    定义一个方法，对传递的文件路径进行合法判断
    如果路径不是“c:\\a.txt”,那么就抛出文件找不到异常，告知方法调用者
    注意：
        FileNotFoundException是编译异常，抛出了编译异常，就必须处理这个异常
        可以使用throws继续声明抛出FileNotFoundException这个异常对象，让这个方法的调用者处理(方法名后面的throws。。。)
     */
    public static  void readFile(String fileName) throws FileNotFoundException{
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }
    }


}

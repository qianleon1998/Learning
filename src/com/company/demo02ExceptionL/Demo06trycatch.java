package com.company.demo02ExceptionL;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    throws处理异常，异常后面的代码不会运行，（交给了jvm执行了中断）
    try carch就会自己处理，异常后面还会继续运行

    格式：
        try{
            可能产生异常的代码；
        }catch(定义一个异常变量，用来接受try中抛出的异常对象){
            异常的处理逻辑，异常对象之后怎么处理异常
            一般在工作中，会把异常的信息记录到一个日志中
        }
        ...
        catch(异常类名 变量名){

        }

     注意：
        1，try中可能会抛出多个异常对象，可以使用多个catch来处理这些异常对象
        2，如果try中产生了异常，就执行catch中的异常处理逻辑，执行完毕catch中的逻辑，继续执行try。。catch后的代码
           如果没有产生异常，那就不会执行catch异常中的处理逻辑，只执行try中代码，然后继续执行后面代码
 */
public class Demo06trycatch {

    public static void main(String[] args) {
        try{
            //可能产生异常的代码
            readFile("c:\\a.tx");
        }catch(IOException e){
            //try中抛出什么异常对象，catch就定义什么异常变量，用来接受异常对象
            //System.out.println("catch - 传递的文件后缀不是.txt");

            /*
            Throwable类中定义了3个异常处理方法
            String getMessage() 返回次throwable的简短描述
            String toString()   返回此throwable的详细消息字符串
            void printStackTrace()  jvm打印异常对象，默认此方法，打印的异常是最全面的
         */
            System.out.println(e.getMessage());//文件的后缀名不对
            System.out.println(e.toString());//重写Object类的toString方法，打印的异常信息最全面的,java.io.IOException: 文件的后缀名不对
            System.out.println(e);//java.io.IOException: 文件的后缀名不对
            e.printStackTrace();
        }
        System.out.println("后续代码");/*java.io.IOException: 文件的后缀名不对
        at com.company.demo02ExceptionL.Demo06trycatch.readFile(Demo06trycatch.java:64)
        at com.company.demo02ExceptionL.Demo06trycatch.main(Demo06trycatch.java:32)
    */
    }



    /*
       如果传递的对象不是txt结尾
       抛出io异常，告知文件后缀名不对
        */
    public static  void readFile(String fileName) throws IOException{
//        if(!fileName.equals("c:\\a.txt")){
//            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
//        }

        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }

}

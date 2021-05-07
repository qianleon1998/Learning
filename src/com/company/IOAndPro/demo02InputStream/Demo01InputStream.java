package com.company.IOAndPro.demo02InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    Java.io.InputStream:字节输出流
    此抽象类是表示字节输出流的所有类的超类

    定义了所有子类的共性方法：
        int read()从输入流中读取数据下一个字节
        int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓存区数组b中
        void close（）关闭此输入流并释放与该流关联的所有系统资源

        java.io.FileInputStream entends InputStream
        FileInputStream:文件字节输入流
        作用:把硬盘文件中的数据，读取到内存中使用

        构造方法：
            FileInputStream(String name)
            FileInputStream(File file)
            参数：读取文件的数据源
                String name：文件的路径
                File file：文件
            构造方法的使用：
                1.会创建一个FileInputStream对象
                2.会把FileInputStream对象指定构造方法中要读取的文件
         读取数据的原理：java程序--》jvm--》os--》os读取数据的方法--》读取文件

         字节输入流的使用步骤（重点）：
            1.创建FIleInputStream对象，构造方法中绑定要读取的数据源
            2.使用FileInputSream对象中的方法read，读取文件
            3.释放资源

* */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FIleInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\iedaIU\\Learning\\src\\com\\company\\IOAndPro\\demo01OutputStream\\a.txt");
        //2.使用FileInputSream对象中的方法read，读取文件
        /*int len  = fis.read();
        System.out.println(len);//此方法会像指针一样读完往后走

        int len1  = fis.read();
        System.out.println(len1);

        int len2  = fis.read();
        System.out.println(len2);*/

        /*
        发现以上读取文件是一个重复的过程，使用循环
        不知道循环次数用while，知道用for

        * */
        int len = 0;//记录读取到的字节
        while((len = fis.read())!=-1){//固定写法
            System.out.print((char)len);
        }
        //下面写法是错，判断一遍后指针指向后面，判断a，读到b
       /* while (fis.read()!=-1){
            System.out.println((fis.read()));
        }*/

        //3.释放资源
        fis.close();
    }
}

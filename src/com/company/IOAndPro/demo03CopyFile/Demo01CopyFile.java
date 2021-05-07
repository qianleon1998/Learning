package com.company.IOAndPro.demo03CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制练习

   步骤：
    1.创建一个字节输入流，构造方法中绑定读取的数据源
    2.创建一个字节输出流，构造方法中绑定要写入的目的地
    3.使用字节输入流对象中的方法read读取文件
    4.使用字节输出流中的方法write，把读取到的文件写入到目的地文件中
    5.释放资源

* */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\qianl\\Pictures\\Camera Roll\\1.png");
        FileOutputStream fos = new FileOutputStream("D:\\图片\\1.png");
        //一次读取一个字节写入一个字节的方式
        /*int len = 0;
        while ((len = fis.read())!=-1){
            fos.write(len);
        }*/

        //使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

      //资源释放，先关闭写的，后关闭读的
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(e-s)+"毫秒");
    }
}

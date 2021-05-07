package com.company.IOAndPro.Demo04Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    java.io.Reader:字符输入流，是字符输入流的最顶层的父类，定义了一些共性的成员方法，是一个抽象类，无法直接使用，使用子类


    共享的成员方法：
         int read() 读取单个字符。
         int read(char[] cbuf) 将字符读入数组。
         abstract  void close() 关闭该流并释放与之关联的所有资源。


     java.io.FileReader extends InputStreamReader extends Reader
     FileReader:文件字符输入流
     作用：把硬盘文件中的数据以字符的方式读取到内存中

     构造方法：
        FileReader(String fileName)
        FileReader(File file)
        参数：读取文件的数据源
            String fileName:文件的路劲
            File file:一个文件
         FileReader构造方法的作用
            1.创建一个FileReader对象
            2.会把FileReader对象指向要读取的文件

     字符输入流使用步骤：
        1.创建FileReader对象，构造方法中绑定要读取的数据源
        2.使用FileReader对象中的方法read读取文件
        3.释放资源
* */
public class Demo02Reader {
    public static void main(String[] args) throws IOException{
        //1.创建FileReader对象，构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("D:\\iedaIU\\Learning\\src\\com\\company\\IOAndPro\\demo01OutputStream\\c.txt");
//        int len = 0;
//        while((len = fr.read())!=-1){
//            System.out.println((char)len);
//        }

        char[] cs = new char[102400];//存储读取到的多个字符
        int len = 0;//记录每次读取的有效字符个数
        while ((len = fr.read())!=-1){
            System.out.println(new String(cs,0,len));
        }


        fr.close();
    }
}

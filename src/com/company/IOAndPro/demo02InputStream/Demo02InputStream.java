package com.company.IOAndPro.demo02InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
字节输入流一次读取多个字节的方法
    int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓存区数组b中
    须知：
      1.byte[]的作用
        起到缓冲作用，存储每次读取到的多个字节
        数组长度一般定义为1024个字节（1kb）或者1024的整数倍
      2.返回值int是什么
        每次读取的有效字节
* */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        //创建FileInputStream对象，构造方法中绑定要读取的数据
        FileInputStream fis = new FileInputStream("D:\\iedaIU\\Learning\\src\\com\\company\\IOAndPro\\demo01OutputStream\\a.txt");
        //使用FileInputSream对象中的方法read读取文件
        //字节输入流一次读取多个字节的方法
        //    int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓存区数组b中
        /*byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);//2,有效读取字节的个数，bytes数组最开始默认为0，后来被读取的字节覆盖
        //System.out.println(Arrays.toString(bytes));//[97, 98]
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);//2
        System.out.println(new String(bytes));//cd

        len = fis.read(bytes);
        System.out.println(len);//-1
        System.out.println(new String(bytes));//cd*/


        /*
            发现以上读取是重复代码，可以用循环while优化
        * */
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}

package com.company.IOAndPro.demo01OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
    一次写多个字节的方法：
        void write(byte[] b)
          将 b.length 个字节从指定的 byte 数组写入此输出流。
        void write(byte[] b, int off, int len)
          将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
* */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fos = new FileOutputStream("D:\\iedaIU\\Learning\\src\\com\\company\\IOAndPro\\demo01OutputStream\\b.txt");
        //调用FileOutputStream对象中的方法write,把数据写入到文件中
        //在文件中显示100，写入3个字节，1，0，0
        fos.write(49);
        fos.write(48);
        fos.write(48);
        /*
        public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流
        一次写多个字节：
            如果第一个字节是正数，那么显示就会查询ASCII表
            如果第一个字节是负数，第一个字节和第二个就会组成为中文显示，查询（GBK）
        * */
        byte[] bytes = {5,2,0};//ABCD
        fos.write(bytes);
/*
    void write(byte[] b, int off, int len)
          将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
* */
        fos.write(bytes,1,2);

        /*写入字符串的方法：
            可以使用String类中的方法把字符串，转换为字节数组

        * */
        byte[] byte2 = "你好".getBytes();
        System.out.println(Arrays.toString(byte2));//[-28, -67, -96, -27, -91, -67]
        fos.write(byte2);
        //释放资源
        fos.close();
    }
}

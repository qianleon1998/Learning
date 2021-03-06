package com.company.IOAndPro.demo01OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
    追加写/续写：使用两个参数的构造方法
        FileOutputStream（String name, boolean append）创建一个向具有指定name的文件中写入数据的输出文件流
        FileOutputStream(File file,boolean append)创建一个向具有指定File对象表示的文件中写入数据的输出文件流
        参数：
            String name，File file ：写入数据的目的地
            boolean append:追加写开关
                ture：创建对象不会覆盖原文件，继续在文件末尾追加写数据
                false：创建一个新文件，覆盖源文件
        写换行：写换行符号
            Windows：\r\n
            linux:/n
            mac:/r
* */
public class Demo03OutputStream {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\iedaIU\\Learning\\src\\com\\company\\IOAndPro\\demo01OutputStream\\c.txt",true);
        for (int i = 1; i <=10; i++) {
            fos.write("你好".getBytes(StandardCharsets.UTF_8));
            fos.write("\r\n".getBytes(StandardCharsets.UTF_8));
        }

        fos.close();
    }
}

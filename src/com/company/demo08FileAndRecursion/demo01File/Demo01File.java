package com.company.demo08FileAndRecursion.demo01File;

import java.io.File;

/*
    java.io.File类
    文件和目录路径的抽象表示形式。
    java把电脑中的文件和文件夹（目录）封装为了一个File类，我们可以使用File类对文件和文件夹进行操作
    我们可以使用File类的方法
        创建，删除，获取一个文件/文件夹
        判断是否存在，对文件/文件夹是否存在，遍历，获取文件大小
     File类是一个与系统无关的类，任何操作系统都可以使用

     重点：file:文件
          directory：文件夹/目录
          path：路径
* */
public class Demo01File {
    public static void main(String[] args) {
        /*
        static String pathSeparator 与系统有关的路径分隔符，为了方便，表示为一个字符串
        static char pathSeparator 与系统有关的路径分隔符。
        static String separator 与系统有关的默认名称分隔符，表示为一个字符串
        static char separator 与系统有关的默认名称分隔符
        * */
        String pathSepatator = File.pathSeparator;
        System.out.println(pathSepatator);//路径分隔符，windows分号，linux，冒号
        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符，windows反斜杠\ linux,正斜杠/

    }
}

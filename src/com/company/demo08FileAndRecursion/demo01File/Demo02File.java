package com.company.demo08FileAndRecursion.demo01File;

import java.io.File;

/*
    路径：
        绝对路径：是一个完整的路径
            以盘符开始的路径
        相对路径：是一个简化的路径
        注意：
            1.路径不区分大小写
            2.文件名称分隔符，windows反斜杠\ ，反斜杠代表转义字符，两个代表一个普通的反斜杠
* */
public class Demo02File {
    public static void main(String[] args) {
        /*
            File类的构造方法
        * */
        //show02("c:\\","a.txt");
        show03();
    }
/*
    File（File,String child）根据parent路径名字符串和child路径名字符串创建一个新的File实例
    参数：
            把路径分成了两部分
            File parent：父路径
            String child:子路径
        好处：
            父路径和子路径可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
            父路径是File类型，可以使用File的方法，对路径进行一些操作，在使用路径创建对象
* */
    private static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent,"hello.java");

    }


    /*
        File（String parent,String child）根据parent路径名字符串和child路径名字符串创建一个新的File实例
        参数：
            把路径分成了两部分
            String parent：父路径
            String child:子路径
        好处：
            父路径和子路径可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
    * */
    private static void show02(String parent,String child) {
        File file = new File(parent,child);
        System.out.println(file);
    }




    /*
    File(String pathname)通过将给定路径名字符串转换为抽象路径名来创建一个新的File实例
    参数：
        String pathname:字符串的路径名称
        路径可以文件/文件夹结尾
        路径可以相对路径，绝对路径
        路径可以是存在的也可以是不存在的
        File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
    * */
    private static void show01() {
        File f1 = new File("c:\\desktop\\a.txt");
        System.out.println(f1);
        File f2 = new File("c:\\desktop\\haha");
        System.out.println(f2);
    }
}

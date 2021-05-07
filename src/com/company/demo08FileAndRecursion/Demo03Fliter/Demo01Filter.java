package com.company.demo08FileAndRecursion.Demo03Fliter;
/*
    使用过滤器实现
    在File类中有两个和ListFiles重载的方法，方法的参数传递的就是过滤器
    File[] listFiles（FileFileter fileter）
        java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器
            作用：用来过滤文件的（File对象）
            抽象方法：用来过滤文件的方法
                boolean accept(File pathname)测试指定对象路径名是否包含在某个路径列表中
                参数：
                    File pathname；使用ListFiles方法遍历目录，得到的每一个文件对象
    File[] listFiles(FilenameFilter filter)
        java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
            作用：过滤文件名称
            抽象方法：用来过滤文件的方法
                Boolean accept(File dir,String name)测试指定文件是否应该包含在某一个文件列表中
                参数：
                    File dir：构造方法中传递的被遍历的目录
                    String name：使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称
            注意事项：
                两个过滤器接口没有后实现类，需要自己重写实现类，重写方法accept，在方法中自己的定义过滤规则
* */
public class Demo01Filter {

}

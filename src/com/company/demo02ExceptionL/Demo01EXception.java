package com.company.demo02ExceptionL;

public class Demo01EXception {
    /*
        多个异常使用捕获又该如何处理
        1.多个异常分别处理
            一个try对应一个catch
        2.多个异常一次捕获，多次处理
            一个try对应多个catch，抛出的异常对象，子类写在前面，父类写在后面
        3.多个异常一次捕获，一次处理
            一个try捕获所有异常，catch定义的变量能接受所有异常对象即可，（多态）Exception
     */

}

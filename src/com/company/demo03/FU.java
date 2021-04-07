package com.company.demo03;
    /*
        子父类的异常
        父类异常，子类异常就什么样
     */
public class FU {
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws NullPointerException,ClassCastException{}
    public void show04() {}
}

class Zi extends FU{
    //子类重写父类时抛出和父类相同的异常
    public void show01() throws NullPointerException,ClassCastException{}

    //子类重写父类方法时，抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    //子类重写父类方法时，不抛出异常
    public void show03() {}
    //父类没有异常，子类重写时也不能抛出异常
    public void show04() {
        //加上一个抛出异常就会报错，若方法内部产生异常，不能声明抛出，只能捕获处理
        try {
            throw new Exception("编译期异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
package com.company;
/*
throw关键字
作用：
可以使用throw关键字在指定方法中抛出指定异常
使用格式：
    throw new xxxException(“异常产生原因”)
    注意：
    1.throw关键字必须写在方法内部
    2.throw关键字后边new的对象必须是Exception或者是Exception的子类对象
    3.throw关键字抛出指定的异常对象，必须处理异常对象
        throw关键字后边创建的是RuntimeException或者是 RuntimeException的子类对象，可以不处理，默认交给jvm处理（打印异常对象，中断程序）
        throw关键字后边创建的是编译异常，（写代码时报错），就必须处理这个异常，throws或try、、、catch
*/
public class Demo03Throw {
    public static void main(String[] args) {
        int [] arr = new int[3];
        int e = getElement(arr,3);
        System.out.println(e);
    }
    /*
    定于一个方法，获取数组指定索引处的元素
    参数：
        int [] arr
        int index

        后期工作必须对方法传递过来的参数进行合法性校验
        如果参数不合法必须使用抛出异常的方式，告知方法的调用者，传递参数有问题
        注意：空指针异常是NullPointerException是一个运行期异常，不用处理，交给jvm处理
        ArrayIndexOutOfBoundsException,也是运行期异常
     */
    public  static int getElement(int[] arr,int index){
        /*
        我们可以对传递过来的参数数组，进行合法性校验
        如果数组arr的值是null，那我们就抛出空指针异常，告知调用者“传递数组的值是null”
         */
        if(arr == null){
            throw new NullPointerException("传递数组的值是空");
        }
        /*
        对传递过来的index进行合法性校验
        如果对index的范围不在数组索引范围内
        那我们就抛出数组索引越界异常，告知方法的调用者“传递的索引超出数组的使用范围”
         */
        if(index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }

        int ele = arr[index];
        return ele;
    }
}


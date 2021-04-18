package com.company.demo07.ThreadAnd.demo06.Lambda;
/*
    Lambda表达式有参数有返回值练习
    需求：
        给定一个计算机calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCal方法，完成120和130的相加计算

        自学笔记：定义抽象方法的目的是重写此方法，但如果定义成静态方法就不能被重写。
        接口中的方法也只能是 public abstract修饰的，不能加上static。接口是不能实例化的，
        即不能被分配内存，而static修饰的方法在类实例化之前就已经别分配了内存，这样一来矛盾就出现了：
        接口不能被分配内存，而static方法必须被分配内存。所以接口中不能有静态的抽象方法。
        在main函数中调用函数只能调用静态的。如果要调用非静态的，那么必须要先实例化对象，然后通过对象来调用非静态方法。
* */
public class Demo01Calculator {
    public static void main(String[] args) {
       /* invokeCalc(120, 130, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });*/

        //使用Lambda表达式，简化匿名内部类的书写
        invokeCalc(10,20,(int a,int b)->{
            return a+b;
        });

        //省略写法
        invokeCalc(10,20,(a, b)-> a+b);
    }
    /*
    定义一个方法有6 7
    参数传递两个int类型的整数
    参数传递Calculaator接口
    方法内部调用Calculator中的方法calc计算两个整数的和
    * */
    public static void invokeCalc(int a, int b, Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}

package com.company.demo07.ThreadAndLambda.demo03.Lambda;
/*
    需求：
        给定一个厨子Cook接口，内含唯一的抽象方法makeFood,且无参数，无返回值
        使用Lambda的标准格式调用invokeCook方法，打印出吃饭了字样
* */
public class Demo01Cook {
    public static void main(String[] args) {
        //调用invokeCook方法，参数是Cook接口，传递Cook接口的匿名内部类对象
        invokeCook(new Cook(){
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        //调用的方法没有参数，就可以（），Lambda
        invokeCook(()->{
            System.out.println("吃饭了");
        });
    }

    //定义一个方法，参数传递Cook接口，方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}

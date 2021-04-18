package com.company.demo07.ThreadAnd.demo07.Lambda;

import java.util.ArrayList;

/*
    lambda表达式：是可推导，可以省略的
    凡是可以根据上下文推到出来的内容，都可以省略书写
    可以省略的内容：
        1.（参数列表）：括号中的参数列表的数据类型，可以省略不写
        2.（参数列表）：括号中的参数如果只有一个，那么类型和（）都可以省略
        3.（一些代码）：如果{}中代码只有一行，无论是否有返回值都可以省略（{}，return,分号）
            注意：要省略必须一起省略
* */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //jdk1.7版本之前，创建对象必须把前后的泛型都写上
        ArrayList<String> list01 = new ArrayList<String>();
        //jdk1.7版本之后，等号后面的泛型可以省略，后面的泛型可以根据前面的泛型推导出
        ArrayList<String> list02 = new ArrayList<>();
    }
}

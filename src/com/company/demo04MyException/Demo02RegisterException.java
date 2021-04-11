package com.company.demo04MyException;

import java.util.Scanner;

public class Demo02RegisterException {
    //1.使用数组保存以及注册过的用户名（数据库）
    static String[] usernames = {"张山","李四","王五"};

    public static void main(String[] args)/* throws RegisterException*/ {
        //2.使用Scanner获取用户输入的注册的用户名（前端网页）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名");
        String username = sc.next();

        checkUsername(username);
    }
    //3.定义一个方法，对用户输入的用户名进行判断

    public static void checkUsername(String username) /*throws RegisterException*/ {
        //遍历存储已注册过的用户名输入的用户名比较
        for (String name:usernames){
            //使用获取到的用户名和用户输入的用户名比较
            if(name.equals(username)) {
                //true：用户名已经存在，抛出RegisterException异常，告知用户

                    throw new RegisterException("该用户名已经被注册");//抛出运行期异常无需处理，交给jvm中断处理就行

            }
        }
        //如果循环结束了，还没有找到重复的用户名，就提示用户注册成功
        System.out.println("恭喜注册成功");
    }

}

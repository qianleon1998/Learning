package com.company.demo04MyException;

import javax.crypto.spec.PSource;
import java.util.Scanner;

/*
    要求:模拟注册操作，用户名已存在，就抛出异常并提示:用户名被注册

    分析：
        1.使用数组保存以及注册过的用户名（数据库）
        2.使用Scanner获取用户输入的注册的用户名（前端网页）
        3.定义一个方法，对用户输入的用户名进行判断
            遍历存储已注册过的用户名输入的用户名比较
                true：
                    用户名已经存在，抛出RegisterException异常，告知用户
                false：
                    继续遍历比较
             如果循环结束了，还没有找到重复的用户名，就提示用户注册成功
 */
public class Dmeo01RegisterException {
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
                try {
                    throw new RegisterException("该用户名已经被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();

                    return;//结束方法，防止抛出异常之后还在运行
                }
            }
        }
        //如果循环结束了，还没有找到重复的用户名，就提示用户注册成功
        System.out.println("恭喜注册成功");
    }

}

package com.company.demo02ExceptionL;
    /*
    Objects类中的静态方法
    public static <T> T requireNonNull (T obj):查看指定引用对象不是null
    源码：
        public static <T> T requireNonNull (T obj){
        if (obj == null)
            throw new NullPointerException();
         return obj;
        }
     */

import java.util.Objects;

public class Demo04Objects {

    public static void main(String[] args) {
        method(null);
    }

        public static void  method(Object obj){
        //对传递过来的参数进行合法性判断，判断是否为空
//            if (obj == null)
//                throw new NullPointerException();
//            Objects.requireNonNull(obj);
            Objects.requireNonNull(obj,"传递的对象的值是null");
        }
}

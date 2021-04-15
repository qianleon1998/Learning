package com.company.demo04MyException;
/*
    java给我们提供的异常类不够自己使用，需要自己定义一些异常类
    格式：
        public class xxxException entends Exception / RuntimeException{
            添加一个空参数的构造方法
            添加一个带异常信息的构造方法
        }
     注意：
        1.自定义异常类都是以Exception结尾，说明该异常是自定义异常类
        2.自定义异常类，必须继承Exception或者RuntimeException
            继承Exception：那么自定义异常类就是一个编译期异常，方法内部出现了编译期异常，必须处理异常，throws或者Try catch
            继承RuntimeException：自定义异常就是运行期异常，无需处理交给虚拟机处理（中断处理）
 */
public class RegisterException extends  /*Exception*/ RuntimeException{
    //添加一个空参数的构造方法
    public RegisterException(){
        super();
    }
    /*
        添加一个带异常信息的构造方法
        查看源码发现，所有异常类都会带一个异常信息的构造方法，方法内部就会调用父类带异常信息的构造方法，让父类来处理异常信息
     */
    public RegisterException(String message){
        super(message);
    }
}

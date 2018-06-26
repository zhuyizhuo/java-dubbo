package com.zhuyizhuo.java;

/**
 * Created by yizhuo on 2018/6/26.
 */
public class HelloServiceImpl implements IHelloService {

    public String sayHello(String msg) {
        return "hello," + msg;
    }
}

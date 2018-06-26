package com.zhuyizhuo.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yizhuo on 2018/6/26.
 */
public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        IHelloService iGpHello = (IHelloService)context.getBean("helloService");
        System.out.println(iGpHello.sayHello("yizhuo"));
    }
}

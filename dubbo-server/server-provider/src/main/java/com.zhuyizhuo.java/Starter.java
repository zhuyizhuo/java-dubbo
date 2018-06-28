package com.zhuyizhuo.java;

import com.alibaba.dubbo.container.Main;

/**
 * Created by yizhuo on 2018/6/27.
 * dubbo 容器 提供了Main.main直接启动服务 不需要依赖tomcat及其他容器
 */
public class Starter {

    public static void main(String[] args) {
        //需要新建META-INF.spring 将xml文件放到此目录
        Main.main(new String[]{"spring","log4j"});
    }
}

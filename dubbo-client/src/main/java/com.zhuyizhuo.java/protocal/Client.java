package com.zhuyizhuo.java.protocal;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import com.zhuyizhuo.java.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yizhuo on 2018/6/26.
 */
public class Client {
    public static void main(String[] args) {
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtocal");
        System.out.println(protocol.getDefaultPort());
    }
}

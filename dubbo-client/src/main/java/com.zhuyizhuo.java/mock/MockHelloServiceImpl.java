package com.zhuyizhuo.java.mock;

import com.zhuyizhuo.java.IHelloService;

/**
 * Created by yizhuo on 2018/6/28.
 */
public class MockHelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String s) {
        return "mock,hello," + s;
    }
}

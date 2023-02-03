package xdrush.demo.annotation;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2023/1/31
 */

public abstract class Parent {
    public void sayHello() {}
    protected void invoke() {
        System.out.println("hello world");
    }

    @Deprecated
    public String getName() {
        return "xdrush";
    }
}

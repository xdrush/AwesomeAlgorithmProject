package xdrush.demo.annotation;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2023/1/31
 */

@SuppressWarnings("all")
public class Children extends Parent {

    @Override
    protected void invoke() {
        sayHello();
    }

    public void getInfo() {
        System.out.println(this.getName());
    }
}

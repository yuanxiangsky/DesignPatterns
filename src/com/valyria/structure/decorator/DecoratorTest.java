package com.valyria.structure.decorator;

/**装饰器模式
 * Created by YuanXiang on 2017/5/22.
 * 1、 动态扩展对象的功能
 * 2、 动态增加对象功能，动态撤销
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}

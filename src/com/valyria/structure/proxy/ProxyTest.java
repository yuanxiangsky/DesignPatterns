package com.valyria.structure.proxy;

import com.valyria.structure.decorator.Sourceable;

/**代理模式
 * 如果已有的方法在使用的时候需要对原有的方法进行改进
 * Created by YuanXiang on 2017/5/22.
 * 就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
   使用代理模式，可以将功能划分的更加清晰，有助于后期维护
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}

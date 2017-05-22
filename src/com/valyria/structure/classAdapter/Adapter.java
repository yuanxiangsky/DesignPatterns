package com.valyria.structure.classAdapter;

import com.valyria.structure.objectadapter.Wrapper;

import java.nio.channels.SocketChannel;

/**适配器模式
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。
 * 有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * Created by YuanXiang on 2017/5/22.
 */
public class Adapter extends Source implements Targetble{
    @Override
    public void method2() {
        System.out.println("this is a targerTable method!");
    }

    public static void main(String[] args) {
        Targetble targetble = new Wrapper(new Source());
        targetble.method1();
        targetble.method2();
    }
}

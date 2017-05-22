package com.valyria.create.Singleton;

/**
 * Created by YuanXiang on 2017/5/22.
 * 在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new Singleton();语句是分两步执行的。
 *  但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，然后直接赋值给instance成员，然后再去初始化这个Singleton实例。
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        synchronized(instance) { //多线程情况下由于jvm虚拟机优化机制还是会出现问题，比如a线程先进入获取instance锁，
                                 // 然后从内存区域划一部分区域给istance，此时instance还没有初始化，然后切换到b线程，b线程intance !=null 直接返回了null
            if (instance == null)
                instance = new Singleton2();
        }
        return instance;
    }
}

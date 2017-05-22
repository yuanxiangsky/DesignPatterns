package com.valyria.behavior.memento;

/**备忘录模式
 * Created by YuanXiang on 2017/5/22.
 * 假设有原始类A，A中有各种属性，A可以决定需要备份的属性，备忘录类
 * B是用来存储A的一些内部状态，类C呢，就是一个用来存储备忘录的，且只能存储，不能修改等操作。
 *
 * Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值。
 * Memento类是备忘录类，Storage类是存储备忘录的类，持有Memento类的实例，
 */
public class Test {

    public static void main(String[] args) {
        Original origi = new Original("AAA");
        Storage storage = new Storage(origi.createMemmento());
        // 修改原始类的状态
        System.out.println("初始化状态为：" + origi.getValue());
        origi.setValue("BBB");
        System.out.println("修改后的状态为：" + origi.getValue());

        // 回复原始类的状态
        origi.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + origi.getValue());

    }
}

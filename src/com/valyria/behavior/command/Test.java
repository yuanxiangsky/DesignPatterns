package com.valyria.behavior.command;

import sun.plugin.com.event.COMEventHandler;

/**命令模式
 * Created by YuanXiang on 2017/5/22.
 * 命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分
 * 开，熟悉Struts的同学应该知道，Struts其实就是一种将请求和呈现分离的技术，其中必然涉及命令模式的思想！
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}

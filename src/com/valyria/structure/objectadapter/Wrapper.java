package com.valyria.structure.objectadapter;

import com.valyria.structure.classAdapter.Source;
import com.valyria.structure.classAdapter.Targetble;

/**对象适配器
 * Created by YuanXiang on 2017/5/22.
 */
public class Wrapper implements Targetble{
    private Source source;
    public Wrapper(Source source){
        super();
        this.source=source;
    }


    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is a tarhetable method");
    }
}

package com.likun.app;

import org.apache.ibatis.annotations.Param;

/**
 * Created by likun(li.k@ikcrm.com) on 2017/8/17.
 */
public class Producer implements Runnable{
    Box box;
    public Producer(Box box){
        this.box = box;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            Mantou mantou = new Mantou(i);
            System.out.println("生成馒头："+mantou);
            box.produce(mantou);
        }
    }
}

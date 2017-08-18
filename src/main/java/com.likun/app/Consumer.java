package com.likun.app;

/**
 * Created by likun(li.k@ikcrm.com) on 2017/8/17.
 */
public class Consumer implements  Runnable{
    Box box;
    public Consumer(Box box){
        this.box = box;
    }

    @Override
    public void run() {
        while (true){
            Mantou mantou = box.consume();
            System.out.println("消费馒头："+mantou);
        }
    }
}

package com.likun.app;

/**
 * Created by likun(li.k@ikcrm.com) on 2017/8/17.
 */
public class Box {
    Mantou [] arr = new Mantou[10];
    int index = 0;

    synchronized public Mantou consume(){
        try {
            while(0==index){
                System.out.println("没有馒头了，请稍等。。。");
                wait();
            }
            notify();
        }catch (Exception e){
            e.printStackTrace();
        }
        index--;
        return arr[index];

    }

    synchronized public void  produce(Mantou mantou){
        try {
            while(10==index){
                System.out.println("盘子满了，不能装馒头了，请稍等。。。");
                wait();
            }
            notify();
        }catch (Exception e){
            e.printStackTrace();
        }

        arr[index] = mantou;
        index++;

    }

}

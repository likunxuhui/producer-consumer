package com.likun.app;

/**
 * Created by likun(li.k@ikcrm.com) on 2017/8/17.
 */
public class MainApp {
    public static void main(String args[]){
        Box box = new Box();
        Producer producer =new Producer(box);
        Consumer customer = new Consumer(box);
        new Thread(producer).start();
        new Thread(customer).start();
    }
}

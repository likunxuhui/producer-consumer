package com.likun.eat;

/**
 * Created by likun(li.k@ikcrm.com) on 2017/8/18.
 */
public class MainApp {
    public static void main(String args[]){
        Fork fork = new Fork();
        ( new Philosopher("1",fork)).start();
        ( new Philosopher("2",fork)).start();
        ( new Philosopher("3",fork)).start();
        ( new Philosopher("4",fork)).start();
        ( new Philosopher("5",fork)).start();
    }
}

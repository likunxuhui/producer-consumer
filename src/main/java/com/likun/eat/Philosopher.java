package com.likun.eat;

/**
 * Created by likun(li.k@ikcrm.com) on 2017/8/18.
 */
public class Philosopher extends Thread{

    private String name;
    private Fork fork;

    public Philosopher(String name, Fork fork) {
        super(name);
        this.name = name;
        this.fork = fork;
    }

    @Override
    public void run() {
        while(true){
            fork.getFork();
            eat();;
            fork.putFork();;
            think();

        }
    }

    public void eat(){
        System.out.println("i am eatting "+name);
    }

    public void think(){
        System.out.println("i am thinking "+name);
    }
}

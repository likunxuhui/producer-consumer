package com.likun.eat;

/**
 * Created by likun(li.k@ikcrm.com) on 2017/8/18.
 */
public class Fork {

    public boolean [] used = {false,false,false,false,false};

    synchronized public void getFork(){
        int i = Integer.parseInt(Thread.currentThread().getName());
        while(used[i] || used[(i+1)%5]){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        used[i] = true;
        used[(i+1)%5] = true;

    }
    synchronized public void putFork(){
        int i = Integer.parseInt(Thread.currentThread().getName());
        used[i] = false;
        used[(i+1)%5] = false;

    }
}

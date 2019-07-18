package com.company;

import com.sun.tools.internal.jxc.SchemaGenerator;

class Runner extends Thread {
    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            System.out.println(i);
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Runner runner1 = new Runner();
        runner1.start();

    }
}

package com.company;

public class Main {

    public static void main (String [] args) {

        try{
            HilosTest hilosTest = new HilosTest();

            hilosTest.start();
            hilosTest.join();
    }catch(InterruptedException e){
        e.printStackTrace();
    }


    }

}


package com.company;

public class HilosTest extends Thread {


    @Override
    public void run() {
        try {
            while (true) {
                hilos();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

public void hilos() throws InterruptedException{
    int numero=0;
    for (int i = 1; i <= 100; i++) {

        numero = (int) (Math.random() * (8000 - 1000)) + 1000;

        System.out.println("Hilo " + i + " ha dormido por " + numero + " milisegundos");
        try {
            Thread.sleep(numero);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
    }

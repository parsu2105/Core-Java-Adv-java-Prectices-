package com.Revijan;

class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("🎧 Task1: Music Playing " + i);
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("📂 Task2: File Downloading " + i);
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start(); // start music
        t2.start(); // start downloading
    }
}

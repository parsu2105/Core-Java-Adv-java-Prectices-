package com.KodeWalaClassTest;

class IsEven implements Runnable {
    public void run() {
        try {
			isEven();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void isEven() throws InterruptedException {
        int[] a = { 4, 455, 6, 78, 765, 43, 45, 67, 65, 432, 45, 67, 654 };
        for (int i = 0; i < a.length; i++) {
        	 wait();
            if (i % 2 == 0) {
                System.out.println("Even Index -> " + a[i]);
                break;
            }
           notify();
        }
       
    }  
}

class IsOdd implements Runnable {
    public void run() {
        try {
			isOdd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void isOdd() throws InterruptedException {
        int[] a = { 4, 56, 34, 345, 456, 4, 5676, 534, 566, 54, 567, 65, 4, 56, 7, 654, 567 };
        for (int i = 0; i < a.length; i++) {
        	wait();
            if (i % 2 != 0) {
                System.out.println("Odd Index -> " + a[i]);
            }
        }
        notify();
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new IsEven());
        Thread t2 = new Thread(new IsOdd());

        t1.start();
        t2.start();
    }
}

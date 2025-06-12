package com.KodeWalaClassTest;

class SharedResources {
	private int data;
	private boolean available = false;

	public synchronized void producer(int value) throws InterruptedException {
		while (available) {
			wait();
		}
		data = value;
		available = true;
		System.out.println("Produced : " + data);
		notify();
	}

	public synchronized void consume() throws InterruptedException {
		while (!available) {
			wait();
		}
		System.out.println("Consumed: " + data);
		available = false;
		notify();
	}
}

class Producer extends Thread {
	SharedResources resources;

	public Producer(SharedResources resources) {
		this.resources = resources;
	}

	public void run() {
		try {
			for (int i = 1; i <= 15; i++) {
				resources.producer(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Consumer extends Thread {
	SharedResources resource;

	public Consumer(SharedResources resources) {
		this.resource = resources;
	}

	public void run() {
		try {
			for (int i = 1; i <= 15; i++) {
				resource.consume();
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class InterThreadDemo {

	public static void main(String[] args) {
		 SharedResources resuorce = new SharedResources();
		 
		 Producer producer = new Producer(resuorce);
		 Consumer consumer = new Consumer(resuorce);
		 
		 producer.start();
		 consumer.start();
	}

}

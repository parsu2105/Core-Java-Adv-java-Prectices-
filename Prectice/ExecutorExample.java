package com.Prectice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] args) {
		ExecutorService execute = Executors.newCachedThreadPool();
		for(int i = 0 ; i < 5; i++) {
			int task1 = i;
		execute.submit( (Runnable) ()->{System.out.println("Task " +task1 + "EXCEUTED BY " + Thread.currentThread().getName());
		});
		}
		execute.shutdown();

	}

}

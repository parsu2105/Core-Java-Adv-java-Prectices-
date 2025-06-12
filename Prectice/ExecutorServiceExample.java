package com.Prectice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);

		for (int i = 1; i < 5; i++) {
			int taskId = i;
			executor.submit(() -> {
				System.out.println("Task " + taskId + " is running by " + Thread.currentThread().getName());
			});

		}
		executor.shutdown();

		ExecutorService executer = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			int taskId = i;
			executer.submit(() -> {
				System.out.println("Task " + taskId + " is running by : " + Thread.currentThread().getName());
			});
		}
		executer.shutdown();
	}
	


}

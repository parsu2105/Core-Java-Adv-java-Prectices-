package com.Prectice;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable{
	String taskName;
	
	MyTask(String taskName){
		this.taskName = taskName;
	}
	@Override
	public void run() {
		System.out.println("CURRENT THREAD ------> " +Thread.currentThread().getName() +"Exexuter Task " +taskName);
	}
}
public class ExecutorFrameWorkDemo {

	public static void main(String[] args) {
	
		ExecutorService  executorService = Executors.newFixedThreadPool(3);
		for(int i = 1; i <= 10; i++) {
			MyTask myTasks = new MyTask("MYTASK = " +i);
			executorService.submit(myTasks);
		}
		executorService.shutdown();
	}

}

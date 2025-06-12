package com.KodeWalaClassTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterServices {

	public static void main(String[] args) {
	
		//step1 . Create a thread pool of 3 thread 
	     ExecutorService executo = Executors.newFixedThreadPool(3);
	     
	     //step2 . create runnable tasks (no return value)
	     Runnable task1 = ()->{System.out.println("Task 1 is running in: " +Thread.currentThread().getName());
	     };
	     
	     
	     Runnable task2 = ()->{System.out.println("Task 2 is running in : " +Thread.currentThread().getName());
	     };
	     
	     //step 3. submit runnable tasks to executorserviece
	     executo.submit(task1);
	     executo.submit(task2);
	     
	     //step 4. submit a callable task (returns a result)
	     Callable<String> task3 = ()->{
	    	 Thread.sleep(1000);
	    	 return "Result from task3 (Callable)";
	     };
	     
	     //step 5. Submit Callable and get result using future
	     Future<String> future = executo.submit(task3);
	     
	     try {
	    	 // step 6. get result from future (blocks until done)
	    	 String result = future.get();
	    	 System.out.println("Received from Callable : " +result);
	     }catch(InterruptedException | ExecutionException e) {
	    	 e.printStackTrace();
	     }
	     
	     //step 7 : Always shutdown the executor to free resources
	     executo.shutdown();
	     
	     //step 8: Check if the executor is shut down 
	     System.out.println("Executor is shut down : " +executo.shutdownNow());

	}

}

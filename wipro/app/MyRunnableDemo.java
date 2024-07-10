package com.wipro.app;

import com.wipro.service.MyRunnable;

public class MyRunnableDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		// Create a Runnable object
		Runnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable,"worker-1");
		
		thread1.start();//implicitly invokes run() method
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Thread thread2 = new Thread(runnable, "worker-2");
		
		thread2.start();
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("End of main() method");
	}
}


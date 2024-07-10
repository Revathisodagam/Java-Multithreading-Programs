package com.wipro.service;

public class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println("Working on a job..");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Job done");
	}
}
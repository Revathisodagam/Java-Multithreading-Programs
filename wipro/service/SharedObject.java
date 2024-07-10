package com.wipro.service;

public class SharedObject implements Runnable {
   private static StringBuilder sharedData= new StringBuilder("Welcome");
   
	/*@Override
		public synchronized void run() {
			
			int length = sharedData.length();
			for(int i=0;i<length;i++) {
				System.out.println(Thread.currentThread().getName() + "-"+ sharedData.append("x"));
			}
			
		}*/
   
   public void run() {
	   int length = sharedData.length();
	   for(int i=0; i<length; i++) {
		  System.out.println(Thread.currentThread().getName() + "-"+ sharedData.append("x"));

	   }
   }
}

package com.wipro.app;
import com.wipro.service.SharedObject;
public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Runnable runnable =  (Runnable) new SharedObject();
		Thread thread1 = new Thread(runnable,"worker-1");
		Thread thread2 = new Thread(runnable,"worker-2");
		
		thread1.start();
		thread2.start();
	}

}

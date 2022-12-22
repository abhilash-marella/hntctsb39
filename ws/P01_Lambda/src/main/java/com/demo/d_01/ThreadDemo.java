package com.demo.d_01;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " is running");
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1 = new MyThread();
		t1.start();
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+ " is also running");
			}
		};
		Thread t2 = new Thread(r);
		t2.start();

		Thread t3 = new Thread(()->{
				System.out.println(Thread.currentThread().getName()+ " is also running as thread");
		});
		t3.start();

	}
	
}

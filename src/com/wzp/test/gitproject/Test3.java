package com.wzp.test.gitproject;

import java.util.Random;

public class Test3 {

	public static void main(String[] args) {
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				Random random = new Random(123456);
				
				System.out.println(Thread.currentThread() + "---" + random.nextInt());
				System.out.println(Thread.currentThread() + "---" + random.nextInt());
				System.out.println(Thread.currentThread() + "---" + random.nextInt());
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				Random random = new Random(123456);

				System.out.println(Thread.currentThread() + "---" + random.nextInt());
				System.out.println(Thread.currentThread() + "---" + random.nextInt());
				System.out.println(Thread.currentThread() + "---" + random.nextInt());
			}
		}).start();
	}

}

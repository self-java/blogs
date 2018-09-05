package com.zch.blogs.java.multithreads.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPoolTest {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 5; i++) {
			executorService.execute(new Runnable() {
				public void run() {
					try {
						Thread.sleep(1000 * 3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "线程被调用了。");
				}
			});
			System.out.println("************* a" + i + " *************");
		}
		executorService.shutdown();
	}
}

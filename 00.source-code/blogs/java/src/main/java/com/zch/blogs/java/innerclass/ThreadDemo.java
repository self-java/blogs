package com.zch.blogs.java.innerclass;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				System.out.print("thread  ");
			}
		};
		t.start();
	}
}

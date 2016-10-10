package com.test;

import java.util.ArrayList;
import java.util.List;

public class Thread13 {
	private List names = new ArrayList();

	public synchronized void add(String name) {
		names.add(name);
	}

	public synchronized void printAll() {
		for (int i = 0; i < names.size(); i++) {
			
			System.out.print(names.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		final Thread13 sl = new Thread13();
		for (int i = 0; i < 2; i++) {
			new Thread() {
				public void run() {
					try {
						Thread.currentThread().sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sl.add("A");
					sl.add("B");
					sl.add("C");
					sl.printAll();
				}
			}.start();
		}
	}
}

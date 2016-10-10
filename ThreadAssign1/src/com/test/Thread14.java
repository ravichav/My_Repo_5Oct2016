package com.test;


public class Thread14 {

private int x;

public void foo() {
	synchronized(this){
		int current = x;
		x = current + 1;
	}
	
 }

public synchronized void go() {
	 for(int i=1;i<=5;i++) {
		 synchronized(this){
			 new Thread() {
				 public void run() {
				 foo();
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 System.out.print(x + ", ");
				 } }.start();
		 }
		
	 }}

public static void main(String[] args) {
	new Thread14().go();
}
}

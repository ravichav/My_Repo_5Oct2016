package com.test;
public class T{

public static void main(String args[]){
	Runnable r = new Runnable() {
		 public void run() {
		 System.out.print("Cat");
		 }
		 };
		 
		 Thread t= new Thread(r) {
		
		 };
		 
		 t.start();	
}

}

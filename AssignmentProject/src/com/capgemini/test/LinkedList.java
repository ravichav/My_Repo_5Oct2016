package com.capgemini.test;

import java.util.Collection;
import java.util.Collections;

public class LinkedList {
	
	public static Collection get() {
		
java.util.LinkedList<String> sorted = new java.util.LinkedList<String>();
//Collection sorted = new LinkedList();
		  sorted.add("B"); sorted.add("C"); sorted.add("A");
		
		// Collections.sort(sorted);
		//	System.out.println(sorted);
		 
			
		 return sorted;
		 }
	
	
	
		public static void main(String[] args) {
		 for (Object obj: get()) {
		 System.out.print(obj + ", ");
		 }
		 }

}

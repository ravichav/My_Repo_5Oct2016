package com.capgemini.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySort mainObj = new ArraySort();
		mainObj.sortArray();
	}
	
	
 public void sortArray(){
	 Object [] myObjects = {
			 new Integer(12),
			 new String("foo"),
			 new Integer(5),
			 new Boolean(true)
			 };
	
			 Arrays.sort(myObjects);
			
			 
			 for( int i=0; i<myObjects.length; i++) {
			 System.out.print(myObjects[i].toString());
			 System.out.print(" ");
			 }
 }

}


	
	
		



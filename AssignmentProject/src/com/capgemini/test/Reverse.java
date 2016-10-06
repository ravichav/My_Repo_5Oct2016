package com.capgemini.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
		List list = new ArrayList();
		 list.add("1"); list.add("2"); list.add("3");
		// Iterator<String> it = reverse(list);
		 for (Object obj: list)
		 System.out.print(obj + ",");			 
	}

	public static List reverse(List list) {
		Collections.reverse(list);
		return list;
	}



}

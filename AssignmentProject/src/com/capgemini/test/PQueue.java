package com.capgemini.test;

import java.util.*;

public class PQueue {

	public static void main(String[] args) {
	 PriorityQueue<String> pq = new PriorityQueue<String>();
	 pq.add("carrot");
	 pq.add("apple");
	 pq.add("banana");
	 System.out.println(pq.poll() +":" + pq.peek());
	 }

}

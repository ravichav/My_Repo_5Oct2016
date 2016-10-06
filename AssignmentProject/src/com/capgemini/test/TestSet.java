package com.capgemini.test;

import java.util.*;

public class TestSet {
	enum Example {
		ONE, TWO, THREE
	}

	public static void main(String[] args) {
		int i=0;
	while(i<50){
		printEnum();
		i++;
		System.out.println("-------");
	}

}
	public static void printEnum(){
		//java.util.LinkedList<Enum> coll = new java.util.LinkedList<Enum>();
				Collection coll = new ArrayList();
				coll.add(Example.THREE);
				coll.add(Example.THREE);
				coll.add(Example.THREE);
				coll.add(Example.TWO);
				coll.add(Example.TWO);
				coll.add(Example.ONE);
				
				Set set = new HashSet(coll);
				
				Iterator it = set.iterator();
				while(it.hasNext()){
					System.out.println(it.next());
				}
			}
	}

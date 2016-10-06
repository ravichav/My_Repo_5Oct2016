package com.capgemini.test;

import java.util.Iterator;
import java.util.Map;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format(name);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}

public class HashCode {
	public static void main(String[] args) {
		java.util.Map<Person, String> ht = new java.util.HashMap<Person, String>();
		ht.put(new Person("Ravi"), "Obj1");
		ht.put(new Person("Ganesh"), "Obj2");
		ht.put(new Person("Ravi"), "Obj3");

		Iterator<Map.Entry<Person, String>> it = ht.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Person, String> entry = it.next();
			System.out.println(entry.getKey().toString());
			System.out.println(entry.hashCode());

		}
	}
}

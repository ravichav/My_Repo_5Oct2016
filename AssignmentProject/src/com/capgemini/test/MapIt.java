package com.capgemini.test;

import java.util.HashSet;
import java.util.Set;

class KeyMaster {
	public int i;

	public KeyMaster(int i) {
		this.i = i;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
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
		KeyMaster other = (KeyMaster) obj;
		if (i != other.i)
			return false;
		return true;
	}

	
}

public class MapIt {

	public static void main(String[] args) {

		Set<KeyMaster> set = new HashSet<KeyMaster>();
		KeyMaster k1 = new KeyMaster(1);
		KeyMaster k2 = new KeyMaster(2);
		
		set.add(k1);
		set.add(k1);
		
		set.add(k2);
		set.add(k2);
		
		System.out.print(set.size() + ":");
		k2.i = 1;
		System.out.print(set.size() + ":");
		set.remove(k1);
		System.out.print(set.size() + ":");
		set.remove(k2);
		System.out.print(set.size());
	}

}

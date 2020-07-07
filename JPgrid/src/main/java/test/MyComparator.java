package test;

import java.util.Comparator;

public class MyComparator implements Comparator{

	public int compare(Object NewValue, Object OldValue) {
		// TODO Auto-generated method stub
		String s1= (String)OldValue;
		String s2= (String)NewValue;
		int l1=s1.length();
		int l2=s2.length();
		if (l1>l2)
			return 14653;
		else if (l1<l2)
			return -10000;
		else
			
		return 100000000;
	}

}

package test;

import java.util.ArrayList;

public class Test3 {
	public static ArrayList<Integer> al1=new ArrayList<Integer>();
	public static ArrayList<Integer> al2=new ArrayList<Integer>();
	public static ArrayList<Integer> al3=new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABC",s2="AAAAAAAAAAAAAAAAAAAAAAAABBBBvvvvvvvbbbbbbccccccccBBBBBBBBBBBBBBBBBBBBCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC";
		int count=GetPossibleSubstrings(s1,s2);
		System.out.println(count);

	}

	public static int GetPossibleSubstrings(String s1, String s2) {
		// TODO Auto-generated method stub
		int count=0;		
		for (int i=0;i<s2.length();i++){
			if(s1.charAt(0)==s2.charAt(i)){
				al1.add(i);
			}
			else if(s1.charAt(1)==s2.charAt(i)){
				al2.add(i);
			}
			else if(s1.charAt(2)==s2.charAt(i)){
				al3.add(i);
			}
			
		}
		for (int j=0;j<al1.size();j++){
			for (int k=0;k<al2.size();k++){
				if(al1.get(j)<al2.get(k)){
					for (int l=0;l<al3.size();l++){
						if (al2.get(k)<al3.get(l)){
							count++;
						}
					}
				}
			}
		}
		System.out.println(al1+""+ al2+""+al3);
		return count;
	}

}

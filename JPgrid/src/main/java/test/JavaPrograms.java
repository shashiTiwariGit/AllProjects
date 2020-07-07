package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Pattern;



public class JavaPrograms {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int a = (int) Math.round(1.4);
		ArrayList<Integer> input1 = new ArrayList<Integer>();
		// int[] input = {7,56,20,4,4,5,7,7,5,6,9,32};
				input1.add(7);
				input1.add(4);
				input1.add(7);
				input1.add(7);
				input1.add(7);
				input1.add(7);
				input1.add(3);
				input1.add(7);
				input1.add(7);
				input1.add(7);
				input1.add(9);
				input1.add(9);
				input1.add(9);
				input1.add(9);
				input1.add(9);
				input1.add(9);
				input1.add(7);
				String sentence = "This is a sample test sentence for rest cases";
		// System.out.println(a);
		
		ArrayList <String>al= createSubstring(sentence);
		//System.out.println(createSubstring("shashi"));
		numberOfOccurancesString(al);
		
		
		
		
		//System.out.println(sentence);
		//System.out.println(rearangeSentence(sentence));
		//System.out.println(reverseSentence(sentence));
		

		// printTable();
		// findPrime(3, 10);

		// System.out.println(input1);
	 //System.out.println(numberOfOccurances(input1));

		// nextGreaterNumber(input);

		// Object[] a = findDuplicate(input1);

		// System.out.println(Arrays.toString(a));
		// printTable();
	}
	
	public static ArrayList<String> createSubstring(String s ){
		ArrayList<String> al= new ArrayList<String>();
		String[] subStrings=null;
		
		for (int i=0;i<s.length()-1;i++){
			for (int j=i+1;j<=s.length();j++){
				al.add( s.subSequence(i, j).toString());
			}
		}
		return al;
	}
	public static void createSubstring1(String s )
	{
	Scanner scan=new Scanner(System.in);
    String str=scan.next();
    int k=scan.nextInt();
    SortedSet<String> sets=new TreeSet<String>();
    for(int i=0;i<=str.length()-k;i++){
        sets.add(str.substring(i,i+k));
    }
    System.out.println(sets.first());
    System.out.println(sets.last());
	}

	public static String rearangeSentence(String sentence) {

		String[] temp = sentence.split(" ");
		sentence = "";

		for (int i = 0; i < temp.length; i++) {
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[i].length() < temp[j].length()) {

					String temprory = temp[i];
					temp[i] = temp[j];
					temp[j] = temprory;

				}

			}
			sentence = sentence + " " + temp[i].toLowerCase();

		}

		sentence = sentence.substring(1, 2).toUpperCase() + sentence.substring(2);
		return sentence;
	}

	public static String rearangeSentence1(String sentence) {
		String[] temp = sentence.split(" ");
		sentence="";
		MyComparator caparator = new MyComparator();
		TreeSet t = new TreeSet(caparator);
		for (int i = 0; i < temp.length; i++) {
			temp[i]=temp[i].toLowerCase();
			t.add(temp[i]);

		}
		Iterator itr=t.iterator();
		while(itr.hasNext()){
			sentence=sentence+" "+itr.next();
		}		
		
		
		sentence = sentence.substring(1, 2).toUpperCase() + sentence.substring(2);
		return sentence;

	}
	public static String reverseSentence(String sentence) {
		String[] temp = sentence.split(" ");
		sentence="";
		for (int i=temp.length-1;i>=0;i--){
			sentence = sentence+" "+temp[i];
		}
		return sentence;

	}

	public static void nextGreaterNumber(int[] input) {
		for (int i = 0; i < input.length; i++) {
			int temp = -1;
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] < input[j]) {
					temp = input[j];
					break;
				}
			}
			System.out.print(temp + ",");
		}

	}

	public static void printTable() {
		int a = (int) Math.round(1.5);
		System.out.println(a);
		Scanner console = new Scanner(System.in);

		int num;

		System.out.print("Enter any positive integer: ");
		num = console.nextInt();
		Pattern pattern = null;

		System.out.println("Multiplication Table of " + num);

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}

	public static void findPrime(int start, int end) {

		while (start < end) {
			boolean flag = false;
			for (int i = 2; i < start / 2; i++) {

				if (start % i == 0) {
					flag = true;
					System.out.println(start + " is divisible by " + i);
					break;
				}
				if (!flag)
					System.out.println(start + ", ");

			}
		}

	}

	public static void findDuplicate(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					System.out.println("found one Duplicate number" + input[i]);
				}
			}

		}
	}

	public static Object[] findDuplicate(ArrayList<Integer> input1) {
		HashSet h = new HashSet(input1);
		return h.toArray();
		/*
		 * for (int i=0;i<input1.size();i++) { for(int j =
		 * i+1;j<input1.size();j++ ){
		 * 
		 * if (input1.get(i)==input1.get(j)){
		 * 
		 * input1.remove(j); j=j-1; } }
		 * 
		 * } return input1;
		 */
	}

	public static Map<Integer, Integer> numberOfOccurances(ArrayList<Integer> input1) {

		Map<Integer, Integer> output = new HashMap<Integer, Integer>();
		for (Integer i : input1) {

			if (output.containsKey(i)) {
				output.put(i, (output.get(i)) + 1);

			} else {
				output.put(i, 1);
			}

		}
		return output;

	}


public static Map<String, Integer> numberOfOccurancesString(ArrayList<String> input1) {

	Map<String, Integer> output = new HashMap<String, Integer>();
	for (String string : input1) {
		if (output.containsKey(string)) {
			output.put(string, (output.get(string)) + 1);

		} else {
			output.put(string, 1);
		}
	}
	Set s=output.keySet();
	for (Object object : s) {
		String s1=(String)object;
		if (output.get(s1)>1&&s1.length()>=2){
			System.out.println("The String "+s1+" is repeated "+ output.get(s1));
		}
	}
	return output;
}
}


package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.aventstack.extentreports.gherkin.model.Given;

public class JavaExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaExamples e = new JavaExamples();
		System.out.println(e.giveCoinsCount("bab"));

	}

	public int giveCoinsCount(String s) {

		String[] subStrings = s.split("");
		Set setOfStrings = new HashSet(Arrays.asList(subStrings));

		return setOfStrings.size();

	}

}

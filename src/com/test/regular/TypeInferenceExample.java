package com.test.regular;

public class TypeInferenceExample {

	public static void main(String[] args) {
		//myLambda acts as an instance of the interface, that implements the implementing class
//		GetLength myLambda = (a) -> a.length();
//		System.out.println(myLambda.getLength("StarBucks"));
		
		print(a-> a.length());
		
	}
	
	public static void print(GetLength l) {
		System.out.println(l.getLength("DODGE"));
	}
	
	public interface GetLength {
		
		int getLength(String a);

	}

}

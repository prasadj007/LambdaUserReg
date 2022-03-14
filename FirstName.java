package com.bridgelabz.lambda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
	
	public static void main(String[] args) {
		System.out.println(firstName("John"));
	}
		
	public static boolean firstName(String FirstName )  {
		return FirstName.matches("^[A-Z]{1}[a-z]{2,}$");
		
	}


}
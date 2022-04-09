package com.karan;

public class FordFactory {
 
	 public static  Ford getcar(String type) {
		 if(type.equalsIgnoreCase("Classic")) {
			 
			 return new Classic();
		 }
		 else if (type.equalsIgnoreCase("Sudan")) {
			 
			 return new Sudan();
			 
		 }
		 else {
			 System.out.println("no thing found");
		 }
		return null;
	 }
}

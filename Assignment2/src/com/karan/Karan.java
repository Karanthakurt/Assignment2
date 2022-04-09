package com.karan;

import java.util.Scanner;

public class Karan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brand of car you want");
		String type= sc.next();
		Ford f = FordFactory.getcar(type);
		
		if(f!=null)
		{
			f.car();
		}
		
	}

}

package org.newprogram;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Print an alphabet");

		String Alphabet = scan.nextLine();

		if(Country.equals("a")) {

			System.out.println(Country +" Its a Developing country");	
		}
		else if (Country.equals("America")) {

			System.out.println(Country +" Its a Developed country");
		}
		else if (Country.equals("Africa")) {
		System.out.println(Country +" Poor Country");
		}
		else {
			System.out.println("Not Mentioned");
		}
			
		
	}}

package org.newprogram;

import java.util.Scanner;

import javax.crypto.AEADBadTagException;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class itsJavahere {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Print a number");
		
		int nextInt = scan.nextInt();
		
		for(int i=1; i<=nextInt; i++) {
			
			for (int j=i; j>=0; j-- ) {
				System.out.print(" ");
			}
			
			for (int k=i; k<=nextInt; k++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}

}}
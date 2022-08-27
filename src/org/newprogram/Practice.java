package org.newprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		
	
		int number = 10203040;
		String numbertostring = number+"";
		String replace = numbertostring.replace("0", "");
		int parseInt = Integer.parseInt(replace);
		System.out.println(parseInt);
		
		int number1 = 1020508090;
		String numberconv = number1+"";
		String replace2 = numberconv.replace("0", "");
		int parseInt2 = Integer.parseInt(replace2);
		System.out.println(parseInt2);
		

		int number3 = 155554;
		String number3conv = number3+"";
		String replace3 = number3conv.replace("5", "");
		int parseInt3 = Integer.parseInt(replace3);
		System.out.println(parseInt3);
	
		int number4 = 123456;
		String number4conv = number4+"";
		String replace4 = number4conv.replace("3", "");
		int parse4 = Integer.parseInt(replace4);
		System.out.println(parse4);
	}}

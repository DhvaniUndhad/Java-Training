package day10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Conversion {
	
	public static void main(String[] args) throws ParseException {
		
		//Automatic conversion / Up casting
		int n =189;
		long l = n;
		float f = l;
		System.out.println("Integer: " + n);
		System.out.println("Long: " + l);
		System.out.println("float: " + f);
		
		//Down casting
		double d = 72.87;
		long l1 = (long) d;
		int i = (int) l1;
		System.out.println("Value of d: " +d);
		System.out.println("Value of l1: " +l1);
		System.out.println("Values of i: " + i);
		
		//Conversion using byte
		byte b ;
		int i1 = 257;
		double d1 = 360.60;
		b=(byte) i1;
		System.out.println("int to byte: " + b);
		b=(byte) d1;
		System.out.println("double to byte: " +b);
		
		
		//COnversion using string
		String s = "Dhvani";
		//Can not convert string to double, int or any numeric datatype.
		/*
		 * int i2 = s;
		 */
		//double d2 = s; 
		
		
		//Date formate
		String s1= "09/25/2020";
		Date date = new SimpleDateFormat("dd/mm/yy").parse(s1);
		System.out.println(date);
		
		
		
	}

}

package com.operators.ternary;

public class Test {

	public static void main(String[] args) {
		//max of 2 numbers using ternary operators
		int a=10,b=20;
		int max = (a>b)?a:b ;
		System.out.println("Maximum is " +max);
				
		//min of 2 numbers
		int min = (a<b)?a:b;
		System.out.println("Minimum is " +min);
		
		//Positive or negative
		int n=-10;
		String res = (n>=0)? "Positive" : "Negative"	;	
		System.out.println("The Number is "+ res);
		
		//Even or odd
		int m = 4;
		String num = (m %2 == 0)? "Even" : "Odd" ;
		System.out.println("The number is " +num);
		
		//max of three numbers
		int c = 5 ;
		int max_three = ((a>b) ? ((a>c)) ? a:c  : ((b>c) ? b:c ));
		System.out.println("Maximum number is " + max);
		
		//Leap year or not
		int year = 2028;
		String yr = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		             ? "Leap Year" : "Not Leap Year";
		System.out.println(yr);

		//is no. is 2 digit or 3 digit
		int d = 105;
		String digit = (n >= -9 && n <= 9) ? "Single Digit" :
		             (n >= -99 && n <= 99) ? "Double Digit" : "More than two digits";
		System.out.println(digit);

		
		
	}

}

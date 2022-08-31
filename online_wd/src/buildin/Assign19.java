package buildin;

import java.util.Scanner;

public class Assign19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* get 3 numbers from the user and perform addition
 */
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number: " );
		int num1=in.nextInt();
		System.out.println("Enter second number: ");
		int number2=in.nextInt();
		System.out.println("Enter third number:"); 
		int number3=in.nextInt();
		System.out.println("addittion of three number is:"+(num1+number2+number3));
		/*
		 Find lower case,upper case and no of char present at given string
		 */
		String s="HelloWorld";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		/* Find sin,cos and Tan of 20*/
		System.out.println(Math.sin(20));
		System.out.println(Math.cos(20));
		System.out.println(Math.tan(20));
		/* Find max & min of two numbers using math class*/
		System.out.println(Math.max(78.43, 83.27));
		System.out.println(Math.min(27, 48));
	}

}

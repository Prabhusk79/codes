package test;

import java.util.Scanner;

public class Biodata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // Get your name,age and salary of a person  at run time & display their details
		
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=in.nextLine();
		System.out.println("Enter your age:");
		int age=in.nextInt();
		System.out.println("Enter your salary:");
		double salary=in.nextDouble();
		System.out.println("Details of the person is:");
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Salary is:"+salary);
	}

}

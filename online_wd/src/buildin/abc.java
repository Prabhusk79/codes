package buildin;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner obj=new Scanner(System.in);
System.out.println("Enter your name: ");
String name=obj.nextLine();
System.out.println("Enter your age: ");
int age=obj.nextInt();
System.out.println("enter your salary: ");
double salary=obj.nextDouble();
System.out.println("Details:");
System.out.println("name is"+name);
System.out.println("age is"+age);
System.out.println("salary is"+salary);
	}

}

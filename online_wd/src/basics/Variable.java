package basics;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Prabhu ";
int age=29;
double height=2.56;
float weight=62.5f;
Boolean result=true;
System.out.println("Name is"+name);
System.out.println("age is"+age);
System.out.println("height is"+height);
System.out.println("the weight is"+weight);
System.out.println("result is"+result);
int a=5;
int b=7;
int sum;
sum=a+b;
float side1=22.8f;
float side2=25.7f;
System.out.println("avg of two number is"+sum/2);
System.out.println("area of rectangle is"+a*b);
System.out.println("area of square is"+side1*side2);
/* find product of two double value
 * find perimeter of square 
 * find perimeter of circle
 * find avg of three numbers
 * find bmi
 */
double v1=15.27;
double v2=12.34;
System.out.println("product of the value is"+v1*v2);
/*Perimeter of square
 */
int side=15;
System.out.println("perimeter of square is"+4*side);
/*perimeter of circle
 */
float d=27.34f;
System.out.println("perimeter of circle is"+2*3.14*(d/2));
/*
 Average of three numbers
 */
int n1=36;
float n2=27.43f;
float n3=25;
System.out.println("avg of three number is"+(n1+n2+n3)/3);
/*
bmi calculation
 */
double weight1=62.5f;
double height1=1.72f;
double sum1;
sum1=weight1/(height1*height1);
System.out.println("bmi value is"+sum1);

	}

}

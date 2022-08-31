package loop;

public class Assign18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 Print 7th table using for loop
 */
		for(int a=7;a<=70;a=a+7)
		{
		System.out.println(a);
		}
		/*
		 Print 8th table in reverse order using dowhile loop
		 */
		int b=80;
		do
		{
			System.out.println(b);
			b=b-8;
		}
		while(b>=8);
		/*
		 Print odd numbers from 9 to 19 using while loop
		 */
		int c=9;
		while(c<=19)
		{
			System.out.println(c);
			c=c+2;
		}
	}

}

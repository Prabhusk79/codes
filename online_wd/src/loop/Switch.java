package loop;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String shirt="white shirt";
		switch(shirt)
		{
		case"black shirt":
			System.out.println("price of black shirt is 750");
			break;
		case"red shirt":
			System.out.println("price of red shirt is 650");
			break;
		case"white shirt":
			System.out.println("price of white shirt is 800");
			break;
			default:
				System.out.println("nothing is selected");
				break;
		}
		

	}

}

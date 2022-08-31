package encapsulation;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E2 ba=new E2();
		ba.bank(308151153);
		ba.get();
	}
	private String password;
	//private int pass;
public void setp(String p)

{
	password=p;
}
public void get()
{
	System.out.println(password);
	System.out.println(pass);
}
private int pass;
public void setp1(int p1)
{
	pass=p1;
}


}

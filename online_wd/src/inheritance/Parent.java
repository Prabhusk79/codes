package inheritance;

import encapsulation.E1;
import encapsulation.E2;

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent.ps();
Parent p=new Parent();
p.pn();
E1 en=new E1(); //encapsulation used from another package
en.setp("prabhu");
en.get();
E1 enc=new E1();
enc.setp1(120693);
enc.get();
E2 ba=new E2();
ba.bank(308115369);
ba.get();
	}
public static void ps()
{
	System.out.println("parent class static method");
}
public void pn()
{
	System.out.println("parent class nonstatic method");
}
}

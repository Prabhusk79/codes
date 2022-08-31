package interf;

public interface Intro {
	default public void ns()
	{
		System.out.println("non static method");
	}
	//abstract method
	public void ab();

}

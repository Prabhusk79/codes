package test;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // s="WELCOMETOQTREE" . 1.Convert S TO Lowercase. 2.replace Qtree by Testing. 3.Find no of char in s
		               // 4.Check whether it contains "WELCOME" keyword
		  
		String s="WELCOMETOQTREE";
		System.out.println(s.toLowerCase());
		System.out.println(s.replace("QTREE","TESTING"));
		System.out.println(s.length());
		System.out.println(s.contains("WELCOME"));
	}

}

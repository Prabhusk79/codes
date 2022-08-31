package selenium_filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		
		File f= new File("/Users/varun/Documents/s1.doc");
		FileReader fr= new FileReader(f);
		@SuppressWarnings("resource")
		BufferedReader br= new BufferedReader(fr);
		String line;
	while((line=br.readLine())!=null)
	{
		System.out.println(line);
		}
	}

}

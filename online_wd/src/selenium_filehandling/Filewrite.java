package selenium_filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f= new File("/Users/varun/Documents/sample1.rtf");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("Hello");
		bw.newLine();
		bw.write("bye");
		bw.close();
	}

}

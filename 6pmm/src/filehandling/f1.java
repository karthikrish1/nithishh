package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class f1 {
	public static void main(String[] args) throws IOException  {
		
		//File              : reach the path
		//FileWriter        : create a file
		//BufferedWriter    : write content
		// nonstatic 
		
		File f= new File("ak.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("hi");
		bw.newLine();
		bw.write("hello");
		bw.close();
	}

}

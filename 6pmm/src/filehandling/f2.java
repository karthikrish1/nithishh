package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class f2 {
public static void main(String[] args) throws IOException {
	File f= new File("ak.txt");
	FileReader fw= new FileReader(f);
	BufferedReader bw= new BufferedReader(fw);
	String line;
	while((line=bw.readLine())!=null)
	{
		System.out.println(line);
	}
	
}
}

package exception;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class P5 {
	public static void main(String[] args) 
	{
		
		try
		{
			FileOutputStream f=new FileOutputStream("F://java.txt");
			System.out.println("File creation complete");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Invalid path");
			System.out.println("file creation failed");
		}
	}
}

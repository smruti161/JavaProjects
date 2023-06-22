package exception;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class P6 {
	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("F://sql.txt");
			System.out.println("File creation Done");
		}
		catch(Exception e)
		{
			System.out.println("Invalid path");
			System.out.println("File creation failed");
			e.printStackTrace();
		}
	}
}

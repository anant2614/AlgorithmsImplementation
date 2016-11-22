import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFile {
	public static void main(String args[]) {
		  FileInputStream fis = null;
		    try
		    {
		      fis = new FileInputStream("abc.txt");
		    }catch(IOException e){
		    	e.printStackTrace();
		    }
	}
}

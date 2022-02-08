package shaima;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Exp21 {

	public static void main(String[] args) 
		
			throws IOException {
	     try
	     {
	      File file = new File("a.txt");
	      FileInputStream inputStream = new FileInputStream(file);
	      Scanner sc = new Scanner(inputStream);
	      StringBuffer buffer = new StringBuffer();
	      while(sc.hasNext()) {
	         buffer.append(" "+sc.nextLine());
	      }
	      System.out.println("Contents of the file:\n\n"+buffer);
	      File dest = new File("b.txt");
	      FileWriter writer = new FileWriter(dest);
	      writer.write(buffer.toString());
	      writer.flush();
	      System.out.println("\n\nFile copied successfully.......");
	    }
	    catch (IOException e)
	    {
	            System.out.println("There are some IOException...File not found.....");
	    }
	   }
	   }



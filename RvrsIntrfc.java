package shaima;
import java.util.Scanner;
interface CharSequence
{
  char charAt(int index);
  int length();
  CharSequence subsequence(int start,int end);
  String toString();
}
public class RvrsIntrfc implements CharSequence
{
	String str;
	RvrsIntrfc(String st)
	{
		str=st;
	}
	public  StringtoString()
	{
		int l=this.length();
		String rev="";
		for(int i=l-1;i>=0;i--)
		{
			rev+=this.charAt(i);
		}
		str=rev;
	}
	public char charAt(int index)
	{
		return str.charAt(index);
	}
	public int length()
	{
		return str.length();
	}

	public CharSequence subsequence(int start,int end)
	{
		for(int i=start-1;i<end;i++)
			System.out.print(str.charAt(i));
		return null;
	}
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String:");
		RvrsIntrfc ob=new RvrsIntrfc(in.nextLine());
		int t=1;
		while(t!=5)
		{
			System.out.println("\nEnter Your Choice\n1.Length of String\n2.Display Character at an Index\n3.Reverse the String\n4.Subsequence of the String\n5.Exit");
			t=in.nextInt();
			switch(t)
			{
			case 1:
				System.out.println("Length of the String "+ob.length());
				break;
			case 2:
				System.out.println("Enter the index");
				System.out.println(ob.charAt(in.nextInt()-1));
				break;
			case 3:
				String rev=ob.toString();
		        System.out.println("Reversed String :"+rev);
				break;
			case 4:
				System.out.println("Enter the start and end index of the subsequence:");
				ob.subsequence(in.nextInt(),in.nextInt());
				break;
			}
				
		}
	}
	
}
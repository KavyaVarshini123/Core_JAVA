import java.util.Scanner;
import java.util.Arrays;
public class Anagram 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  the first string ");
		String str1=sc.nextLine();
		System.out.println("enter  the second string ");
		String str2=sc.nextLine();
	if(str1.length() == str2.length())
	{
		char[] Array1=str1.toCharArray();
		char[] Array2=str1.toCharArray();
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		boolean result=Arrays.equals(Array1,Array2);
		if(result)
			System.out.println(str1 + " and " + str2 +" are anagram");
			else
				System.out.println(str1 + " and " + str2 +" are not anagram");
	}
	}
	
	
	
            

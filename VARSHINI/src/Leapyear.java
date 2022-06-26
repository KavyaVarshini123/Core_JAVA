import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		int year=reader.nextInt();
		if (((year%4==0) && (year % 100!=0)) || 
		(year % 400==0))
			System.out.println(year + " leap year");
		else
			System.out.println(year + " not leap year");

	}

}

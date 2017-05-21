import java.util.Scanner;
public class LeapYear {
	public static void main (String agrs[]){
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		a=sc.nextInt();
		if(a%4==0){
			System.out.println("This is a leap year");
		}else{
			System.out.println("This is not a leap year");
		}
	}
}

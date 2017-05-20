import java.util.Scanner;
public class SimpleInterest {
	public static void main (String agrs[]){
		int p,t;
		float r,i;
		System.out.println("Enter the principle amount ");
		Scanner sc= new Scanner(System.in);
		p=sc.nextInt();
		System.out.println("Enter the rate of interest ");
		r=sc.nextFloat();
		System.out.println("Enter the time ");
		t=sc.nextInt();
		i=(p*r*t)/100;
		System.out.println("Simple Interest is "+i);
	}
}

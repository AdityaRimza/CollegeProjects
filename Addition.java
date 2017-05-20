import java.util.Scanner;
public class Addition {
	public static void main(String args[]){
		int a,b,c;
		System.out.println("Enter any two number for addition");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum of "+a+" and "+b+ " is "+c);
	}
}

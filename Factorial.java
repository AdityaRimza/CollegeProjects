import java.util.Scanner;
public class Factorial {
	public static void main(String agrs[]){
		Scanner sc = new Scanner(System.in);
		int a,fact=1;
		System.out.println("Enter the number: ");
		a = sc.nextInt();
		for(int i=1;i<=a;i++){
			fact=fact*i;
		}
		System.out.println("Factorial of "+a+" is "+fact);
	}
}

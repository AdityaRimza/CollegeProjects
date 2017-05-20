import java.util.Scanner;
public class LargestNumber {
	public static void main(String srgs[]){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c){
			System.out.println(a+" is the largest number");
			if(b>c){
				System.out.println(c+" is the smallest number");
			}
			else{
				System.out.println(b+" is the smallest number");
			}
		}
		else if(b>a&&b>c){
				System.out.println(b+" is the largest number");
				if(a>c){
					System.out.println(c+" is the smallest number");
				}
				else{
					System.out.println(a+" is the smallest number");
				}
		} else {
			System.out.println(c+"is the lartest number");
			if(a<b){
				System.out.println(a+" is the smallest number");
			} else {
				System.out.println(b+" is the smallest number ");
			}
		}
	}
}

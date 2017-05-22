import java.util.Scanner;
public class Matrixaddition {
	public static void main (String agrs[]){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix ");
		a=sc.nextInt();
		b=sc.nextInt();
		int first[][] = new int[a][b];
		int second[][] = new int[a][b];
		int sum[][] = new int[a][b];
		System.out.println("Enter the First matrix");
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				first[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Second matrix");
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				second[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
			sum[i][j]=first[i][j] + second[i][j];	
			}
		}
		System.out.print("The sum of the matrix is: ");
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.println(+sum[i][j]);
			}
		}
	}
}

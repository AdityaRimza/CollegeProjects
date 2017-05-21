import java.util.Scanner;
public class Pyramid2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,temp;
		System.out.println("Pyramid 2");
		
		for(int i=4;i>=0;i--){
for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
for(int k=4;k>=i;k--){
	 System.out.print(" ");
            }
          } 
	}

}

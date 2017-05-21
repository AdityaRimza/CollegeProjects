public class Pyramid3 {
	public static void main(String[] args) {
		
		System.out.println("Pyramid 3");
		
		for (int i = 4; i>= 1; i--) 
	        {
	for (int j = 1; j<i; j++) 
	            {
	                System.out.print(" ");
	            }
	for (int j = i; j<= 4; j++)
	            {
	                System.out.print("* ");
	            }	
	            System.out.println();
	        }
	}
}

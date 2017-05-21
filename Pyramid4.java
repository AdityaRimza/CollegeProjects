
public class Pyramid4 {
	public static void main(String[] args) {
		
		System.out.println("Pyramid 4");
		for(int i=1;i<4;i++)
			{
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}
					for(int k=1;k<(i*2);k++)
					{
						System.out.print("*");
					}	
						System.out.println();
			}
		for(int i=2;i>=1;i--)
			{
				for(int j=5;j>i;j--)
					{
						System.out.print(" ");
					}
						for(int k=1;k<(i*2);k++)
						{
							System.out.print("*");
						}
						System.out.println();
			}
	}

}

public class Atrerisk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i = 0; i < 5; i++)
			{
				for(int j = 5; j > 0 + i; j--)
				{
					System.out.print("*");
				}
				
				System.out.print(" ");
				System.out.println();
			}
			System.out.println();
			for(int i = 0; i < 5; i++)
			{
				for(int j = 0; j < i + 1; j++)
				{
					System.out.print("*");
				}
				System.out.print(" ");
				
				System.out.println();
			}
			System.out.println();
			for(int i = 0; i < 5; i++)
			{
				for(int k = 0;k < 4 - i; k++)
				{
					System.out.print(" ");
				}
				for(int j = 0; j < i + 1; j++)
				{
					System.out.print("*");
				}
				//System.out.print("*");
				
				System.out.println();
			}
			System.out.println();
			for(int i = 0; i < 5; i++)
			{
				for(int k = 0;k < i; k++)
				{
					System.out.print(" ");
				}
				for(int j = 5; j > i ; j--)
				{
					System.out.print("*");
				}
				//System.out.print("*");
				
				System.out.println();
			}
	}

}

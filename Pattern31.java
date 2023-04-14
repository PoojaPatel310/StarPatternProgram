package Pattern;
public class Pattern31 {

	public static void main(String[] args) {
		char letter='F';
		for(char i='A';i<=letter;i++)
		{
			for(int k=1;k<=letter-i;k++)
			{
				System.out.print(" ");
			}
			for(char j='A';j<=i;j++)
			{
				if(i=='A'||j==i|| j=='A')
				{
				System.out.print(i+" ");
				}
				else
				{
				System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
		
		letter--;
		for(char i=letter;i>='A';i--)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("x ");
			}
			for(char j='A';j<=letter;j++)
			{
				if(i=='A'||j==i|| j=='A')
				{
				System.out.print(i+" ");
				}
				else 
				{
					System.out.print("  ");
				}
				
				
			}
			letter--;
			System.out.println(" ");
		}
	}

}

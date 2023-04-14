package Pattern;
public class Pattern30 {

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
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}

	}

}

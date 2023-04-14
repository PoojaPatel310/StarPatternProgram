package Pattern;
public class Pattern28 {

	public static void main(String[] args) {
		//char[] letter={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char letter='F';
		for(char i='A';i<=letter;i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
			}
		System.out.println("");
		}

	}

}

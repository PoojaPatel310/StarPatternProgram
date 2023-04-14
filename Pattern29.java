package Pattern;
public class Pattern29 {

	public static void main(String[] args) {
		
		int n= 6;
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1; j<=(n+1)-i; j++)
			{
			     int c = 64+j;
				System.out.print((char)c+" ");
				
			}
			
		System.out.println("");
		
		}
		
		
		for(int i=65;i<=70;i++)
		{
			for(char j=65;j<=i;j++)
			{
				System.out.print((char)j+" ");
			}
			
		System.out.println("");
		}

	}

}

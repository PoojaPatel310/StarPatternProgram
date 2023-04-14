package Pattern;
public class Pattern14 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=(n-i) ;k++)
			{
				System.out.print("  ");
			}			
			for(int j=1;j<=(i*2)-1;j++)
			{
				if(i==1 || j==1 || j == (i*2)-1 || i==n)
				{
				System.out.print("* ");
				}else
				{
					System.out.print("  ");					
				}
			}
			System.out.println("");
		}
	}

}

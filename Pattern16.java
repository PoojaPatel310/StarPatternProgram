package Pattern;
public class Pattern16 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			System.out.println("");
			for(int k=1;k<=(n-i) ;k++)
			{
				System.out.print("   ");
			}			
			for(int j=1;j<=(i*2)-1;j++)
			{
				if(i==1  ||j==1 ||j==(i*2)-1)
				{
				System.out.print("*  ");
				}else
				{
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("");
			for(int k=1;k<=i;k++)
			{
				System.out.print("   ");
			}			
			for(int j=1;j<=(n+3)-((i*2)-1);j++)
			{
				if(i==n ||j==1 ||j==(n+3)-((i*2)-1))
				{
				System.out.print("*  ");
				}else
				{
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
	}

}

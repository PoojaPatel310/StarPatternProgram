package Pattern;
public class Pattern24 {

	public static void main(String[] args) {
		int size=5;
		int n=1;
		for(int i=1; i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
			//System.out.print("* ");
				if(n==1)
				{
					n=0;
				}
				else {
					n=1;
				}			
				System.out.print(n);
			}
		
		System.out.println();
		}
	}

}

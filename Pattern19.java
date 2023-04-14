package Pattern;
public class Pattern19 {

	public static void main(String[] args) {
		int size=7;
		int start=1;
		int middlecol=size/2+1;
		
	
	
		for(int i=1;i<=size;i++)
		{
			
			for(int k=1;k<=size-i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
			if(j==1 || j==i)
				{
				System.out.print(start+" ");
				}
			else if(j==i)
				{
				System.out.print("*");
				}				
			else
				{
				System.out.print(i-1+" ");	
			
				}
			
			}
		System.out.println("");
	
	
		}
		
	}

}

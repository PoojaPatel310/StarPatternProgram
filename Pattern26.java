package Pattern;
public class Pattern26 {

	public static void main(String[] args) {
		int size=5;
		
		int start;
		
		for(int i=1; i<=size ;i++)
		{
			for(int k=1;k<=i;k++)
			{
					System.out.print(" ");
			}
			start=i;
			for(int j=size; j>=i; j--) 
				{
				System.out.print(start+" ");
				start++;		
				}			
		System.out.println();
		}
		
		for(int i=1; i<=size-1 ;i++)
		{
			for(int k=1;k<=size-i;k++)
			{
					System.out.print(" ");
			}
			start=size-i;
			for(int j=1; j<=i+1; j++) 
				{
				
				System.out.print(start+" ");
				start++;		
				}			
		System.out.println();
		}
	}

}
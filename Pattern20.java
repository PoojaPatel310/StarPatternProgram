package Pattern;import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of row");
		int size = sc.nextInt();
		
		int space=size/2;
		int start=1;
		int noOfColumn=1;
		
		for(int i=1;i<=size;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
				if(i<size/2+1)
				{
					start=i;
					space=space-1;
				}
				else
				{
					start=(size+1)-i;
					space=space+1;
				}
				
			for(int j=1;j<=noOfColumn; j++) 		
			{
				int middleColumn=noOfColumn/2+1;
				System.out.print(start);
				if(j<middleColumn)
				{
					start--;
				}
				else 
				{
					start++;
				}
			
				
			}
		System.out.println();
		if(i<size/2+1)
			{
			noOfColumn=noOfColumn+2;
			}
		else 
			{
			noOfColumn=noOfColumn-2;
			}
		}
		sc.close();
	}
	
}


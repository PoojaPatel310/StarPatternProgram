package Pattern;import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		
		Scanner row = new Scanner(System.in);
		System.out.println("Enter the value of row ");
		int n= row.nextInt();
		Scanner numStart = new Scanner(System.in);
	    System.out.println("Enter the value of starting number");
	    int k= numStart.nextInt();	    
		for(int i=1;i<=n;i++)
		{		
			for(int j=1; j<=i; j++)
			{
				System.out.print(k++ +"  ");
			}
			System.out.println("");			
		}		
		row.close();
		numStart.close();
	}
}

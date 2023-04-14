package Pattern;
import java.util.Scanner;

public class Pattern_flag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int k=1; k<=n; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=n*3; j++)
			{
				if(i==1 ||i==n/3 || i==(2*(n/3)) || i==n ) 
				{
				System.out.print("-");
				}
				else if(j==1 ||j==3 || j==n*3)
				{
					System.out.print("|");
				}
					
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i=1; i<=n; i++)
		{
			for(int k=1; k<=n; k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=3; j++)
			{
				if(j==1 ||j==3)
				{
					System.out.print("|");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		for(int i=1; i<=3; i++)
		{
			for(int k=1; k<=n/2; k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=n+4; j++)
			{
				if(i==1 || i==3 )
				{
				System.out.print("-");
				}
				else if(j==1 || j==n+4)
				{
				System.out.print("|");
				}	
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i=1; i<=3; i++)
		{
			for(int k=1; k<=n/3; k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=n+8; j++)
			{
				if(i==1 || i==3 )
				{
				System.out.print("-");
				}
				else if(j==1 || j==n+8)
				{
				System.out.print("|");
				}	
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i=1; i<=3; i++)
		{
			for(int k=1; k<=n/5; k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=n+12; j++)
			{
				if(i==1 || i==3 )
				{
				System.out.print("-");
				}
				else if(j==1 || j==n+12)
				{
				System.out.print("|");
				}	
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		sc.close();
	}

}

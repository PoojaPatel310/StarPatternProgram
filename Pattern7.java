package Pattern;
import java.io.Closeable;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			for (int k = 1; k <=i-1; k++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=(n+1)-i; j++) 
			{
				System.out.print("* ");
			}
			
			System.out.println("");
		}

		for(int i=1;i<=n-1;i++)
		{
			for(int k=1;k<=n-(i+1);k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println("");
		}
		sc.close();
	}

}
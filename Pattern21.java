package Pattern;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Pattern21 {

	public static void main(String[] args) {
		
		Scanner row = new Scanner(System.in);
		System.out.println("Enter the value of Row");
		int n = row.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i ;j++)
			{
				System.out.print(i +" ");
			}			
			System.out.println("");
		}

	}

}

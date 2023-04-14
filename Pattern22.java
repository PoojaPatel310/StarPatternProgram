package Pattern;
import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {

    Scanner row = new Scanner(System.in);
    System.out.println("Enter the value of Row");
    int n= row.nextInt();
    
    for(int i=n; i>=1; i--)
    {
    	for(int j=n; j>=i; j--)
    	{
    		System.out.print(j+ ""); 	
    		
    	}
    	System.out.println("");  
    
    }
    row.close();
	}

}

package Pattern;
public class Pattern32 {

	public static void main(String[] args) {
		int n=1;
		int size=5;
		int space=size-1;
		for(int i=1;i<=size;i++)
		{
			int k=0;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				if(j<=i)
				{
					k=k+1;
				}
				else
				{
					k=k-1;
				}
				System.out.print(k);
			}
		System.out.println();
		n=n+2;
		space=space-1;

	}

}
}

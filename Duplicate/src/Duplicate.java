import java.util.Scanner;
import java.util.Arrays;
public class Duplicate 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] a;
		final int ARRAY_LENGTH=5;
		a = new int[ARRAY_LENGTH];
		int i,j,k=0;
		Scanner input = new Scanner(System.in);
		for(i=0;i<ARRAY_LENGTH;i++)
		{System.out.printf("\nenter a number");
		a[i]=input.nextInt();
		if(a[i]>10&&a[i]<100)
		{for(j=0;j<i;j++)
		{
		
			if(a[j]==a[i])
			{   k++; 
   				continue;
			}
			
			
		}
		if(k==0)
		{System.out.printf("\n%d",a[i]);
		}
		else
		{System.out.printf("\nrepeated entry");
		}
		
		k=0;
		}
		else
		{System.out.printf("\ninvalid entry:Enter again");
		i--;
		}
		}
		
	}
}
		



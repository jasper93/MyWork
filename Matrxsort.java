import java.io.*;
import java.util.*;
class Matrxsort
{
	int a,b,c,d,e;
	int arr[][] = new int[6][6];
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter values :");
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
			arr[i][j] = sc.nextInt();
			}
		}
	}
	void set()
	{
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(arr[i][j]>1 && arr[i][j]<20)
				{
					a++;
				}
				else if(arr[i][j]>21 && arr[i][j]<40)
				{
					b++;
				}
				else if(arr[i][j]>41 && arr[i][j]<60)
				{
					c++;
				}
				else if(arr[i][j]>61 && arr[i][j]<80)
				{
					d++;
				}
				else if(arr[i][j]>81 && arr[i][j]<100)
				{
					e++;
				}
			}
		}
	}
	void show()
	{
		System.out.println("The values between 1 & 20 :" + a);
		System.out.println("The values between 21 & 40 :" + b);
		System.out.println("The values between 41 & 60 :" + c);
		System.out.println("The values between 61 & 80 :" + d);
		System.out.println("The values between 81 & 100 :" + e);
	}
	public static void main(String []ar)
	{
		Matrxsort ms = new Matrxsort();
		ms.get();
		ms.set();
		ms.show();
	}
}

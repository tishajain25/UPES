/* Write a program to accept three digits (i.e., 0 - 9) and print all its possible combinations.  
(For example if the three digits are 1, 2, 3 than all possible combinations are : 123, 132, 
213, 231, 312, 321.). */

import java.util.*;
public class Combinations
{
	public static void main(String[] args)
	{ 
		Scanner Sc=new Scanner(System.in);
		int input[] =new int[3];
		int c=0;
		System.out.println("Enter the numbers");
		for (int i = 0; i < 3; i++) 
		{
			input[i]=Sc.nextInt();
		} 
		for (int x = 0; x < 3; x++) 
		{ 
			for (int y = 0; y < 3; y++) 
			{ 
				for (int z = 0; z < 3; z++) 
				{ 
					if (x != y && y != z && z != x) 
					{
						c=input[x]*100+input[y]*10+input[z];
						System.out.println(c);
					}
				}
			}
		}
	}
}

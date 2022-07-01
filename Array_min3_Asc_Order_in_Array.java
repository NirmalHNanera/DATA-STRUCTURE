//int arr[]=new int[]{1,1,1,1,1,2,2,2,3,4,4,4};
//acending order and minimum 3 Number continuously in Array

import java.util.*;
class Array_min3_Asc_Order_in_Array{
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int arr[]=new int[]{1,1,1,2,2,2,2,3,3,3,4};
		int count=0;
		int min_value=1;
		int i=1;
		while(i<arr.length)
		{
			if(arr[i-1]<=arr[i])
			{
				if(arr[i-1]==arr[i])
				{
					min_value++;
				}
				else if(min_value>=3&&arr[i-1]!=arr[i])
				{
					min_value=1;
				}
				else if(min_value<3&&arr[i-1]!=arr[i])
				{
					count++;
					break;
				}
				/*else
				{
					break;
				}*/
			i++;	
			}
		
			else
			{
				count++;
				break;
			}
		}
		if(min_value<3)
		{
			System.out.print(0);
		}
		else if(count==0)
		{
			System.out.print(1);
		}
		
		else
		{
			System.out.println(0);
		}
	}
}
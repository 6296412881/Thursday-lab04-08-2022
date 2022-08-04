package arrayexamples;

import java.util.Arrays;

public class MergeArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {56,78,90,32,67,12}; 
		int[] b = {11,14,9,5,2,23,15};  
		int length = a.length + b.length; //add a into b
		int[] mergeArray = new int[length];    
		int pos = 0;  
		for (int i : a) 
		{  
		mergeArray[pos] = i;  
		pos++;               
		}  
		for (int i : b)
		{  
		mergeArray[pos] = i;  
		pos++;  
		}  
		System.out.println(Arrays.toString(mergeArray));   //prints the array  
		}  
		}
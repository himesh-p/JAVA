//48. Write a Java program to arrange the elements of an array of integers so that all negative integers appear before all positive integers.  

import java.util.Arrays;  
public class Arr48{
	public static void main(String[] args){
		int arr[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
		
		for(int i = 0; i<arr.length ; i++){
			System.out.print(arr[i]+", ");
		}
		Arrays.sort(arr);
		System.out.println("After sorting array :- ");
		for(int i = 0; i<arr.length ; i++){
			System.out.print(arr[i]+", ");
		}	
		System.out.println("After sorting array :- ");
		for(int i = arr.length-1; i>=0 ; i--){
			System.out.print(arr[i]+", ");
		}
	}
}
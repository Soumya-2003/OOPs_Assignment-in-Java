// Implement Binary Search in Java

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input no. of elements to insert: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.print("Input the elements of the array\n");
		for(int i = 0; i < n; i++){
			System.out.print("Input arr[" + i + "]: ");
			arr[i] = sc.nextInt();
		}
		
		// Sort the array first
		Arrays.sort(arr);
		System.out.println("After sorting array is: " + Arrays.toString(arr));		

		int choice;
		System.out.print("Enter the element you want to search: ");
		
		choice = sc.nextInt();
		int pos = binary_search(arr, choice);

		if(pos >= 0)	System.out.println(choice + " Found at index: " + pos);
		else System.out.println(choice + " Not Found!");
				
	}

	static int binary_search(int[] arr, int choice){
		int low = 0, high = arr.length;
		while(low <= high){
			int mid = (low+high)/2;
			if(arr[mid] == choice){
				return mid;
			}
			else if(arr[mid] > choice){
				high = mid-1;
			}
			else {low = mid + 1;}
		}
		return -1;
	}
}
package com;

public class BinarySearch {
	public static void main( String[] args){
	
   	int[] arr = {6, 7, 8, 9, 12, 13, 29, 32, 1, 2, 4};
	int target = 9;
	
	int first = 0;
	int last = arr.length-1;
	int middle = (int) first + (last - first)/2;

	
	if (arr[last] == target){
		middle = last;
	}
	
	if (arr[first] == target){
		middle = first;
	}
	
	while (arr[middle] != target){
		middle = first + (last - first)/2;
		
		if ((arr[middle] > target && arr[first] > target) || (arr[middle] < target)){
			first = middle;
		} 
			
		if (arr[middle] > target && arr[first] < target){
			last = middle;
		}
		
	}	
	
	System.out.println("Target " + target);
	System.out.println("index of target " + middle);

	}
}

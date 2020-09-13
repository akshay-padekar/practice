package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestRange {

	public static void main(String args[]) {
//		int arr[] = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6, 10, 6};
//		int arr[] = {10};
//		int arr[] = {28,0,11,5,3,21,6,22,2,23,26,12,20,1,99,27,100,25,8,24};
//		int arr[] = {1, 2};
//		int arr[] = {8, 4, 2, 10, 3, 6, 7, 9, 1};
//		int arr[] = {4,2,1,3};
//		int arr[] = {19,-1,18,17,2,10,3,12,5,16,4,11,8,7,6,15,12,12,2,1,6,13,14};
//		int arr[] = {0,9,19,-1,18,17,2,10,3,12,5,16,4,11,8,7,6,15,12,12,2,1,6,13,14};
//		int arr[] = {-7,-7,-7,-7,8,-8,0,9,19,-1,-3,18,17,2,10,3,12,5,16,4,11,-6,8,7,6,15,12,12,-5,2,1,6,13,14,-4,-2};
//		int arr[] = {1, 1, 1, 3, 4};
		int arr[] = {-1, 0, 1};
		int res[] = LargestRange.largestRange(arr);
//		for (int i : res) {
//			System.out.print(i+" ");
//		}
	}
	
	public static int[] largestRange(int arr[]){
		Arrays.sort(arr);
		
		int eindex = 0, sindex = 0;
		List idx = new ArrayList<Integer>(2);
		idx.add(0,(Integer)sindex);
		idx.add(1,(Integer)eindex);
		
		if(arr.length == 1) {
			return new int[]{arr[(int)idx.get(0)], arr[(int)idx.get(0)]} ;
		}
		
		for (int i : arr) {
			if (eindex < arr.length) {
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				if(arr[eindex] == arr[eindex+1]) {
					eindex++;
					continue;
				}
				if(arr[eindex+1] == arr[eindex] + 1) {
					eindex++;
				} else {
					if((int)idx.get(1) - (int)idx.get(0) < (eindex - sindex) ) {
						idx.set(0,(Integer)sindex);
						idx.set(1,(Integer)eindex);	
					}
					sindex = eindex + 1;
					eindex = sindex;
				}	
			}
		}
	
		System.out.println(arr[(int)idx.get(0)]+" "+arr[(int)idx.get(1)]);
		
		return new int[]{arr[(int)idx.get(0)], arr[(int)idx.get(1)]} ;
	}
}

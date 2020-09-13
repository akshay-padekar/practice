package algoexpert;

import java.util.Arrays;
import java.util.HashMap;

public class TwoNumberSum {
	public static void main(String args[]) {
	
		int arr[] = new int[] {-4, -1, 1, 13, 5, 4, 8, 11};
		int targetSum = 13;
		int[] nums= TwoNumberSum.twoNumSumUsingLRPointer(arr, targetSum);
		
		for(int num : nums){
			System.out.print(num+" ");
		}
	}
	
	//time complexity O(n^2) 
	//space complexity O(1)
	static int[] twoNumSum(int arr[], int targetSum) {	
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == targetSum)
					return new int[] {arr[i], arr[j]};
			}
		}
		return new int[] {};
	}
	
	//time complexity O(n)
	//space complexity O(n)
	static int[] twoNumSumUsingHashMap(int arr[], int targetSum) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for(int num : arr) {
			int potentialMatch = 0;
			potentialMatch = targetSum - num;
			if (map.containsKey(potentialMatch)) {
				return new int[] {potentialMatch, num};
			} else {
				map.put(num, Boolean.TRUE);
			}
		}
		return new int[] {};
	}
	
	//time complexity O(nlog(n))
	//space complexity O(1)
	static int[] twoNumSumUsingLRPointer(int array[], int targetSum) {
		int tempTargetSum = 0;
		int lpIndex = 0;
		int rpIndex = array.length - 1;
		Arrays.sort(array);
		for(int i = 0; i < array.length; i++) {
			tempTargetSum = array[lpIndex] + array[rpIndex];
			if (tempTargetSum == targetSum) {
				return new int[] {array[lpIndex], array[rpIndex]};
			} else if (tempTargetSum < targetSum) {
				lpIndex = lpIndex + 1;
			} else {
				rpIndex = rpIndex - 1;
			}
		}
		
		return new int[] {};
	}
}

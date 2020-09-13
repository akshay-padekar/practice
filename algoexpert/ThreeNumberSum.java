package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
	public static void main (String args[]) {
		int array[] = new int[] {12, 3, 1, 2, -6, 5, -8, 6};
		int targetSum = 0;
		List<Integer[]> result =  ThreeNumberSum.threeNumberSum_Sol2(array, targetSum);	
		for (Integer[] integers : result) {
			for (Integer integer : integers) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}
	}
	
	public static List<Integer[]> threeNumberSum_Sol1(int[] array, int targetSum) {
	    int num1 =0, num2=0, num3 = 0, tempTargetSum = 0;
	    List<Integer[]> result = new ArrayList<Integer[]>();
	    Arrays.sort(array);
		for (int i = 0; i<array.length - 2; i++ ) {
			for (int j= i + 1; j<array.length - 1; j++) {
				for (int k = j + 1 ; k < array.length ;k ++) {
					num1 = array[i]; num2 = array[j]; num3 = array[k];
					tempTargetSum = num1 + num2 + num3;
					if (tempTargetSum == targetSum) {
						Integer[] tmp = new Integer[] {num1, num2, num3};
						Arrays.sort(tmp);
						result.add(tmp);
					}
				}
			}
		}
		
	    return !result.isEmpty() ? result : new ArrayList<Integer[]>() {};
	  }
	
	
	//time complexity O(n^2)
	//space complexity O(n)
	public static List<Integer[]> threeNumberSum_Sol2(int[] array, int targetSum) {
		List<Integer[]> result = new ArrayList<Integer[]>();
		int lpIndex = 0, rpIndex = 0, cpIndex = 0, tempTargetSum = 0;
		Arrays.sort(array);
		while(cpIndex < array.length - 2) {
			lpIndex = cpIndex + 1;
			rpIndex = array.length - 1;
			while (lpIndex < rpIndex ) {
				tempTargetSum = array[cpIndex] + array[lpIndex] + array[rpIndex];
				if (tempTargetSum == targetSum) {
					Integer[] tmp = new Integer[] {array[cpIndex],array[lpIndex],array[rpIndex]};
					Arrays.sort(tmp);
					result.add(tmp);
					lpIndex++;
					rpIndex--;	
				} else if (tempTargetSum < targetSum) {
					lpIndex++;
				} else {
					rpIndex--;
				}
			}
			cpIndex++;
		}
		return !result.isEmpty() ? result : new ArrayList<Integer[]>() {};
	}
}

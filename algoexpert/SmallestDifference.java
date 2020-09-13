package algoexpert;

import java.util.Arrays;

public class SmallestDifference {
	public static void main (String args[]) {
		int[] arrayOne = new int[] {-1,5,10,20,28,3};
		int[] arrayTwo = new int[] {26,134,135,15,17};

		int[] result = smallestDifference_Sol2(arrayOne, arrayTwo);
		for (int res : result) {
			System.out.print(res+ " ");
		}
	}
	
	
	public static int[] smallestDifference_Sol1(int[] arrayOne, int[] arrayTwo) {
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int absval = 0, minabsdiff = 999999;
		int[] result = new int[2];
		for(int i=0;i<arrayOne.length;i++) {
			for(int j=0;j<arrayTwo.length;j++) {
				absval = Math.abs(arrayOne[i]- arrayTwo[j]);
				if (absval < minabsdiff) {
					minabsdiff = absval;
					result[0] = arrayOne[i];
					result[1] = arrayTwo[j];
				}
 			}
		}
		return !(result.length == 0) ? result : new int[] {0, 0};
	}
	
	public static int[] smallestDifference_Sol2(int[] arrayOne, int[] arrayTwo) {
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int lp = 0, rp = 0, current = 0, smallest = Integer.MAX_VALUE;
		int[] result = new int[2];
		int firstNum = 0, secondNum =0;
		
		while(lp < arrayOne.length  && rp < arrayTwo.length) {
			firstNum = arrayOne[lp];
			secondNum = arrayTwo[rp];
			if (firstNum < secondNum) {
				current = secondNum - firstNum;
				lp++;
			} else if (secondNum < firstNum) {
				current = firstNum - secondNum;
				rp++;
			} else {
				result[0] = firstNum;
				result[1] = secondNum;
			}
			
			if (current < smallest) {
				smallest = current;
				result[0] = firstNum;
				result[1] = secondNum;
			}
		}
		return result;
	}
	
}

package algoexpert;

import java.util.ArrayList;
import java.util.List;

public class LongestPeak {

	public static void main (String args[]) {
		
	int[] array = new int[] {1,2,3,3,4,0,10,6,5,-1,-3,2,3};	
//	LongestPeak.longestPeak(array);
	System.out.println("max peak length : "+ LongestPeak.longestPeak(array));	
	}
	
	public static int longestPeak(int[] array) {
		
		int i = 1;
		boolean isPeak = false;
		int k = 0, leftIdx = 0, rightIdx = 0, tempPeakLegth = 0, peakLength = 0;
		while(i < array.length - 1) {
			
			isPeak = (array[i-1] < array[i]) && (array[i] > array[i+1]);
			
			if (isPeak) {
				
				leftIdx =  i - 2;
				while(leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) 
					leftIdx--;
				
				rightIdx = i + 2;
				while(rightIdx < array.length && array[rightIdx] < array[rightIdx - 1])
					rightIdx++;
				
				tempPeakLegth = rightIdx - leftIdx - 1;
				if (tempPeakLegth > peakLength) {
					peakLength = tempPeakLegth;
				}
				i = rightIdx;
				continue;
			}
				
			i++;
		}
		
		return peakLength;
	}
	
	public static int longestPeak_Sol2(int[] array) {
		
		List<Integer> listOfPeakIndex = new ArrayList<Integer>();		
		int i = 1;
		while(i < array.length - 1) {
			
			if ((array[i-1] < array[i]) && (array[i] > array[i+1]))
				listOfPeakIndex.add(i);
			i++;
		}
		
		int k = 0, leftIdx = 0, rightIdx = 0, tempPeakLegth = 0, peakLength = 0;
		while(k < listOfPeakIndex.size()) {
			
			leftIdx =  listOfPeakIndex.get(k) - 2;
			
			while(leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) 
				leftIdx--;
			
			rightIdx = listOfPeakIndex.get(k) + 2;
			while(rightIdx < array.length && array[rightIdx] < array[rightIdx - 1])
				rightIdx++;
			
			tempPeakLegth = rightIdx - leftIdx - 1;
			
			if (tempPeakLegth > peakLength) {
				peakLength = tempPeakLegth;
			}
		k++;
		}
		
		return peakLength;
	}
}



package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

	public static void main(String args[]) {
		int[] intarr = {5,1,22,25,6,-1,8,10};
		List<Integer> array = new ArrayList<Integer>();
		
		for(int a : intarr) {
			array.add(a);
		}
		
//		int[] intseq = {1,6,-1,10};
		int[] intseq = {10, 10};
		List<Integer> sequence = new ArrayList<Integer>();
		
		for(int s : intseq) {
			sequence.add(s);
		}
		
		System.out.println("Result : "+ValidateSubsequence.isValidSubsequence(array, sequence));
	}
		
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
	    
		int i = 0, k = 0;
		
		while(i < array.size() && k < sequence.size()) {
			if(array.get(i) == sequence.get(k))
				k++;
			i++;
		}
			
	    return k == sequence.size() ? true : false;
	  }
}

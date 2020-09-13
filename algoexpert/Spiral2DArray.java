package algoexpert;

import java.util.ArrayList;
import java.util.List;

public class Spiral2DArray {
	
	public static void main (String args[]) {
		int array[][] = new int[][] {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
		Spiral2DArray.spiralTraverse(array);
	}

	
	public static List<Integer> spiralTraverse(int[][] array) {
		
		List<Integer> nums = new ArrayList<Integer>();
		
		if(array.length == 0 || array.length == 1)
			return nums;
		
		int top = 0, bottom = array.length - 1;
		int left = 0, right = array[0].length - 1;
		
		int size = array.length * array[0].length;
		
		while (nums.size() < size) {
			
			for(int i = left; i <= right && nums.size() < size; i++) {
				nums.add(array[top][i]);
			}
			top++;
			
			for(int i = top; i <= bottom && nums.size() < size; i++) {
				nums.add(array[i][right]);
			}
			right--;
			
			for(int i = right; i >= left && nums.size() < size; i-- ) {
				nums.add(array[bottom][i]);
			}
			bottom--;
			
			for(int i = bottom; i >= top && nums.size() < size; i--) {
				nums.add(array[i][left]);
			}
			left++;
		}

		return nums;
	}
}

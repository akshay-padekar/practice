package algoexpert;

public class MonotonicArray {
	public static void main (String args[]) {
		
		int[] array2 = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
		int[] array1 = new int[] {1, 2, 4, 7, 1102, 9001};
		int[] array3 = new int[] {-1, -1, -2, -3, -4, -4,-4, -5, -5, -5, -6, -7, -8, -8, -9, -10, -11};
		int[] array4 = new int[] {1, 1, 2, 3,3,3,3,3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11};
		System.out.println("Is array monotonic : "+isMonotonic(array3));;
	}
	
	public static boolean isMonotonic(int[] array) {
	    // Write your code here.
		
		if(array.length == 0 || array.length == 1)
			return true;
		
		int i = 1;
		char trend = '0';
		while (i < array.length) {
			if (array[i] == array[i-1] || array[i] == array[i-1]) {
			  i++;
			  continue;
			} else if(array[i] > array[i-1] && (trend!= 'd' || trend == '0')) {
				trend = 'u';
				i++;
				continue;
			} else if (array[i] < array[i-1] && (trend != 'u' || trend == '0')) {
				trend = 'd';
				i++;
				continue;
			} else {
				break;	
			}
		}
		System.out.println("direction is : "+trend);
	    return i == array.length ? true : false;
	  }
}

package algoexpert;

public class SubArraySort {

    public static void main (String args[]) {
        int arr[] = new int[]{1,2,4,7,10,11,7,12,6,7,16,18,19};
        for(int i: subarraySort(arr)){
            System.out.println(i);
        }

    }

    public static int[] subarraySort(int[] array) {
        // Write your code here.
        int minOutOfOrder = Integer.MAX_VALUE;
        int maxOutOfOrder = Integer.MIN_VALUE;
        int currentNum;
        for(int i=0;i<array.length;i++) {
            currentNum = array[i];
            if (isOutOfOrder(i, currentNum, array)) {
                minOutOfOrder = Math.min(minOutOfOrder, currentNum);
                maxOutOfOrder = Math.max(maxOutOfOrder, currentNum);
            }
        }

        if(minOutOfOrder == Integer.MAX_VALUE)
            return new int[]{-1, -1};

        int leftSubArrayIndex = 0;
        while(minOutOfOrder >= array[leftSubArrayIndex]) {
            leftSubArrayIndex++;
        }

        int rightSubArrayIndex = array.length-1;
        while(maxOutOfOrder <= array[rightSubArrayIndex]) {
            rightSubArrayIndex--;
        }

        return new int[]{leftSubArrayIndex, rightSubArrayIndex};
    }

    private static boolean isOutOfOrder(int i, int num, int[] array) {
        if(i==0)
            return array[i] > array[i+1];
        if(i==array.length-1)
            return array[i] < array[i-1];

        return array[i] > array[i+1] || array[i] < array[i-1];
    }
}

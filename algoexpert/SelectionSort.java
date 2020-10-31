package algoexpert;

public class SelectionSort {
    public static void main (String args[]) {
        int[] array = new int[]{8, 5, 2, 9, 5, 6, 3};
        for (int num: selectionSort_(array)) {
            System.out.print(num+" ");
        }
    }

    public static int[] selectionSort(int[] array) {
        int minIdx;
        for(int i = 0;i< array.length-2;i++){
            minIdx = i;
            for(int j = i+1;j<array.length-1;j++) {
                if(array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            swap(array, i, minIdx);
        }
        return array;
    }

    public static int[] selectionSort_(int[] array) {
        int currentIdx = 0, smallIdx;
        while(currentIdx < array.length - 1) {
            smallIdx = currentIdx;
            for (int i = currentIdx + 1; i<array.length;i++) {
                if(array[i] < array[smallIdx]) {
                    smallIdx = i;
                }
            }
            swap(array, smallIdx, currentIdx);
            currentIdx++;
        }
        return array;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}

package algoexpert;

public class InsertSort {
    public static void main(String args[]){
        int array[] = {1, 0, 99, 45, 3 , 0};
        for(int num: insertionSort_(array)){
            System.out.print(num+" ");
        }
    }

    public static int[] insertionSort(int[] array) {
        int j;
        for(int i = 1;i<array.length;i++){
            j = i;
            while(j > 0 && array[j] < array[j-1]){
                swap(array, j, j-1);
                j = j-1;
            }
        }

        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] insertionSort_(int[] arr){
        int i, key;
        for (int j = 1;j< arr.length;j++){
            key = arr[j];
            i = j-1;
            while(i >= 0 && arr[i] > key) {
                arr[i+1] = arr[i];
                i = i-1;
            }
            arr[i+1] = key;
        }
        return arr;
    }
}

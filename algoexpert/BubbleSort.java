package algoexpert;

import java.net.StandardSocketOptions;

public class BubbleSort {
    public static void main (String args[]) {
        int array[] = new int[] {10, 78, 3, 5, 0};
        int ans[] = bubbleSort___(array);
        for(int num: ans){
            System.out.print(num+" ");
        }
    }
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i< array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j]>array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSort_(int[] array){
        int noOfSwaps = 0;
        boolean isSwapped =true; //only for first time to pass test on line 30
        for(int i=0;i<array.length;i++){
            if (isSwapped) {
                for(int j=0;j<array.length-1;j++){
                    isSwapped = false;
                    if(array[j]>array[j+1]){
                        isSwapped = true;
                        int temp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = temp;
                        noOfSwaps++;
                    }
                }
            }
        }

        System.out.print("Swapped "+noOfSwaps+" times.");
        return array;
    }

    public static int[] bubbleSort__(int[] array) {

        boolean isSorted = false;
        int counter = 0;
        while(!isSorted) {
            isSorted = true;
            for(int i=0;i<array.length - 1 - counter;i++){
                if(array[i]>array[i+1]){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
                counter++;
            }
        }
        return array;
    }

    public static int[] bubbleSort___(int[] array) {
        if(array.length == 0) return new int[] {};

        boolean isSorted = false;
        int counter = 0;
        while(!isSorted) {
            isSorted = true;
            for(int i=0;i<array.length - 1 - counter;i++){
                if(array[i]>array[i+1]){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
            counter++;
        }

        return array;
    }
}

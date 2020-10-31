package algoexpert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourNumberSum {
    public static void main (String args[]) {

        List<Integer[]> ans = fourNumberSum(new int[]{7, 6, 4, -1, 1, 2}, 16);;
        for(Integer[] ansArr : ans){
            for (Integer arr: ansArr) {
                System.out.print(arr+" ");
            }
            System.out.println();
        }
    }

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int currentNumIdx = 0;
        int SUM_P = 0, SUM_Q = 0, diff = 0;
        Integer[] tempCollection;
        ArrayList<Integer[]> quadruplets = new ArrayList<Integer[]>();
        HashMap<Integer, ArrayList<Integer[]>> hashMap = new HashMap<Integer, ArrayList<Integer[]>>();
        for(int i =0;i<array.length;i++){
            currentNumIdx = i;

            for(int j = currentNumIdx;j<array.length;j++){
                if(j == array.length - 1) break;
                SUM_P =  array[currentNumIdx] + array[j+1];
                diff = targetSum - SUM_P;

                if(hashMap.containsKey(diff)){
                    for(Integer[] collection: hashMap.get(diff)){
                        Integer[] newQuadruplet = {collection[0], collection[1], array[currentNumIdx], array[j+1]};
                        quadruplets.add(newQuadruplet);
                    }

                }
            }

            if(currentNumIdx == 0) continue;
            for(int k=0;k<currentNumIdx;k++){
                SUM_Q = array[k] + array[currentNumIdx];
                if(hashMap.containsKey(SUM_Q)){
                    hashMap.get(SUM_Q).add(new Integer[]{array[k], array[currentNumIdx]});
                } else {
                    ArrayList<Integer[]> arrlist = new ArrayList<Integer[]>();
                    arrlist.add(new Integer[]{array[k], array[currentNumIdx]});
                    hashMap.put(SUM_Q, arrlist);
                }
            }

        }

        return quadruplets.size()>0? quadruplets: new ArrayList<Integer[]>();
    }
}

package algoexpert;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {
	
	public static void main (String args[]) {
		
		List<Integer> array = new ArrayList<Integer>();
		array.add(0);
		array.add(1);
		array.add(2);
		array.add(22);
		array.add(2);
		array.add(4);
		array.add(2);
		array.add(0);
		array.add(1);
		array.add(19);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(0);
		int toMove = 2;
		List<Integer> result = MoveElementToEnd.moveElementToEnd(array, toMove);
		for (Integer i : result) {
			System.out.print(i+" ");
		}
	}
	 public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		 int lp =0, rp = array.size() - 1, temp = 0;
		 while (lp < rp) {
			 if (array.get(lp) == toMove && array.get(rp) == toMove) {
				 rp--;
				 continue;
			 } else if (array.get(lp) != toMove && array.get(rp) != toMove) {
				 lp++;
				 continue;
			 } else if (array.get(lp) == toMove && array.get(rp) != toMove) {
				 temp = array.get(lp);
				 array.set(lp, array.get(rp));
				 array.set(rp, temp);
				 lp++;
				 rp--;
				 continue;
			 } else if (array.get(lp) != toMove && array.get(rp) == toMove)  {
				 lp++;
				 continue;
			 }	
		 }
		 return array;
	 }
}

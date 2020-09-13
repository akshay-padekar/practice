package algoexpert;

public class StarsWithNoLoop {
	
	public static void main(String args[]) {
		
		int count = 5;
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while(true) {
			i = 0;
			sb.append("*");
			++i;
			if(i == 5) {
				count = count - 1;
				sb.append("/n");
				continue;
			} 
			
			if (count == 0) {
				break;
			}
		}
		System.out.println("String: "+sb);
	}
}

/*

*****
****
***
**
*
*
**
***
****
*****

*
**
***
****
*****
*****
****
***
**
*

*/
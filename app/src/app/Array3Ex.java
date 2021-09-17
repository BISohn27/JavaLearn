package app;
/*
 * 	다차원 배열(array) 행과 열
 * 
 * 	표현)
 * 	- int[][] arr = new int[n][n]
 * 	- int[][] arr = {
 * 					 {10,20},
 *  				 {30,40},
 *    				 {50,60},
 *    				}
 */
public class Array3Ex {

	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		int count =0;
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				count++;
				arr[i][j] = count;
				System.out.print("arr[" + i + "]" + "["+j + "] = "+ arr[i][j]+"\t");
				}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] arr2 = {{10,20}, {30,40},{50,60}};
		for(int i = 0; i< arr2.length; i++) {
			for(int j = 0; j< arr2[i].length; j++)
				System.out.print("arr[" + i + "]" + "["+j + "] = "+ arr2[i][j]+"\t");
			System.out.println();	
		}
		
		System.out.println();
		
		String[][] str = {{"A","B","C"},{"D","E","F"},{"G","H","F"}};
		for(int i = 0; i< str.length; i++) {
			for(int j = 0; j< str[i].length; j++)
				System.out.print("arr[" + i + "]" + "["+j + "] = "+ str[i][j]+"\t");
			System.out.println();	
		}
	}
}

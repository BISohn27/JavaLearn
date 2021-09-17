package app;

public class ArrayHomework {

	public static void main(String[] args) {
		// 총합과 평균
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int total = 0;
		int count =0;
		
		for(int i = 0; i<array.length; i++) {
			for(int j =0; j<array[i].length; j++) {
				count++;
				System.out.print(array[i][j] + "\t");
				total += array[i][j];
			}
			System.out.println();
		}
		
		System.out.println("총 합은 " + total);
		System.out.println("평균값은 " + (double)total/count);

		System.out.println();
		
		// 최대값을 출력하시오.
		int[] array2 = {1,5,3,8,2};
		int max = 0;
		for(int a: array2) {
			if(a>max)
				max = a;
		}
		System.out.println("최대값은 " + max);
		
	}

}

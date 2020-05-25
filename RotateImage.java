package codesignal.rotate;

import java.util.Arrays;

public class RotateImage {

	int[][] rotateImage(int[][] a) {
		int [][] newArr = new int [a.length][a.length];
		for (int i = 0; i<a.length; i++) {
			for (int j = a[i].length-1; j>=0;j--) {
				newArr[i][(a[i].length-1)-j] = a[j][i];
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		int[][] a = { 
				{ 1, 2, 3 }, // 00 01 02 
				{ 4, 5, 6 }, // 10 11 12
				{ 7, 8, 9 }  // 20 21 22
				};
		int[][]b = {
				{10,9,6,3,7}, 
				 {6,10,2,9,7}, 
				 {7,6,3,8,2}, 
				 {8,9,7,9,9}, 
				 {6,8,6,8,2}
		};
		RotateImage ri = new RotateImage();
		System.out.println(Arrays.deepToString(ri.rotateImage(a)));
		System.out.println(Arrays.deepToString(ri.rotateImage(b)));
		
		/*
		 * [[7,4,1], 20 -> 00, 10 -> 01, 00 -> 02
 			[8,5,2], 21 -> 10, 11 -> 11, 01 -> 12
 			[9,6,3]] 22 -> 20, 12 -> 21, 02 -> 22
		 */
	}

}

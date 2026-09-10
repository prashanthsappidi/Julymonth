package july3rd;

import java.util.Arrays;

public class Matrix_Transpose_2D_Array {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		int rows = matrix.length;
		int cols = matrix[0].length;

		int[][] transpose = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		for (int i = 0; i < cols; i++) {
			System.out.println(Arrays.toString(transpose[i]));
		}
	}

}

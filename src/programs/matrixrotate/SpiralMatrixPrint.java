package programs.matrixrotate;

public class SpiralMatrixPrint {

	private int[][] getSpiralMatrix(int row, int col) {
		int[][] matrix = new int[row][col];
		int left = 0;
		int right = col - 1;
		int top = 0;
		int bottom = row - 1;
		int count = 0;

		while (true) {
			if (left > right) {
				break;
			}

			for (int i = left; i <= right; i++) {
				matrix[top][i] = ++count;
			}
			top++;

			if (top > bottom) {
				break;
			}

			for (int i = top; i <= bottom; i++) {
				matrix[i][right] = ++count;
			}
			right--;

			if (left > right) {
				break;
			}

			for (int i = right; i >= left; i--) {
				matrix[bottom][i] = ++count;
			}
			bottom--;

			if (top > bottom) {
				break;
			}

			for (int i = bottom; i >= top; i--) {
				matrix[i][left] = ++count;
			}
			left++;
		}
		return matrix;
	}
	
	// Print from center
	private int[][] getSpiralMatrixFromCenter(int n) {
		int[][] matrix = new int[n][n];
		int left = 0;
		int right = n - 1;
		int top = 0;
		int bottom = n - 1;
		int count = n*n;

		while (true) {
			if (left > right) {
				break;
			}

			for (int i = left; i <= right; i++) {
				matrix[top][i] = count;
				count--;
			}
			top++;

			if (top > bottom) {
				break;
			}

			for (int i = top; i <= bottom; i++) {
				matrix[i][right] = count;
				count--;
			}
			right--;

			if (left > right) {
				break;
			}

			for (int i = right; i >= left; i--) {
				matrix[bottom][i] = count;
				count--;
			}
			bottom--;

			if (top > bottom) {
				break;
			}

			for (int i = bottom; i >= top; i--) {
				matrix[i][left] = count;
				count--;
			}
			left++;
		}
		return matrix;
	}

	private void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		SpiralMatrixPrint obj = new SpiralMatrixPrint();
		int[][] matrix = obj.getSpiralMatrix(6, 6);
		matrix = obj.getSpiralMatrixFromCenter(5);
		obj.displayMatrix(matrix);
	}

}

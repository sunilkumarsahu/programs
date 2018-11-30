package programs.matrixrotate;

public class RotateMatrix {

	private int[][] rotateLeft(int[][] matrix) {
		int n = matrix.length;
		int[][] output = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				output[matrix[0].length - 1 - j][i] = matrix[i][j];
			}
		}

		return output;
	}

	private int[][] rotateRight(int[][] matrix) {
		int[][] output = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				output[j][matrix.length - 1 - i] = matrix[i][j];
			}
		}

		return output;
	}

	private void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		RotateMatrix obj = new RotateMatrix();
		System.out.println("Matrix Input: ");
		obj.displayMatrix(matrix);
		System.out.println();
		System.out.println("Rotate Left: ");
		int[][] output = obj.rotateLeft(matrix);
		obj.displayMatrix(output);
		System.out.println();
		System.out.println("Rotate Right: ");
		output = obj.rotateRight(matrix);
		obj.displayMatrix(output);
	}

}

package chap02;

public class int2DArray {
	public static void main(String[] args) {
		new int2DArray();
	}

	public int2DArray() {
		int3();
		int2();
	}

	private void int3() {
		int[][][] x = new int[3][3][3]; // 3차원 배열

		x[0][0][1] = 11;
		x[0][0][2] = 22;
		x[0][1][0] = 33;
		x[0][1][1] = 44;
		x[0][2][0] = 55;
		x[0][2][1] = 66;
		x[0][2][2] = 77;
		x[1][0][0] = 88;
		x[2][1][1] = 99;
		x[0][2][2] = 100;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.println("[" + i + "]" + "[" + j + "[" + k + "] = " + x[i][j][k]);
				}
			}
		}
	}

	public void int2(){

		int[][] x = new int[2][4]; // 2차원 배열

		x[0][1] = 37;
		x[0][3] = 54;
		x[1][2] = 65;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
			}
		}
	}
}

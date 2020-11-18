package game.caro;

//lá»›p nÃ y dÃ¹ng Ä‘á»ƒ xem cÃ¡c trÆ°á»�ng há»£p cÃ³ thá»ƒ káº¿t thÃºc tráº­n Ä‘áº¥u
public class WillWin {

	public static Point co4oKhonglienNhau(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				// theo hang ngang
				if (danhDau[i][j] == -1 && danhDau[i][j + 1] == 0 && danhDau[i][j + 2] == danhDau[i][j]
						&& danhDau[i][j + 3] == danhDau[i][j] && danhDau[i][j + 4] == danhDau[i][j]) {
					point = new Point(i, j + 1);
					return point;
				}
				if (danhDau[i][j] == -1 && danhDau[i][j + 1] == danhDau[i][j] && danhDau[i][j + 2] == danhDau[i][j]
						&& danhDau[i][j + 3] == 0 && danhDau[i][j + 4] == danhDau[i][j]) {
					point = new Point(i, j + 3);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				// theo hang doc
				if (danhDau[i][j] == -1 && danhDau[i + 1][j] == 0 && danhDau[i + 2][j] == danhDau[i][j]
						&& danhDau[i + 3][j] == danhDau[i][j] && danhDau[i + 4][j] == danhDau[i][j]) {
					point = new Point(i + 1, j);
					return point;
				}
				if (danhDau[i][j] == -1 && danhDau[i + 1][j] == danhDau[i][j] && danhDau[i + 2][j] == danhDau[i][j]
						&& danhDau[i + 3][j] == 0 && danhDau[i + 4][j] == danhDau[i][j]) {
					point = new Point(i + 3, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				// cheo 1
				if (danhDau[i][j] == -1 && danhDau[i + 1][j + 1] == 0 && danhDau[i + 2][j + 2] == danhDau[i][j]
						&& danhDau[i + 3][j + 3] == danhDau[i][j] && danhDau[i + 4][j + 4] == danhDau[i][j]) {
					point = new Point(i + 1, j + 1);
					return point;
				}
				if (danhDau[i][j] == -1 && danhDau[i + 1][j + 1] == danhDau[i][j]
						&& danhDau[i + 2][j + 2] == danhDau[i][j] && danhDau[i + 3][j + 3] == 0
						&& danhDau[i + 4][j + 4] == danhDau[i][j]) {
					point = new Point(i + 3, j + 3);
					return point;
				}
			}
		}
		for (int i = 5; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				// cheo 2
				if (danhDau[i][j] == -1 && danhDau[i - 1][j + 1] == 0 && danhDau[i - 2][j + 2] == danhDau[i][j]
						&& danhDau[i - 3][j + 3] == danhDau[i][j] && danhDau[i - 4][j + 4] == danhDau[i][j]) {
					point = new Point(i - 1, j + 1);
					return point;
				}
				if (danhDau[i][j] == -1 && danhDau[i - 3][j + 3] == 0 && danhDau[i - 2][j + 2] == danhDau[i][j]
						&& danhDau[i - 1][j + 1] == danhDau[i][j] && danhDau[i - 4][j + 4] == danhDau[i][j]) {
					point = new Point(i - 3, j + 3);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				// phan biet may va nguoi se Win
				if (danhDau[i][j] != 0 && danhDau[i][j + 1] == 0 && danhDau[i][j + 2] == danhDau[i][j]
						&& danhDau[i][j + 3] == danhDau[i][j] && danhDau[i][j + 4] == danhDau[i][j]) {
					point = new Point(i, j + 1);
					return point;
				}
				if (danhDau[i][j] != 0 && danhDau[i][j + 1] == danhDau[i][j] && danhDau[i][j + 2] == danhDau[i][j]
						&& danhDau[i][j + 3] == 0 && danhDau[i][j + 4] == danhDau[i][j]) {
					point = new Point(i, j + 3);
					return point;
				}
			}
		}

		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				// theo hang doc
				if (danhDau[i][j] != 0 && danhDau[i + 1][j] == 0 && danhDau[i + 2][j] == danhDau[i][j]
						&& danhDau[i + 3][j] == danhDau[i][j] && danhDau[i + 4][j] == danhDau[i][j]) {
					point = new Point(i + 1, j);
					return point;
				}
				if (danhDau[i][j] != 0 && danhDau[i + 1][j] == danhDau[i][j] && danhDau[i + 2][j] == danhDau[i][j]
						&& danhDau[i + 3][j] == 0 && danhDau[i + 4][j] == danhDau[i][j]) {
					point = new Point(i + 3, j);
					return point;
				}
			}
		}

		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				// cheo 1
				if (danhDau[i][j] != 0 && danhDau[i + 1][j + 1] == 0 && danhDau[i + 2][j + 2] == danhDau[i][j]
						&& danhDau[i + 3][j + 3] == danhDau[i][j] && danhDau[i + 4][j + 4] == danhDau[i][j]) {
					point = new Point(i + 1, j + 1);
					return point;
				}
				if (danhDau[i][j] != 0 && danhDau[i + 1][j + 1] == danhDau[i][j]
						&& danhDau[i + 2][j + 2] == danhDau[i][j] && danhDau[i + 3][j + 3] == 0
						&& danhDau[i + 4][j + 4] == danhDau[i][j]) {
					point = new Point(i + 3, j + 3);
					return point;
				}
			}
		}

		for (int i = 5; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				// cheo 2
				if (danhDau[i][j] != 0 && danhDau[i - 1][j + 1] == 0 && danhDau[i - 2][j + 2] == danhDau[i][j]
						&& danhDau[i - 3][j + 3] == danhDau[i][j] && danhDau[i - 4][j + 4] == danhDau[i][j]) {
					point = new Point(i - 1, j + 1);
					return point;
				}
				if (danhDau[i][j] != 0 && danhDau[i - 3][j + 3] == 0 && danhDau[i - 2][j + 2] == danhDau[i][j]
						&& danhDau[i - 1][j + 1] == danhDau[i][j] && danhDau[i - 4][j + 4] == danhDau[i][j]) {
					point = new Point(i - 3, j + 3);
					return point;
				}
			}
		}
		return null;
	}

	public static Point co4olienNhauchan1Dau(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// theo hang ngang
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] == -1 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == danhDau[i][j + 1] && danhDau[i][j + 4] == danhDau[i][j + 1]) {
					point = new Point(i, j);
					return point;
				}
				if (danhDau[i][j + 4] == 0 && danhDau[i][j + 1] == -1 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == danhDau[i][j + 1] && danhDau[i][j] == danhDau[i][j + 1]) {
					point = new Point(i, j + 4);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				// theo hang doc
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] == -1 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == danhDau[i + 1][j] && danhDau[i + 4][j] == danhDau[i + 1][j]) {
					point = new Point(i, j);
					return point;
				}
				if (danhDau[i + 4][j] == 0 && danhDau[i + 1][j] == -1 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == danhDau[i + 1][j] && danhDau[i][j] == danhDau[i + 1][j]) {
					point = new Point(i + 4, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// cheo 1
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] == -1 && danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == danhDau[i + 1][j + 1]
						&& danhDau[i + 4][j + 4] == danhDau[i + 1][j + 1]) {
					point = new Point(i, j);
					return point;
				}
				if (danhDau[i + 4][j + 4] == 0 && danhDau[i + 1][j + 1] == -1
						&& danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == danhDau[i + 1][j + 1] && danhDau[i][j] == danhDau[i + 1][j + 1]) {
					point = new Point(i + 4, j + 4);
					return point;
				}
			}
		}
		for (int i = 4; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// cheo 2
				if (danhDau[i][j] == 0 && danhDau[i - 1][j + 1] == -1 && danhDau[i - 2][j + 2] == danhDau[i - 1][j + 1]
						&& danhDau[i - 3][j + 3] == danhDau[i - 1][j + 1]
						&& danhDau[i - 4][j + 4] == danhDau[i - 1][j + 1]) {
					point = new Point(i, j);
					return point;
				}
				if (danhDau[i - 4][j + 4] == 0 && danhDau[i - 1][j + 1] == -1
						&& danhDau[i - 2][j + 2] == danhDau[i - 1][j + 1]
						&& danhDau[i - 3][j + 3] == danhDau[i - 1][j + 1] && danhDau[i][j] == danhDau[i - 1][j + 1]) {
					point = new Point(i - 4, j + 4);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// theo hang ngang
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] != 0 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == danhDau[i][j + 1] && danhDau[i][j + 4] == danhDau[i][j + 1]) {
					point = new Point(i, j);
					return point;
				}
				if (danhDau[i][j + 4] == 0 && danhDau[i][j + 1] != 0 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == danhDau[i][j + 1] && danhDau[i][j] == danhDau[i][j + 1]) {
					point = new Point(i, j + 4);
					return point;
				}
			}
		}

		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				// theo hang doc
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] != 0 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == danhDau[i + 1][j] && danhDau[i + 4][j] == danhDau[i + 1][j]) {
					point = new Point(i, j);
					return point;
				}
				if (danhDau[i + 4][j] == 0 && danhDau[i + 1][j] != 0 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == danhDau[i + 1][j] && danhDau[i][j] == danhDau[i + 1][j]) {
					point = new Point(i + 4, j);
					return point;
				}
			}
		}

		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// cheo 1
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] != 0 && danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == danhDau[i + 1][j + 1]
						&& danhDau[i + 4][j + 4] == danhDau[i + 1][j + 1]) {
					point = new Point(i, j);
					return point;
				}
				if (danhDau[i + 4][j + 4] == 0 && danhDau[i + 1][j + 1] != 0
						&& danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == danhDau[i + 1][j + 1] && danhDau[i][j] == danhDau[i + 1][j + 1]) {
					point = new Point(i + 4, j + 4);
					return point;
				}
			}
		}

		for (int i = 4; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// cheo 2
				if (danhDau[i][j] == 0 && danhDau[i - 1][j + 1] != 0 && danhDau[i - 2][j + 2] == danhDau[i - 1][j + 1]
						&& danhDau[i - 3][j + 3] == danhDau[i - 1][j + 1]
						&& danhDau[i - 4][j + 4] == danhDau[i - 1][j + 1]) {
					point = new Point(i, j);
					return point;
				}
				if (danhDau[i - 4][j + 4] == 0 && danhDau[i - 1][j + 1] != 0
						&& danhDau[i - 2][j + 2] == danhDau[i - 1][j + 1]
						&& danhDau[i - 3][j + 3] == danhDau[i - 1][j + 1] && danhDau[i][j] == danhDau[i - 1][j + 1]) {
					point = new Point(i - 4, j + 4);
					return point;
				}
			}
		}
		return null;
	}

	// O X X Ä‘Ã£ sá»­a
	public static Point th1(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 3; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] == -1 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 3; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] != 0 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	// X O X Ä‘a sá»­a
	public static Point th2(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] == -1 && danhDau[i][j + 1] == danhDau[i][j + 3]
						&& danhDau[i][j + 2] == 0 && danhDau[i][j + 4] == 0) {
					point = new Point(i, j + 2);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] != 0 && danhDau[i][j + 1] == danhDau[i][j + 3]
						&& danhDau[i][j + 2] == 0 && danhDau[i][j + 4] == 0) {
					point = new Point(i, j + 2);
					return point;
				}
			}
		}
		return null;
	}

	// X X O Ä‘Ã£ sá»­a
	public static Point th3(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 1; j < danhDau[i].length - 2; j++) {
				if (danhDau[i][j] == -1 && danhDau[i][j + 1] == danhDau[i][j] && danhDau[i][j + 2] == 0
						&& danhDau[i][j - 1] == 0 && danhDau[i][j - 1] == 0) {
					point = new Point(i, j + 2);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 1; j < danhDau[i].length - 2; j++) {
				if (danhDau[i][j] != 0 && danhDau[i][j + 1] == danhDau[i][j] && danhDau[i][j + 2] == 0
						&& danhDau[i][j - 1] == 0 && danhDau[i][j - 1] == 0) {
					point = new Point(i, j + 2);
					return point;
				}
			}
		}
		return null;
	}

	// O
	// - X
	// - - X Ä‘Ã£ sá»­a
	public static Point th4(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 3; i++) {
			for (int j = 0; j < danhDau[i].length - 3; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] == -1 && danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 3; i++) {
			for (int j = 0; j < danhDau[i].length - 3; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] != 0 && danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	// X
	// - O
	// - - X Ä‘Ã£ sá»­a
	public static Point th5(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 3; i++) {
			for (int j = 0; j < danhDau[i].length - 3; j++) {
				if (danhDau[i][j] == -1 && danhDau[i + 1][j + 1] == 0 && danhDau[i + 2][j + 2] == danhDau[i][j]
						&& danhDau[i - 1][j - 1] == 0 && danhDau[i + 3][j + 3] == 0) {
					point = new Point(i + 1, j + 1);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 3; i++) {
			for (int j = 0; j < danhDau[i].length - 3; j++) {
				if (danhDau[i][j] != 0 && danhDau[i + 1][j + 1] == 0 && danhDau[i + 2][j + 2] == danhDau[i][j]
						&& danhDau[i - 1][j - 1] == 0 && danhDau[i + 3][j + 3] == 0) {
					point = new Point(i + 1, j + 1);
					return point;
				}
			}
		}
		return null;
	}

	// X
	// - X
	// - - O Ä‘Ã£ sá»­a
	public static Point th6(int[][] danhDau) {
		Point point;
		for (int i = 1; i < danhDau.length - 2; i++) {
			for (int j = 1; j < danhDau[i].length - 2; j++) {
				if (danhDau[i][j] == -1 && danhDau[i + 1][j + 1] == danhDau[i][j] && danhDau[i + 2][j + 2] == 0
						&& danhDau[i - 1][j - 1] == 0) {
					point = new Point(i + 2, j + 2);
					return point;
				}
			}
		}
		for (int i = 1; i < danhDau.length - 2; i++) {
			for (int j = 1; j < danhDau[i].length - 2; j++) {
				if (danhDau[i][j] != 0 && danhDau[i + 1][j + 1] == danhDau[i][j] && danhDau[i + 2][j + 2] == 0
						&& danhDau[i - 1][j - 1] == 0) {
					point = new Point(i + 2, j + 2);
					return point;
				}
			}
		}
		return null;
	}

	// - - O Ä‘Ã£ sá»­a
	// - X
	// X
	public static Point th7(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 3; i++) {
			for (int j = 3; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j - 1] == danhDau[i + 2][j - 2] && danhDau[i + 2][j - 2] == -1
						&& danhDau[i + 3][j - 3] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 3; i++) {
			for (int j = 3; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j - 1] == danhDau[i + 2][j - 2] && danhDau[i + 2][j - 2] != 0
						&& danhDau[i + 3][j - 3] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	// - - X Ä‘Ã£ sá»­a
	// - X
	// O
	public static Point th8(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 2; i++) {
			for (int j = 2; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == -1 && danhDau[i][j] == danhDau[i + 1][j - 1] && danhDau[i + 2][j - 2] == 0
						&& danhDau[i + 1][j - 1] == 0) {
					point = new Point(i + 2, j + 2);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 2; i++) {
			for (int j = 2; j < danhDau[i].length; j++) {
				if (danhDau[i][j] != 0 && danhDau[i][j] == danhDau[i + 1][j - 1] && danhDau[i + 2][j - 2] == 0
						&& danhDau[i + 1][j - 1] == 0) {
					point = new Point(i + 2, j + 2);
					return point;
				}
			}
		}
		return null;
	}

	// - - X Ä‘Ã£ sá»­a
	// - O
	// X
	public static Point th9(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 3; i++) {
			for (int j = 3; j < danhDau[i].length; j++) {
				if (danhDau[i + 1][j - 1] == 0 && danhDau[i][j] == danhDau[i + 2][j - 2] && danhDau[i + 2][j - 2] == -1
						&& danhDau[i - 1][j + 1] == 0 && danhDau[i + 3][j - 3] == 0) {
					point = new Point(i + 1, j - 1);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 3; i++) {
			for (int j = 3; j < danhDau[i].length; j++) {
				if (danhDau[i + 1][j - 1] == 0 && danhDau[i][j] == danhDau[i + 2][j - 2] && danhDau[i + 2][j - 2] != 0
						&& danhDau[i - 1][j + 1] == 0 && danhDau[i + 3][j - 3] == 0) {
					point = new Point(i + 1, j - 1);
					return point;
				}
			}
		}
		return null;
	}

	// O Ä‘Ã£ sá»­a
	// X
	// X
	public static Point th10(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 3; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] == -1 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 3; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] != 0 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	// X Ä‘Ã£ sá»­a
	// O
	// X
	public static Point th11(int[][] danhDau) {
		Point point;
		for (int i = 1; i < danhDau.length - 3; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == -1 && danhDau[i + 1][j] == 0 && danhDau[i + 2][j] == danhDau[i][j]
						&& danhDau[i - 1][j] == 0 && danhDau[i + 3][j] == 0) {
					point = new Point(i + 1, j);
					return point;
				}
			}
		}
		for (int i = 1; i < danhDau.length - 3; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				if (danhDau[i][j] != 0 && danhDau[i + 1][j] == 0 && danhDau[i + 2][j] == danhDau[i][j]
						&& danhDau[i - 1][j] == 0 && danhDau[i + 3][j] == 0) {
					point = new Point(i + 1, j);
					return point;
				}
			}
		}
		return null;
	}

	// X Ä‘Ã£ sá»­a
	// X
	// O
	public static Point th12(int[][] danhDau) {
		Point point;
		for (int i = 1; i < danhDau.length - 2; i++) {
			for (int j = 0; j < danhDau[i].length - 1; j++) {
				if (danhDau[i][j] == -1 && danhDau[i + 2][j] == 0 && danhDau[i + 1][j] == danhDau[i][j]
						&& danhDau[i - 1][j] == 0) {
					point = new Point(i + 2, j);
					return point;
				}
			}
		}
		for (int i = 1; i < danhDau.length - 2; i++) {
			for (int j = 0; j < danhDau[i].length - 1; j++) {
				if (danhDau[i][j] != 0 && danhDau[i + 2][j] == 0 && danhDau[i + 1][j] == danhDau[i][j]
						&& danhDau[i - 1][j] == 0) {
					point = new Point(i + 2, j);
					return point;
				}
			}
		}
		return null;
	}

	// O hoÃ n thÃ nh
	// -
	// X
	// X
	public static Point th13(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 1; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] == 0 && danhDau[i + 2][j] == -1
						&& danhDau[i + 2][j] == danhDau[i + 3][j] && danhDau[i + 4][j] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 1; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] == 0 && danhDau[i + 2][j] != 0
						&& danhDau[i + 2][j] == danhDau[i + 3][j] && danhDau[i + 4][j] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	// O
	// X
	// -
	// X
	public static Point th14(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 1; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j] == 0 && danhDau[i + 1][j] == -1
						&& danhDau[i + 1][j] == danhDau[i + 3][j] && danhDau[i + 4][j] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 1; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j] == 0 && danhDau[i + 1][j] != 0
						&& danhDau[i + 1][j] == danhDau[i + 3][j] && danhDau[i + 4][j] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	// X Ä‘Ã£ sá»­a
	// O
	// -
	// X
	public static Point th15(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 0; j < danhDau[i].length - 1; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j] == 0 && danhDau[i + 3][j] == 0
						&& danhDau[i + 4][j] == danhDau[i + 1][j] && danhDau[i + 4][j] == -1
						&& danhDau[i + 5][j] == 0) {
					point = new Point(i + 2, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 0; j < danhDau[i].length - 1; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j] == 0 && danhDau[i + 3][j] == 0
						&& danhDau[i + 4][j] == danhDau[i + 1][j] && danhDau[i + 4][j] != 0 && danhDau[i + 5][j] == 0) {
					point = new Point(i + 2, j);
					return point;
				}
			}
		}
		return null;
	}

	// X
	// -
	// O
	// X
	public static Point th16(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 0; j < danhDau[i].length - 1; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j] == 0 && danhDau[i + 3][j] == 0
						&& danhDau[i + 4][j] == danhDau[i + 1][j] && danhDau[i + 4][j] == -1
						&& danhDau[i + 5][j] == 0) {
					point = new Point(i + 3, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 0; j < danhDau[i].length - 1; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j] == 0 && danhDau[i + 3][j] == 0
						&& danhDau[i + 4][j] == danhDau[i + 1][j] && danhDau[i + 4][j] != 0 && danhDau[i + 5][j] == 0) {
					point = new Point(i + 3, j);
					return point;
				}
			}
		}
		return null;
	}

	// X
	// X
	// -
	// O
	public static Point th17(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 3][j] == 0 && danhDau[i + 4][j] == 0 && danhDau[i + 1][j] == -1
						&& danhDau[i + 1][j] == danhDau[i + 2][j]) {
					point = new Point(i + 4, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 3][j] == 0 && danhDau[i + 4][j] == 0 && danhDau[i + 1][j] != 0
						&& danhDau[i + 1][j] == danhDau[i + 2][j]) {
					point = new Point(i + 4, j);
					return point;
				}
			}
		}
		return null;
	}

	// X
	// -
	// X
	// O
	public static Point th18(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j] == 0 && danhDau[i + 4][j] == 0 && danhDau[i + 1][j] == -1
						&& danhDau[i + 1][j] == danhDau[i + 3][j]) {
					point = new Point(i + 4, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j] == 0 && danhDau[i + 4][j] == 0 && danhDau[i + 1][j] != 0
						&& danhDau[i + 1][j] == danhDau[i + 3][j]) {
					point = new Point(i + 4, j);
					return point;
				}
			}
		}
		return null;
	}

	// O - X X
	public static Point th19(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] == 0 && danhDau[i][j + 4] == 0 && danhDau[i][j + 2] == -1
						&& danhDau[i][j + 2] == danhDau[i][j + 3]) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] == 0 && danhDau[i][j + 4] == 0 && danhDau[i][j + 2] != 0
						&& danhDau[i][j + 2] == danhDau[i][j + 3]) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	// O X - X
	public static Point th20(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 2] == 0 && danhDau[i][j + 4] == 0 && danhDau[i][j + 1] == -1
						&& danhDau[i][j + 1] == danhDau[i][j + 3]) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 2] == 0 && danhDau[i][j + 4] == 0 && danhDau[i][j + 1] != 0
						&& danhDau[i][j + 1] == danhDau[i][j + 3]) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	// X O - X
	public static Point th21(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 2] == 0 && danhDau[i][j + 3] == 0 && danhDau[i][j + 5] == 0
						&& danhDau[i][j + 1] == -1 && danhDau[i][j + 1] == danhDau[i][j + 4]) {
					point = new Point(i, j + 2);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 2] == 0 && danhDau[i][j + 3] == 0 && danhDau[i][j + 5] == 0
						&& danhDau[i][j + 1] != 0 && danhDau[i][j + 1] == danhDau[i][j + 4]) {
					point = new Point(i, j + 2);
					return point;
				}
			}
		}
		return null;
	}

	// X - O X
	public static Point th22(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 2] == 0 && danhDau[i][j + 3] == 0 && danhDau[i][j + 5] == 0
						&& danhDau[i][j + 1] == -1 && danhDau[i][j + 1] == danhDau[i][j + 4]) {
					point = new Point(i, j + 3);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 2] == 0 && danhDau[i][j + 3] == 0 && danhDau[i][j + 5] == 0
						&& danhDau[i][j + 1] != 0 && danhDau[i][j + 1] == danhDau[i][j + 4]) {
					point = new Point(i, j + 3);
					return point;
				}
			}
		}
		return null;
	}

	// X X - O
	public static Point th23(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 3] == 0 && danhDau[i][j + 4] == 0 && danhDau[i][j + 1] == -1
						&& danhDau[i][j + 1] == danhDau[i][j + 2]) {
					point = new Point(i, j + 4);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 3] == 0 && danhDau[i][j + 4] == 0 && danhDau[i][j + 1] != 0
						&& danhDau[i][j + 1] == danhDau[i][j + 2]) {
					point = new Point(i, j + 4);
					return point;
				}
			}
		}
		return null;
	}

	// X - X O
	public static Point th24(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 2] == 0 && danhDau[i][j + 4] == 0 && danhDau[i][j + 1] == -1
						&& danhDau[i][j + 1] == danhDau[i][j + 3]) {
					point = new Point(i, j + 4);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 2] == 0 && danhDau[i][j + 4] == 0 && danhDau[i][j + 1] != 0
						&& danhDau[i][j + 1] == danhDau[i][j + 3]) {
					point = new Point(i, j + 4);
					return point;
				}
			}
		}
		return null;
	}

	// O
	// - -
	// - - X
	// - - - X
	public static Point th25(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] == 0 && danhDau[i + 4][j + 4] == 0
						&& danhDau[i + 2][j + 2] == -1 && danhDau[i + 2][j + 2] == danhDau[i + 3][j + 3]) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] == 0 && danhDau[i + 4][j + 4] == 0
						&& danhDau[i + 2][j + 2] != 0 && danhDau[i + 2][j + 2] == danhDau[i + 3][j + 3]) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	// O
	// - X
	// - - -
	// - - - X
	public static Point th26(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j + 2] == 0 && danhDau[i + 4][j + 4] == 0
						&& danhDau[i + 1][j + 1] == -1 && danhDau[i + 1][j + 1] == danhDau[i + 3][j + 3]) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j + 2] == 0 && danhDau[i + 4][j + 4] == 0
						&& danhDau[i + 1][j + 1] != 0 && danhDau[i + 1][j + 1] == danhDau[i + 3][j + 3]) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	// X
	// - -
	// - - O
	// - - - X
	public static Point th27(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j + 2] == 0 && danhDau[i + 3][j + 3] == 0
						&& danhDau[i + 5][j + 5] == 0 && danhDau[i + 1][j + 1] == -1
						&& danhDau[i + 1][j + 1] == danhDau[i + 4][j + 4]) {
					point = new Point(i + 3, j + 3);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j + 2] == 0 && danhDau[i + 3][j + 3] == 0
						&& danhDau[i + 5][j + 5] == 0 && danhDau[i + 1][j + 1] != 0
						&& danhDau[i + 1][j + 1] == danhDau[i + 4][j + 4]) {
					point = new Point(i + 3, j + 3);
					return point;
				}
			}
		}
		return null;
	}

	// X
	// - O
	// - - -
	// - - - X
	public static Point th28(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j + 2] == 0 && danhDau[i + 3][j + 3] == 0
						&& danhDau[i + 5][j + 5] == 0 && danhDau[i + 1][j + 1] == -1
						&& danhDau[i + 1][j + 1] == danhDau[i + 4][j + 4]) {
					point = new Point(i + 2, j + 2);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 0; j < danhDau[i].length - 5; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j + 2] == 0 && danhDau[i + 3][j + 3] == 0
						&& danhDau[i + 5][j + 5] == 0 && danhDau[i + 1][j + 1] != 0
						&& danhDau[i + 1][j + 1] == danhDau[i + 4][j + 4]) {
					point = new Point(i + 2, j + 2);
					return point;
				}
			}
		}
		return null;
	}

	// X
	// - X
	// - - -
	// - - - O
	public static Point th29(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 3][j + 3] == 0 && danhDau[i + 4][j + 4] == 0
						&& danhDau[i + 1][j + 1] != 0 && danhDau[i + 1][j + 1] == danhDau[i + 2][j + 2]) {
					point = new Point(i + 4, j + 4);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 3][j + 3] == 0 && danhDau[i + 4][j + 4] == 0
						&& danhDau[i + 1][j + 1] == -1 && danhDau[i + 1][j + 1] == danhDau[i + 2][j + 2]) {
					point = new Point(i + 4, j + 4);
					return point;
				}
			}
		}
		return null;
	}

	// X
	// - -
	// - - X
	// - - - O
	public static Point th30(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j + 2] == 0 && danhDau[i + 4][j + 4] == 0
						&& danhDau[i + 1][j + 1] == -1 && danhDau[i + 1][j + 1] == danhDau[i + 3][j + 3]) {
					point = new Point(i + 4, j + 4);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j + 2] == 0 && danhDau[i + 4][j + 4] == 0
						&& danhDau[i + 1][j + 1] != 0 && danhDau[i + 1][j + 1] == danhDau[i + 3][j + 3]) {
					point = new Point(i + 4, j + 4);
					return point;
				}
			}
		}
		return null;
	}

	// - - - O
	// - - -
	// - X
	// X
	public static Point th31(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 4; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j - 1] == 0 && danhDau[i + 4][j - 4] == 0
						&& danhDau[i + 2][j - 2] == -1 && danhDau[i + 2][j - 2] == danhDau[i + 3][j - 3]) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 4; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j - 1] == 0 && danhDau[i + 4][j - 4] == 0
						&& danhDau[i + 2][j - 2] != 0 && danhDau[i + 2][j - 2] == danhDau[i + 3][j - 3]) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	// - - - O
	// - - X
	// - -
	// X
	public static Point th32(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 4; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j - 2] == 0 && danhDau[i + 4][j - 4] == 0
						&& danhDau[i + 1][j - 1] == -1 && danhDau[i + 1][j - 1] == danhDau[i + 3][j - 3]) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 4; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j - 2] == 0 && danhDau[i + 4][j - 4] == 0
						&& danhDau[i + 1][j - 1] != 0 && danhDau[i + 1][j - 1] == danhDau[i + 3][j - 3]) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	// - - - X
	// - - -
	// - 0
	// X
	public static Point th33(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 5; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j - 2] == 0 && danhDau[i + 3][j - 3] == 0
						&& danhDau[i + 5][j - 5] == 0 && danhDau[i + 1][j - 1] == -1
						&& danhDau[i + 1][j - 1] == danhDau[i + 4][j - 4]) {
					point = new Point(i + 3, j - 3);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 5; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j - 2] == 0 && danhDau[i + 3][j - 3] == 0
						&& danhDau[i + 5][j - 5] == 0 && danhDau[i + 1][j - 1] != 0
						&& danhDau[i + 1][j - 1] == danhDau[i + 4][j - 4]) {
					point = new Point(i + 3, j - 3);
					return point;
				}
			}
		}
		return null;
	}

	// - - - X
	// - - O
	// - -
	// X
	public static Point th34(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 5; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j - 2] == 0 && danhDau[i + 3][j - 3] == 0
						&& danhDau[i + 5][j - 5] == 0 && danhDau[i + 1][j - 1] == -1
						&& danhDau[i + 1][j - 1] == danhDau[i + 4][j - 4]) {
					point = new Point(i + 2, j - 2);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 5; i++) {
			for (int j = 5; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j - 2] == 0 && danhDau[i + 3][j - 3] == 0
						&& danhDau[i + 5][j - 5] == 0 && danhDau[i + 1][j - 1] != 0
						&& danhDau[i + 1][j - 1] == danhDau[i + 4][j - 4]) {
					point = new Point(i + 2, j - 2);
					return point;
				}
			}
		}
		return null;
	}

	// - - - X
	// - - -
	// - X
	// O
	public static Point th35(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 4; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j - 2] == 0 && danhDau[i + 4][j - 4] == 0
						&& danhDau[i + 1][j - 1] == -1 && danhDau[i + 1][j - 1] == danhDau[i + 3][j - 3]) {
					point = new Point(i + 4, j - 4);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 4; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 2][j - 2] == 0 && danhDau[i + 4][j - 4] == 0
						&& danhDau[i + 1][j - 1] != 0 && danhDau[i + 1][j - 1] == danhDau[i + 3][j - 3]) {
					point = new Point(i + 4, j - 4);
					return point;
				}
			}
		}
		return null;
	}

	// - - - X
	// - - X
	// - -
	// O
	public static Point th36(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 4; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 3][j - 3] == 0 && danhDau[i + 4][j - 4] == 0
						&& danhDau[i + 1][j - 1] == -1 && danhDau[i + 1][j - 1] == danhDau[i + 2][j - 2]) {
					point = new Point(i + 4, j - 4);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 4; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 3][j - 3] == 0 && danhDau[i + 4][j - 4] == 0
						&& danhDau[i + 1][j - 1] != 0 && danhDau[i + 1][j - 1] == danhDau[i + 2][j - 2]) {
					point = new Point(i + 4, j - 4);
					return point;
				}
			}
		}
		return null;
	}

	// 3 Ã´ liá»�n nhau chÆ°a bá»‹ cháº·n
	public static Point co3LienNhauChuaChan(int[][] danhDau) {
		Point point;
		for (int i = 4; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// theo hang ngang
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] == -1 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == danhDau[i][j + 1] && danhDau[i][j + 4] == 0) {
					point = new Point(i, j);
					return point;
				}
				// theo hang doc
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] == -1 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == danhDau[i + 1][j] && danhDau[i + 4][j] == 0) {
					point = new Point(i, j);
					return point;
				}
				// cheo 1
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] == -1 && danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == danhDau[i + 1][j + 1] && danhDau[i + 4][j + 4] == 0) {
					point = new Point(i, j);
					return point;
				}
				// cheo 2
				if (danhDau[i][j] == 0 && danhDau[i - 1][j + 1] == -1 && danhDau[i - 2][j + 2] == danhDau[i - 1][j + 1]
						&& danhDau[i - 3][j + 3] == danhDau[i - 1][j + 1] && danhDau[i - 4][j + 4] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 4; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// theo hang ngang
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] != 0 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == danhDau[i][j + 1] && danhDau[i][j + 4] == 0) {
					point = new Point(i, j);
					return point;
				}
				// theo hang doc
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] != 0 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == danhDau[i + 1][j] && danhDau[i + 4][j] == 0) {
					point = new Point(i, j);
					return point;
				}
				// cheo 1
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] != 0 && danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == danhDau[i + 1][j + 1] && danhDau[i + 4][j + 4] == 0) {
					point = new Point(i, j);
					return point;
				}
				// cheo 2
				if (danhDau[i][j] == 0 && danhDau[i - 1][j + 1] != 0 && danhDau[i - 2][j + 2] == danhDau[i - 1][j + 1]
						&& danhDau[i - 3][j + 3] == danhDau[i - 1][j + 1] && danhDau[i - 4][j + 4] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	public static Point co3LienNhauChuaChan2(int[][] danhDau) {
		Point point;
		for (int i = 4; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// theo hang ngang
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] == -1 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == danhDau[i][j + 1] && danhDau[i][j + 4] == 0) {
					point = new Point(i, j + 4);
					return point;
				}
				// theo hang doc
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] == -1 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == danhDau[i + 1][j] && danhDau[i + 4][j] == 0) {
					point = new Point(i + 4, j);
					return point;
				}
				// cheo 1
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] == -1 && danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == danhDau[i + 1][j + 1] && danhDau[i + 4][j + 4] == 0) {
					point = new Point(i + 4, j + 4);
					return point;
				}
				// cheo 2
				if (danhDau[i][j] == 0 && danhDau[i - 1][j + 1] == -1 && danhDau[i - 2][j + 2] == danhDau[i - 1][j + 1]
						&& danhDau[i - 3][j + 3] == danhDau[i - 1][j + 1] && danhDau[i - 4][j + 4] == 0) {
					point = new Point(i - 4, j + 4);
					return point;
				}
			}
		}
		for (int i = 4; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// theo hang ngang
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] != 0 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == danhDau[i][j + 1] && danhDau[i][j + 4] == 0) {
					point = new Point(i, j + 4);
					return point;
				}
				// theo hang doc
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] != 0 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == danhDau[i + 1][j] && danhDau[i + 4][j] == 0) {
					point = new Point(i + 4, j);
					return point;
				}
				// cheo 1
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] != 0 && danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == danhDau[i + 1][j + 1] && danhDau[i + 4][j + 4] == 0) {
					point = new Point(i + 4, j + 4);
					return point;
				}
				// cheo 2
				if (danhDau[i][j] == 0 && danhDau[i - 1][j + 1] != 0 && danhDau[i - 2][j + 2] == danhDau[i - 1][j + 1]
						&& danhDau[i - 3][j + 3] == danhDau[i - 1][j + 1] && danhDau[i - 4][j + 4] == 0) {
					point = new Point(i - 4, j + 4);
					return point;
				}
			}
		}
		return null;
	}

	public static Point th37(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// theo hang ngang
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] == -1 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == danhDau[i][j + 1] && danhDau[i][j + 4] == 0) {
					point = new Point(i, j + 4);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// theo hang ngang
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] != 0 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == danhDau[i][j + 1] && danhDau[i][j + 4] == 0) {
					point = new Point(i, j + 4);
					return point;
				}
			}
		}
		return null;
	}

	public static Point th38(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				// theo hang doc
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] == -1 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == danhDau[i + 1][j] && danhDau[i + 4][j] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				// theo hang doc
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] != 0 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == danhDau[i + 1][j] && danhDau[i + 4][j] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	public static Point th39(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// cheo 1
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] == -1 && danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == danhDau[i + 1][j + 1] && danhDau[i + 4][j + 4] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] != 0 && danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == danhDau[i + 1][j + 1] && danhDau[i + 4][j + 4] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	public static Point th40(int[][] danhDau) {
		Point point;
		for (int i = 4; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// cheo 2
				if (danhDau[i][j] == 0 && danhDau[i - 1][j + 1] == -1 && danhDau[i - 2][j + 2] == danhDau[i - 1][j + 1]
						&& danhDau[i - 3][j + 3] == danhDau[i - 1][j + 1] && danhDau[i - 4][j + 4] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 4; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i - 1][j + 1] != 0 && danhDau[i - 2][j + 2] == danhDau[i - 1][j + 1]
						&& danhDau[i - 3][j + 3] == danhDau[i - 1][j + 1] && danhDau[i - 4][j + 4] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	public static Point th41(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// theo hang ngang
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] != 0 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == danhDau[i][j + 1] && danhDau[i][j + 4] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i][j + 1] == -1 && danhDau[i][j + 2] == danhDau[i][j + 1]
						&& danhDau[i][j + 3] == danhDau[i][j + 1] && danhDau[i][j + 4] == 0) {
					point = new Point(i, j);
					return point;
				}
			}
		}
		return null;
	}

	public static Point th42(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				// theo hang doc
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] == -1 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == danhDau[i + 1][j] && danhDau[i + 4][j] == 0) {
					point = new Point(i + 4, j);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j] != 0 && danhDau[i + 2][j] == danhDau[i + 1][j]
						&& danhDau[i + 3][j] == danhDau[i + 1][j] && danhDau[i + 4][j] == 0) {
					point = new Point(i + 4, j);
					return point;
				}
			}
		}
		return null;
	}

	public static Point th43(int[][] danhDau) {
		Point point;
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// cheo 1
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] == -1 && danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == danhDau[i + 1][j + 1] && danhDau[i + 4][j + 4] == 0) {
					point = new Point(i + 4, j + 4);
					return point;
				}
			}
		}
		for (int i = 0; i < danhDau.length - 4; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i + 1][j + 1] != 0 && danhDau[i + 2][j + 2] == danhDau[i + 1][j + 1]
						&& danhDau[i + 3][j + 3] == danhDau[i + 1][j + 1] && danhDau[i + 4][j + 4] == 0) {
					point = new Point(i + 4, j + 4);
					return point;
				}
			}
		}
		return null;
	}

	public static Point th44(int[][] danhDau) {
		Point point;
		for (int i = 4; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				// cheo 2
				if (danhDau[i][j] == 0 && danhDau[i - 1][j + 1] == -1 && danhDau[i - 2][j + 2] == danhDau[i - 1][j + 1]
						&& danhDau[i - 3][j + 3] == danhDau[i - 1][j + 1] && danhDau[i - 4][j + 4] == 0) {
					point = new Point(i - 4, j + 4);
					return point;
				}
			}
		}
		for (int i = 4; i < danhDau.length; i++) {
			for (int j = 0; j < danhDau[i].length - 4; j++) {
				if (danhDau[i][j] == 0 && danhDau[i - 1][j + 1] != 0 && danhDau[i - 2][j + 2] == danhDau[i - 1][j + 1]
						&& danhDau[i - 3][j + 3] == danhDau[i - 1][j + 1] && danhDau[i - 4][j + 4] == 0) {
					point = new Point(i - 4, j + 4);
					return point;
				}
			}
		}
		return null;
	}

	static Point[] arrayPoint = new Point[44];

	public static void taoMangPoint(int[][] a) {
		arrayPoint[0] = th1(a);
		arrayPoint[1] = th2(a);
		arrayPoint[2] = th3(a);
		arrayPoint[3] = th4(a);
		arrayPoint[4] = th5(a);
		arrayPoint[5] = th6(a);
		arrayPoint[6] = th7(a);
		arrayPoint[7] = th8(a);
		arrayPoint[8] = th9(a);
		arrayPoint[9] = th10(a);
		arrayPoint[10] = th11(a);
		arrayPoint[11] = th12(a);
		arrayPoint[12] = th13(a);
		arrayPoint[13] = th14(a);
		arrayPoint[14] = th15(a);
		arrayPoint[15] = th16(a);
		arrayPoint[16] = th17(a);
		arrayPoint[17] = th18(a);
		arrayPoint[18] = th19(a);
		arrayPoint[19] = th20(a);
		arrayPoint[20] = th21(a);
		arrayPoint[21] = th22(a);
		arrayPoint[22] = th23(a);
		arrayPoint[23] = th24(a);
		arrayPoint[24] = th25(a);
		arrayPoint[25] = th26(a);
		arrayPoint[26] = th27(a);
		arrayPoint[27] = th28(a);
		arrayPoint[28] = th29(a);
		arrayPoint[29] = th30(a);
		arrayPoint[30] = th31(a);
		arrayPoint[31] = th32(a);
		arrayPoint[32] = th33(a);
		arrayPoint[33] = th34(a);
		arrayPoint[34] = th35(a);
		arrayPoint[35] = th36(a);
		arrayPoint[36] = th37(a);
		arrayPoint[37] = th38(a);
		arrayPoint[38] = th39(a);
		arrayPoint[39] = th40(a);
		arrayPoint[40] = th41(a);
		arrayPoint[41] = th42(a);
		arrayPoint[42] = th43(a);
		arrayPoint[43] = th44(a);
	}

	public static Point giaoLai(int[][] a) {
		taoMangPoint(a);
		if (co4oKhonglienNhau(a) != null) {
			return co4oKhonglienNhau(a);
		}
		if (co4olienNhauchan1Dau(a) != null) {
			return co4olienNhauchan1Dau(a);
		}
		for (int i = 0; i < 44; i++) {
			if(arrayPoint[i] != null &&co3LienNhauChuaChan(a) != null&& arrayPoint[i].equals(co3LienNhauChuaChan(a)))
				return arrayPoint[i];
		}
		for (int i = 0; i < 44; i++) {
			if(arrayPoint[i] != null &&co3LienNhauChuaChan2(a) != null&& arrayPoint[i].equals(co3LienNhauChuaChan2(a)))
				return arrayPoint[i];
		}
		if (co3LienNhauChuaChan(a) != null) {
			return co3LienNhauChuaChan(a);
		}
		for (int i = 0; i < 44; i++) {
			for (int j = 0; j < 44; j++) {
				if (i != j && arrayPoint[i] != null && arrayPoint[j] != null && arrayPoint[i].equals(arrayPoint[j])) {
					return arrayPoint[i];
				}
			}
		}
		if (th1(a) != null) {
			return th1(a);
		}
		if (th2(a) != null) {
			return th2(a);
		}
		if (th3(a) != null) {
			return th3(a);
		}
		if (th4(a) != null) {
			return th4(a);
		}
		if (th5(a) != null) {
			return th5(a);
		}
		if (th6(a) != null) {
			return th6(a);
		}
		if (th7(a) != null) {
			return th7(a);
		}
		if (th8(a) != null) {
			return th8(a);
		}
		if (th9(a) != null) {
			return th9(a);
		}
		if (th10(a) != null) {
			return th10(a);
		}
		if (th11(a) != null) {
			return th11(a);
		}
		if (th12(a) != null) {
			return th12(a);
		}
		if (th13(a) != null) {
			return th13(a);
		}
		if (th14(a) != null) {
			return th14(a);
		}
		if (th15(a) != null) {
			return th15(a);
		}
		if (th16(a) != null) {
			return th16(a);
		}
		if (th17(a) != null) {
			return th17(a);
		}
		if (th18(a) != null) {
			return th18(a);
		}
		if (th19(a) != null) {
			return th19(a);
		}
		if (th20(a) != null) {
			return th20(a);
		}
		if (th21(a) != null) {
			return th21(a);
		}
		if (th22(a) != null) {
			return th22(a);
		}
		if (th23(a) != null) {
			return th23(a);
		}
		if (th24(a) != null) {
			return th24(a);
		}
		if (th25(a) != null) {
			return th25(a);
		}
		if (th26(a) != null) {
			return th26(a);
		}
		if (th27(a) != null) {
			return th27(a);
		}
		if (th28(a) != null) {
			return th28(a);
		}
		if (th29(a) != null) {
			return th29(a);
		}
		if (th30(a) != null) {
			return th30(a);
		}
		if (th31(a) != null) {
			return th31(a);
		}
		if (th32(a) != null) {
			return th32(a);
		}
		if (th33(a) != null) {
			return th33(a);
		}
		if (th34(a) != null) {
			return th34(a);
		}
		if (th35(a) != null) {
			return th35(a);
		}
		if (th36(a) != null) {
			return th36(a);
		}
		if (th37(a) != null) {
			return th37(a);
		}
		if (th38(a) != null) {
			return th38(a);
		}
		if (th39(a) != null) {
			return th39(a);
		}
		if (th40(a) != null) {
			return th40(a);
		}
		if (th41(a) != null) {
			return th41(a);
		}
		if (th42(a) != null) {
			return th42(a);
		}
		if (th43(a) != null) {
			return th43(a);
		}
		if (th44(a) != null) {
			return th44(a);
		}
		return null;
	}
}

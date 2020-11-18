package game.caro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Caro extends JFrame implements ActionListener {
	private JButton[][] bt = new JButton[15][21];
	private JLabel lbTile;
	private JButton btUndo, btExit, btNewGame;
	private int[][] danhDau = new int[15][21]; // danh dau nguoi hay may danh, danhDau = 1 la nguoi danh, =-1 may danh,
												// =-5 la hoa, =5 laf chua

	public Caro() {
		super("Caro");
		setLocation(250, 50);
		setSize(1000, 800);
		setVisible(true);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// panel 1 chua lable
		JPanel p1 = new JPanel();
		add(p1, BorderLayout.NORTH);
		p1.setLayout(new FlowLayout());
		lbTile = new JLabel("Hello");
		lbTile.setFont(new Font("Arial", Font.BOLD, 35));
		p1.add(lbTile);

		// panel 2 chua cac o bam
		JPanel p2 = new JPanel();
		add(p2, BorderLayout.CENTER);
		p2.setLayout(new GridLayout(15, 21));
		// tao cac button
		for (int i = 0; i < bt.length; i++) {
			for (int j = 0; j < bt[i].length; j++) {
				bt[i][j] = new JButton("");
				p2.add(bt[i][j]);
				bt[i][j].setBackground(Color.white);
				bt[i][j].setFont(new Font("Arial", Font.BOLD, 15));
				bt[i][j].addActionListener(this);
				danhDau[i][j] = 0;
				tick[i][j] = true; // thiet lap gia tri khoi diem cho cac o la chua danh = true
			}
		}

		// panel 3
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		add(p3, BorderLayout.SOUTH);
		btNewGame = new JButton("New Game");
		btUndo = new JButton("Undo");
		btNewGame.addActionListener(this);
		btUndo.setFont(new Font("Arial", Font.BOLD, 25));
		btExit = new JButton("Exit");
		btExit.setFont(new Font("Arial", Font.BOLD, 25));
		btNewGame.setFont(new Font("Arial", Font.BOLD, 25));
		btExit.addActionListener(this);
		btUndo.addActionListener(this);
		p3.add(btUndo);
		p3.add(btNewGame);
		p3.add(btExit);

		// setEnable bt Undo
		btUndo.setEnabled(false);
	}

	public boolean enableUndo() {
		for (int i = 0; i < bt.length; i++) {
			for (int j = 0; j < bt[i].length; j++) {
				if (danhDau[i][j] != 0)
					return true;
			}
		}
		return false;
	}

	public int checkWin() {
		for (int i = 0; i < bt.length; i++) {
			for (int j = 0; j < bt[i].length - 4; j++) {
				if (danhDau[i][j] != 0 && danhDau[i][j + 1] == danhDau[i][j] && danhDau[i][j + 2] == danhDau[i][j]
						&& danhDau[i][j + 3] == danhDau[i][j] && danhDau[i][j + 4] == danhDau[i][j]) {
					return danhDau[i][j];
				}
			}
		}
		for (int i = 0; i < bt.length - 4; i++) {
			for (int j = 0; j < bt[i].length - 4; j++) {
				if (danhDau[i][j] != 0 && danhDau[i + 1][j + 1] == danhDau[i][j]
						&& danhDau[i + 2][j + 2] == danhDau[i][j] && danhDau[i + 3][j + 3] == danhDau[i][j]
						&& danhDau[i + 4][j + 4] == danhDau[i][j]) {
					return danhDau[i][j];
				}
			}
		}
		for (int i = 0; i < bt.length - 4; i++) {
			for (int j = 0; j < bt[i].length - 4; j++) {
				if (danhDau[i][j] != 0 && danhDau[i + 1][j] == danhDau[i][j] && danhDau[i + 2][j] == danhDau[i][j]
						&& danhDau[i + 3][j] == danhDau[i][j] && danhDau[i + 4][j] == danhDau[i][j]) {
					return danhDau[i][j];
				}
			}
		}
		for (int i = 4; i < bt.length ; i++) {
			for (int j = 0; j < bt[i].length - 4; j++) {
				if (danhDau[i][j] != 0 && danhDau[i - 1][j + 1] == danhDau[i][j]
						&& danhDau[i - 2][j + 2] == danhDau[i][j] && danhDau[i - 3][j + 3] == danhDau[i][j]
						&& danhDau[i - 4][j + 4] == danhDau[i][j]) {
					return danhDau[i][j];
				}
			}
		}

		for (int i = 0; i < bt.length; i++) {
			for (int j = 0; j < bt.length; j++) {
				if (danhDau[i][j] == 0) {
					return 5;
				}
			}
		}
		return -5;
	}
	
	private int[][] r = new int[5][6];

	private boolean[][] tick = new boolean[15][21];// xem thu o da duoc danh dau chua
	private boolean endGame = false;// game da ket thuc chua
	private int count = 0;
	// private int x, y;

	// danh dau
	public void addPoint(int x, int y) {
		if (!endGame) {
			if (checkWin() == 5) {
				if (count % 2 == 0) {
					bt[x][y].setText("X");
					bt[x][y].setForeground(Color.red);
					count++;
					tick[x][y] = false;
					update(x, y);
					lbTile.setText("Lượt của Xanh");
					undoX.add(x);
					undoY.add(y);
					autoPoint(x, y);
				} else {
					bt[x][y].setText("O");
					bt[x][y].setForeground(Color.blue);
					count++;
					tick[x][y] = false;
					lbTile.setText("Lượt của Đỏ");
					undoX.add(x);
					undoY.add(y);
					update(x, y);
				}

			}
			if (checkWin() == -5) {
				JOptionPane.showMessageDialog(null, "Hòa");
				endGame = true;
			}
			if (checkWin() == 1) {
				JOptionPane.showMessageDialog(null, "được lắm con trai");
				endGame = true;
			}
			if (checkWin() == -1) {
				JOptionPane.showMessageDialog(null, "mày còn non lắm em à");
				endGame = true;
			}
		}
	}

	public void update(int x, int y) {
		if (bt[x][y].getText() == "X") {
			danhDau[x][y] = 1;
		}
		if (bt[x][y].getText() == "O") {
			danhDau[x][y] = -1;
		}
		if (bt[x][y].getText() == "") {
			danhDau[x][y] = 0;
			tick[x][y] = false;
		}
		btUndo.setEnabled(enableUndo());
	}

	// may tu danh
	public void autoPoint(int x, int y) {

		// Thread.sleep(1000);
		if (WillWin.giaoLai(danhDau) != null) {
			addPoint(WillWin.giaoLai(danhDau).getX(), WillWin.giaoLai(danhDau).getY());
		} else {
			auto(x, y);
			addPoint(auto(x, y).getX(), auto(x, y).getY());
		}
	}

	// auto danh 1 nuoc sao cho khoang cach la gan nhat neu chua co AI ho tro
	// sau nay viet them con AI vo nua la dc
	public Point auto(int x, int y) {
		Point B = new Point(x, y);
		double minDistance = Math.sqrt(x * x + y * y);
		int xMin = x, yMin = y;
		for (int i = 0; i < bt.length; i++) {
			for (int j = 0; j < bt[i].length; j++) {
				double distance = Math.sqrt(Math.pow(x - i, 2) + Math.pow(y - j, 2));
				if (distance < minDistance && tick[i][j]) {
					minDistance = distance;
					xMin = i;
					yMin = j;
				}
			}
		}
		B.setX(xMin);
		B.setY(yMin);
		return B;
	}

	private ArrayList<Integer> undoX = new ArrayList<Integer>();
	private ArrayList<Integer> undoY = new ArrayList<Integer>();

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		for (int i = 0; i < bt.length; i++) {
			for (int j = 0; j < bt[i].length; j++) {
				if (tick[i][j] && e.getSource() == bt[i][j]) {
					addPoint(i, j);
					// nho mÃ¡y Ä‘Ã¡nh pháº£i cÃ³ lá»‡nh dÆ°á»›i nÃ y
				}
			}
		}
		if (e.getSource() == btExit) {
			System.exit(0);
		}
		if (e.getSource() == btNewGame) {
			new Caro();
			this.dispose();
		}
		if (e.getSource() == btUndo) {
			endGame = false;

			Object[] arrayUndoX = undoX.toArray();
			Object[] arrayUndoY = undoY.toArray();
			bt[(int) arrayUndoX[arrayUndoX.length - 1]][(int) arrayUndoY[arrayUndoY.length - 1]].setText("");
			update((int) arrayUndoX[arrayUndoX.length - 1], (int) arrayUndoY[arrayUndoY.length - 1]);
			tick[(int) arrayUndoX[arrayUndoX.length - 1]][(int) arrayUndoY[arrayUndoY.length - 1]] = true;
			undoX.remove(arrayUndoX.length - 1);
			undoY.remove(arrayUndoY.length - 1);
			count -= 1;
			if (undoX.size() == 0) {
				btUndo.setEnabled(false);
			}
		}
	}
}

// tạo ra cac diem 
class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	public boolean equals(Point that) {
		return this.x == that.x && this.y == that.y;
	}

}

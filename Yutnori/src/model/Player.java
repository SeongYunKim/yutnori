package model;

public class Player {

	public static Yutnori yutnori = new Yutnori();
	private int playerID;
	private int numOfRestPiece = 4;
	private int numOfRestTurn = 1;

	public Player(int playerID) {
		this.playerID = playerID;
	}

	// ����� ���� �߻��� �� ���� ȣ��(numOfPassPiece: ����� �� ����)
	public void setNumOfRestPiece(int numOfPassPiece) {
		this.numOfRestPiece -= numOfPassPiece;
	}

	public int throwYut() {
		int numOfFront = 0;
		boolean[] throwResult = new boolean[4];
		for (int i = 0; i < yutnori.getYutSet().length; i++) {
			if (throwResult[i] = yutnori.getYutSet()[i].getIsFront()) {
				System.out.println(i);
				numOfFront++;
			}
		}
		// �鵵
		if (numOfFront == 1 && throwResult[3]) {
			numOfFront = -1;
		}

		else if (numOfFront == 0 || numOfFront == 4) {
			// �� ������ �߰� 1ȸ �ο�
			numOfRestTurn++;

			// ��
			if (numOfFront == 0) {
				numOfFront = 5;
			}
		}
		numOfRestTurn--;
		// ��: 1, ��: 2, ��: 3, ��: 4, ��: 5, �鵵: -1
		return numOfFront;
	}
}

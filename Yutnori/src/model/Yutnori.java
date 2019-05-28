package model;

public class Yutnori {
	
	private int turn;
	private int numOfPlayer;
	private Board board;
	private Yut[] yutSet = new Yut[4];

	public Yutnori() {
		for (int i = 0; i < 4; i++) {
			this.yutSet[i] = new Yut(i); // if i == 3 then BACKDO
		}
		this.board = new Board();
	}

	public int getTurn() {
		return turn;
	}
	
	public Yut[] getYutSet() {
		return yutSet;
	}

	public void setNumOfPlayer(int numOfPlayer) {
		this.numOfPlayer = numOfPlayer;
	}
	
	public boolean move(int selected_x, int selected_y, int target_x, int target_y) {
		boolean catched = false;
		if(this.board.boardTable[target_x][target_y].get_piece() == null) {
	    	this.board.boardTable[target_x][target_y].put_piece(this.board.boardTable[selected_x][selected_y].get_piece());
			this.board.boardTable[selected_x][selected_y].remove_piece();
		}
		else if(this.board.boardTable[target_x][target_y].get_piece().get_team() == this.board.boardTable[selected_x][selected_y].get_piece().get_team()) {
			this.board.boardTable[target_x][target_y].get_top_piece().stack_piece(board.boardTable[selected_x][selected_y].get_piece());
			this.board.boardTable[selected_x][selected_y].remove_piece();
		}
		else {
			this.board.boardTable[target_x][target_y].put_piece(this.board.boardTable[selected_x][selected_y].get_piece()); // �ٽ� Piece ���󺹱� ��Ű�� �� �����ؾߵ�
			catched = true;
		}
		return catched;
	}
}
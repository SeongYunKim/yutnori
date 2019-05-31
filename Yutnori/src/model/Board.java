package model;

public class Board {
	private Tile[][] gameBoard = new Tile[6][5];
	private Tile[] waitingPieceBoard = new Tile[CONSTANT.PLAYERNUM];

	public Board(Piece[][] pieceArray) {
		/*
		for(int i=0; i<6; i++) {
			for(int j=0; j<5; j++) {
				gameBoard[i][j] = new Tile(i, j);
			}
		}
		*/
		System.out.printf("%d", pieceArray[0][3].getID());
		for (int i = 0; i < waitingPieceBoard.length; i++) {
			for (int j = CONSTANT.PIECENUM - 1; j > 0; j--) {
				pieceArray[i][j].stackPiece(pieceArray[i][j - 1]);
			}
			waitingPieceBoard[i].putPiece(pieceArray[i][3]);
		}
	}
	
	public Tile[][] getGameBoard(){
		return gameBoard;
	}
	
	public Tile[] getWaitingPieceBoard() {
		return waitingPieceBoard;
	}
}

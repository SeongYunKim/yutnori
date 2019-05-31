package model;

public class Tile {
	private Piece piece;
	//private int xCord;
	//private int yCord;
	
	/*
	public Tile(int xCord, int yCord) {
		this.piece = null;
		this.xCord = xCord;
		this.yCord = yCord;
	}
	
	public int getXCord() {
		return xCord;
	}
	
	public int getYCord() {
		return yCord;
	}
	*/
	
	public void putPiece(Piece piece) {
		this.piece = piece;
	}

	public void removePiece() {
		this.piece = null;
	}
	
	public Piece getPiece() {
		return this.piece;
	}
	
	public Piece getTopPiece() {
		if(this.piece == null || this.piece.getNextPiece() == null)
			return this.piece;
		else {
			Piece ptr = this.piece;
			while(ptr.getNextPiece() == null)
				ptr = ptr.getNextPiece();
			return ptr;
		}
	}
	
    public int getNumOfPiece() {
    	int num = 0;
    	//Piece ptr = boardTable[selected.getX()][selected.getY()].getPiece();
    	if(piece == null) 
    		return num;
    	while(piece != null) {
    		num++;
    		piece = piece.getNextPiece();
    	}
    	return num;
    }
}

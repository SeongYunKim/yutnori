package model;

import java.util.Random;

public class Yut {

	private boolean isBackDoYut;
	private boolean isFront; // ������ ���� �ո�

	public Yut(int yutType) {
		if (yutType == 3)
			this.isBackDoYut = true;
		else
			this.isBackDoYut = false;
	}

	public boolean getIsFront() {
		Random random = new Random();
		isFront = random.nextBoolean();
		return isFront;
	}

	public boolean getIsBackDo() {
		return isBackDoYut;
	}
}
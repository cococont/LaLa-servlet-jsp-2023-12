package model;

import java.util.Random;

public class GameLogic {
//	public void CreateUserHand(Hands hands, int user) {
//		hands.setUser(user);
//	}

	public void createComHand(Hands hands) {
		int com = new Random().nextInt(3); 
		hands.setCom(com);
	}
	
	public void stringHand(Hands hands) {
		String[] handslist = {"グー", "チョキ", "パー"};
		hands.setUserHand(handslist[hands.getUser()]);
		hands.setComHand(handslist[hands.getCom()]);
	}

	public void gameResult(Hands hands) {
		int user = hands.getUser();
		int com = hands.getCom();
		switch ((user - com + 3) % 3) {
			case (0):
				hands.setResult("あいこ");
				break;
			case (1):
				hands.setResult("負け");
				break;
			case (2):
				hands.setResult("勝ち");
				break;
			default:
				hands.setResult("結果が不正です");
		}
	}
	
}

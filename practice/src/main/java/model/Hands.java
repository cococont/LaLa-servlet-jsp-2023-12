package model;

public class Hands {
	private int user;
	private String userHand;
	private int com;
	private String comHand;
	private String result;
	
	public Hands() {}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getUserHand() {
		return userHand;
	}

	public void setUserHand(String userHand) {
		this.userHand = userHand;
	}

	public String getComHand() {
		return comHand;
	}

	public void setComHand(String comHand) {
		this.comHand = comHand;
	}
	

}

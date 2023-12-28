package model;

import java.io.Serializable;

public class Player implements Serializable{
	private int number;
	private String msg;

	public Player() {}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}

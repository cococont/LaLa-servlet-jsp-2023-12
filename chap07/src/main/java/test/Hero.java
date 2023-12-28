package test;

import java.io.Serializable;

public class Hero implements Serializable {
//	private static final long serialVersionUID = 1L;
	private String name;
	private int hp;
	private int mp;
	
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 50;
	}

	public String getName() {
		return name;
	}
	
	public int hp() {
		return hp;
	}
	
	public int mp() {
		return mp;
	}
}

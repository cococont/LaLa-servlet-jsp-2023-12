package model;

public class User {
	private String id, name, pass;

	public User() {}

	public User(String id, String name, String pass) {
		this.id = id;
		this.name = name;
		this.pass = pass;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}

}

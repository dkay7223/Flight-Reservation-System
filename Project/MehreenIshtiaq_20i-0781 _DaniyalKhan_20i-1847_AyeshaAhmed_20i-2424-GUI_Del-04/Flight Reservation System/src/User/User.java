package User;

public class User {
	private String username;
	private int userId;

	public User(String username, int userId) {
		this.username = username;
		this.userId = userId;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}

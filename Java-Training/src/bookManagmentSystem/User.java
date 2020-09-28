package bookManagmentSystem;

public class User {
	
	private int userId;
	private String userName;
	private boolean isStaff;
	private boolean isAdmin;
	public User(int userId, String userName, boolean isStaff, boolean isAdmin) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.isStaff = isStaff;
		this.isAdmin = isAdmin;
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isStaff() {
		return isStaff;
	}
	public void setStaff(boolean isStaff) {
		this.isStaff = isStaff;
	}
	
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "userId=" + userId + ", userName=" + userName + ", isStaff=" + isStaff + ", isAdmin=" + isAdmin + "\n";
	}
	

}

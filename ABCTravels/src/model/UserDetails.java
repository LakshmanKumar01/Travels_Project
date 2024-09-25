package model;

public class UserDetails {

	private String FirstName;
	private String LastName;
	private int MobileNumber;
	private String Gender;
	private String EmailId;
	private String password;
	private int failedCount;
	private String accountStatus;

	public UserDetails(String firstName, String lastName, int mobileNumber, String gender, String emailId,
			String password, int failedCount, String accountStatus) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.MobileNumber = mobileNumber;
		this.Gender = gender;
		this.EmailId = emailId;
		this.password = password;
		this.failedCount = failedCount;
		this.accountStatus = accountStatus;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	@Override
	public String toString() {
		return "UserDetails [FirstName=" + FirstName + ", LastName=" + LastName + ", MobileNumber=" + MobileNumber
				+ ", Gender=" + Gender + ", EmailId=" + EmailId + ", password=" + password + ", failedCount="
				+ failedCount + ", accountStatus=" + accountStatus + "]";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFailedCount() {
		return failedCount;
	}

	public void setFailedCount(int failedCount) {
		this.failedCount = failedCount;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

}

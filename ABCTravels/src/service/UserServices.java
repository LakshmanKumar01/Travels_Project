package service;

import model.UserDetails;
import java.util.Scanner;
import java.util.List;
import java.util.Map;

public class UserServices {
	private List<UserDetails> users;
	private Map<String, Integer> userInvalidAttempts;

	public UserServices(List<UserDetails> users, Map<String, Integer> userInvalidAttempts) {
		this.users = users;
		this.userInvalidAttempts = userInvalidAttempts;
	}

	public void newUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n New Admin User Registration");

		System.out.println("\n enter First Name");
		String firstName = sc.nextLine();

		System.out.println("\n enter Last Name");
		String lastName = sc.nextLine();

		System.out.println("\n enter Moile Number");
		int mobileNo = sc.nextInt();

		System.out.println("\n enter your Gender");
		String gender = sc.next();

		System.out.println("\n enter your emailId");
		String emailId = sc.next();

		System.out.println("\n enter your password");
		String pass = sc.next();

		if (isUserExists(emailId)) {
			System.out.println("User with this email: " + emailId + " already exists");
		}
		UserDetails user = new UserDetails(firstName, lastName, mobileNo, gender, emailId, pass, 0, "Active");
		users.add(user);
		System.out.println("Registration successful");
		sc.close();
	}

	private boolean isUserExists(String email) {
		for (UserDetails userDetails : users) {
			if (userDetails.getEmailId().equals(email)) {
				return true;
			}
		}
		return false;
	}

	public UserDetails login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n User Login");

		System.out.println("Enter Email");
		String email = sc.nextLine();

		System.out.println("Enter Password");
		String pass = sc.next();
		for (UserDetails userDetails : users) {
			if (userDetails.getEmailId().equals(email)) {
				Integer existingCount = userInvalidAttempts.getOrDefault(email, 0);
				if (existingCount >= 5) {
					System.out.println("User Account is Locked due to multiple invalid Login");
					return null;
				}
				if (userDetails.getPassword().equals(pass)) {
					System.out.println("\n Login successful");
					userInvalidAttempts.put(email, 0);
					return userDetails;
				} else {
					userInvalidAttempts.put(email, existingCount + 1);
					System.out.println("\n Invalid Credentials.Attempt:" + (existingCount + 1) + "for email:");
				}
			}
			sc.close();
		}
		System.out.println("No user found with email: " + email);
		return null;
	}

}

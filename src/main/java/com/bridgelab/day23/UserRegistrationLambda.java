package com.bridgelab.day23;

import java.util.regex.Pattern;

@FunctionalInterface
interface Check {
	boolean check(String a, String b, String c) throws InvalidUserException;
}

public class UserRegistrationLambda {
	public static void main(String[] args) throws InvalidUserException {
		Check firstName = (String pattern, String fname, String mood) -> {
			try {
				if (mood.equals("Happy")) {
					if (Pattern.matches(pattern, fname))
						return true;
					else
						return false;
				} else
					return false;
			} catch (NullPointerException e) {
				throw new InvalidUserException("Please enter proper message");
			}
		};
		Check lastName = (String pattern, String lname, String mood) -> {
			try {
				if (mood.equals("Happy")) {
					if (Pattern.matches(pattern, lname))
						return true;
					else
						return false;
				} else
					return false;
			} catch (NullPointerException e) {
				throw new InvalidUserException("Please enter proper message");
			}
		};
		Check email = (String pattern, String iEmail, String mood) -> {
			try {
				if (mood.equals("Happy")) {
					if (Pattern.matches(pattern, iEmail))
						return true;
					else
						return false;
				} else
					return false;
			} catch (NullPointerException e) {
				throw new InvalidUserException("Please enter proper message");
			}
		};
		Check phone = (String pattern, String iPhone, String mood) -> {
			try {
				if (mood.equals("Happy")) {
					if (Pattern.matches(pattern, iPhone))
						return true;
					else
						return false;
				} else
					return false;
			} catch (NullPointerException e) {
				throw new InvalidUserException("Please enter proper message");
			}
		};
		Check password = (String pattern, String iPassword, String mood) -> {
			try {
				if (mood.equals("Happy")) {
					if (Pattern.matches(pattern, iPassword))
						return true;
					else
						return false;
				} else
					return false;
			} catch (NullPointerException e) {
				throw new InvalidUserException("Please enter proper message");
			}
		};
		firstName.check("^[A-Z]{1}[a-z]{3,}$", "Jayashree", "Happy");
		firstName.check("^[A-Z]{1}[a-z]{3,}$", "mtre", "Happy");
		lastName.check("^[A-Z]{1}[a-z]{3,}$", "Sunil", "Happy");
		lastName.check("^[A-Z]{1}[a-z]{3,}$", "kudre", "Happy");
		email.check("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$", "senthil123@gmail.com",
				"Happy");
		email.check("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$", "sk1#gmail.com",
				"Happy");
		phone.check("^[0-9]{2}[ ]?[0-9]{10}$", "912345678901", "Happy");
		phone.check("^[0-9]{2}[ ]?[0-9]{10}$", "919876543210", "Happy");
		password.check("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])", "senthil@", "Happy");
		password.check("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])", "psk123", "Happy");

	}
}
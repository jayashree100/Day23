package com.bridgelab.day23;

import java.lang.*;
import java.util.regex.Pattern;

public class UserRegistration {
	public boolean firstName(String pattern, String firstName, String mood) throws InvalidUserException {
		try {
			if (mood.equals("Happy")) {
				if (pattern.matches(pattern))
					return true;
				else
					return false;
			} else
				return false;
		} catch (NullPointerException e) {
			throw new InvalidUserException("please Enter proper message");
		}
	}

}

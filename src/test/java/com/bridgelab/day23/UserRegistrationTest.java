package com.bridgelab.day23;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	// UserCase1
	@Test
	public void firstNameTestShouldReturnTrue() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$", "Senthil", "Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertTrue(result);
	}

	@Test
	public void firstNameTestShouldReturnFalse() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$", "sen", "Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertFalse(result);

	}

	// UserCase2
	@Test
	public void lastNameTestShouldReturnTrue() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.lastName("^[A-Z]{1}[a-z]{3,}$", "kumar", "Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertTrue(result);
	}

	@Test
	public void lastNameTestShouldReturnFalse() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.lastName("^[A-Z]{1}[a-z]{3,}$", "km", "Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertFalse(result);
	}

	// UserCase3
	@Test
	public void emailTestShouldReturnTrue() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$",
					"psk12@gmail.com", "Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertTrue(result);
	}

	@Test
	public void emailTestShouldReturnFalse() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$",
					"sk123@gmail.com", "Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertFalse(result);
	}

	// UserCase4
	@Test
	public void phoneTestShouldReturnTrue() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.phone("^[0-9]{2}[ ]?[0-9]{10}$", "9112345678901", "Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertTrue(result);
	}

	@Test
	public void phoneTestShouldReturnFalse() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.phone("^[0-9]{2}[ ]?[0-9]{10}$", "919876543210", "Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertFalse(result);
	}

	// UserCase8
	@Test
	public void passwordTestShouldReturnTrue() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.password("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])", "psk123@",
					"Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertTrue(result);
	}

	@Test
	public void passwordTestShouldReturnFalse() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.password("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])", "psk123",
					"Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertFalse(result);
	}
}
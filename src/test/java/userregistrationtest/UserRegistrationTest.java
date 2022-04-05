package userregistrationtest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.bridgelab.day23.InvalidUserException;
import com.bridgelab.day23.UserRegistration;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void firstNameShouldReturnTrue() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$", "Jayashree", "Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertTrue(result);
	}

	@Test
	public void firstNameShouldReturnFalse() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$", "Viju", "Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertTrue(result);
	}

}

package userregistrationtest;

import com.bridgelab.day23.InvalidUserException;

public class ExpectedException {
       public static ExpectedException none() {
    	   return null;
       }
       
       public void expect(Class<InvalidUserException> invalidUserExceptionClass) {
    	   
       }
}

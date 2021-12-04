package kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	  @Test
	  public void shouldReturnNumbers0To100() {
	    assertEquals("2", FizzBuzz.getResult(2));
	    assertEquals("4", FizzBuzz.getResult(4));
	    assertEquals("7", FizzBuzz.getResult(7));
	  }
	
}

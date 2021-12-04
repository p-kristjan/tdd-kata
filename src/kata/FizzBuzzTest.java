package kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	  @Test
	  public void shouldReturnNumbers0To100IfNoOtherRequirementIsFulfilled() {
		  assertEquals("2", FizzBuzz.getResult(2));
		  assertEquals("4", FizzBuzz.getResult(4));
		  assertEquals("7", FizzBuzz.getResult(7));
	  }
	
	  @Test
	  public void shouldReturnFizzIfNumberDivisibleBy3() {
		  assertEquals("Fizz", FizzBuzz.getResult(3));
		  assertEquals("Fizz", FizzBuzz.getResult(6));
		  assertEquals("Fizz", FizzBuzz.getResult(9));
	  }
	  
}

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
	  
	  @Test
	  public void shouldReturnFizzIfNumberDivisibleBy5() {
		  assertEquals("Buzz", FizzBuzz.getResult(5));
		  assertEquals("Buzz", FizzBuzz.getResult(10));
		  assertEquals("Buzz", FizzBuzz.getResult(20));
	  }
	  
	  @Test
	  public void shouldReturnFizzIfNumberBothDivisibleBy5And3() {
		  assertEquals("Buzz", FizzBuzz.getResult(15));
		  assertEquals("Buzz", FizzBuzz.getResult(30));
		  assertEquals("Buzz", FizzBuzz.getResult(45));
	  }
	  
}

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void test2() {
		Prime number = new Prime();
		assertTrue(number.isPrime(2));
	}
	
	@Test
	public void test3() {
		Prime number = new Prime();
		assertTrue(number.isPrime(3));
	}
	
	@Test
	public void test4() {
		Prime number = new Prime();
		assertFalse(number.isPrime(4));
	}
	
	@Test
	public void test5() {
		Prime number = new Prime();
		assertTrue(number.isPrime(5));
	}
	
	@Test
	public void test6() {
		Prime number = new Prime();
		assertFalse(number.isPrime(6));
	}

}

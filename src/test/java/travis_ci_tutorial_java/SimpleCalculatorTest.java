package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	
	/*@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(5, 3), 2);
	}*/
	
	
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	
	
	
	
	@Test
	public void testMultiple() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(8,2), 16);
	}
	
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(6, 3), 2);
	}
	
	/*@Test
	public void testDivide2() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(6, 0), 0);
	}*/
	
	
}

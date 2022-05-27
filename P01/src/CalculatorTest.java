import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
				
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
				 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testSubtract() {
		int a = 120;
		int b = 10;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 110;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testMultiply() {
		int a = 120;
		int b = 10;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 1200;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testDivide() {
		int a = 120;
		int b = 10;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 12;
		assertEquals (expected, actual);

	}
}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
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
	public void testsub() {
//		fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 3087;
		assertEquals (expected, actual);
		
	}
	
	@Test
	public void testmultiply() {
		int a = 1000;
		int b = 5;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 5000;
		assertEquals (expected, actual);
		
		}
	
	@Test
	public void testdivide() {
		int a = 10000;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 5000;
		assertEquals (expected, actual);
		}



}

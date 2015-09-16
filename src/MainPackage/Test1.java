package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1 {
	MyInteger testClass1, testClass2;
	int testInt1;
	String testString1, testString2;
	char[] testCharray1 = {'1','3','5','6'};
	char[] testCharray2 = {'4','0','2','3','7'};
	
	@Before
	public void setUp() throws Exception {
		testClass1 = new MyInteger(4);
		testClass2 = new MyInteger(13);
		testString1 = "321";
		testString2 = "56565";
		testInt1 = 17;
	}
	
	@After
	public void tearDown() throws Exception {
		testClass1 = null;
		testClass2 = null;
	}
	
	@Test
	public void testIsEven() {
		assertEquals(testClass1.isEven(),true);
		assertEquals(testClass2.isEven(),false);
	}
	@Test
	public void testIsOdd() {
		assertEquals(testClass1.isOdd(),false);
		assertEquals(testClass2.isOdd(),true);
	}
	@Test
	public void testIsPrime() {
		assertEquals(testClass1.isPrime(),false);
		assertEquals(testClass2.isPrime(),true);
	}
	@Test
	public void testStaticInts() {
		assertEquals(MyInteger.isEven(testInt1),false);
		assertEquals(MyInteger.isOdd(testInt1),true);
		assertEquals(MyInteger.isOdd(testInt1),true);
	}
	@Test
	public void testStaticMyIntegers() {
		assertEquals(MyInteger.isEven(testClass1),true);
		assertEquals(MyInteger.isOdd(testClass1),false);
		assertEquals(MyInteger.isPrime(testClass1),false);
	}
	@Test
	public void testEquals() {
		assertEquals(testClass1.equals(testInt1),false);
		assertEquals(testClass1.equals(testClass2),false);
	}
	@Test
	public void testParseIntChars() {
		assertEquals(MyInteger.parseInt(testCharray1),1356);
		assertEquals(MyInteger.parseInt(testCharray2),40237);
	}
	@Test
	public void testParseIntString() {
		assertEquals(MyInteger.parseInt(testString1),321);
		assertEquals(MyInteger.parseInt(testString2),56565);
	}
}

import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() { //computes for the factorial of a number
		MyCalculator test1 = new MyCalculator();
		int actual1 = test1.nfactorial(1);
		
		assertEquals(1, actual1, 0.0);
	}
	public void testNfactorial1() { //computes for the factorial of a number
		MyCalculator test1 = new MyCalculator();
		int actual1 = test1.nfactorial(2);
		
		assertEquals(2, actual1, 0.0);
	}
	public void testNfactorial2() { //computes for the factorial of a number
		MyCalculator test1 = new MyCalculator();
		int actual1 = test1.nfactorial(3);
		
		assertEquals(6, actual1, 0.0);
	}
	public void testNfactorial3() { //computes for the factorial of a number
		MyCalculator test1 = new MyCalculator();
		int actual1 = test1.nfactorial(4);
		
		assertEquals(24, actual1, 0.0);
	}
	public void testNfactorial4() { //computes for the factorial of a number
		MyCalculator test1 = new MyCalculator();
		int actual1 = test1.nfactorial(5);
		
		assertEquals(120, actual1, 0.0);
	}

	@Test
	public void testBinarySearch() { //determines the index of a number in the array
		MyCalculator test2 = new MyCalculator();
		int [] array = {2,4,5,7,8};
		int actual2 = test2.binarySearch(array, 8);
		
		assertEquals(4,actual2, 0.0);
	}
	public void testBinarySearch1() { //determines the index of a number in the array
		MyCalculator test2 = new MyCalculator();
		int [] array = {2,4,5,7,8};
		int actual2 = test2.binarySearch(array, 4);
		
		assertEquals(1,actual2, 0.0);
	}
}

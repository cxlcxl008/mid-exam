import static org.junit.Assert.*;

import org.junit.Test;

public class SortingTest {
	private Sorting s=new Sorting(); 
	int a[];
	Object b[]=new Object[3];
	@Test
	public void testIS() {
		a=new int[]{3,5,2,7,1};
		s.insertionSort(a);
		assertEquals(true, s.isSorted(a));
	}
	@Test
	public void testQS1() {
		a=new int[]{3,5,2,7,1,9,2,4,10,6,11};
		s.quicksort(a);
		assertEquals(true, s.isSorted(a));
	}
	@Test
	public void testQS2() {
		a=new int[]{11,5,2,7,1,3,2,4,10,6,9};
		s.quicksort(a);
		assertEquals(true, s.isSorted(a));
	}
	@Test
	public void testQS3() {
		a=new int[]{9,5,2,7,1,11,2,4,10,6,3};
		s.quicksort(a);
		assertEquals(true, s.isSorted(a));
	}
	@Test
	public void testQS4() {
		a=new int[]{1,2,3,4,7,6,5,8,9,10,11};
		s.quicksort(a);
		assertEquals(true, s.isSorted(a));
	}
	@Test
	public void testIsS() {
		a=new int[]{3,5,2,7,1,9,2,4,10,6,11};
	
		assertEquals(false, s.isSorted(a));
	}
	@Test
	public void testSR() {
		for(int i=0;i<3;i++){
			b[i]=new Object();
			b[i]=i+1;
		}
		s.swapReferences(b, 1, 2);
		assertEquals("3", b[1].toString());
	}
}

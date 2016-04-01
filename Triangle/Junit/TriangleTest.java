import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	Triangle t;
	@Test
	public void testIso() {
		t=new Triangle(2, 2, 3);
		assertEquals("Isosceles", t.getType(t));
	}
	@Test
	public void testIll() {
		t=new Triangle(1, 2, 3);
		assertEquals("Illegal", t.getType(t));
	}
	@Test
	public void testReg() {
		t=new Triangle(2, 2, 2);
		assertEquals("Regular", t.getType(t));
	}
	@Test
	public void testSca() {
		t=new Triangle(2, 3, 4);
		long a[]=t.getBorders();
		assertEquals("Scalene", t.getType(t));
		for(int i=0;i<3;i++){
			assertEquals(i+2, a[i]);
		}
	}
	@Test
	public void test1() {
		t=new Triangle(2, 3, 3);
		assertEquals("Isosceles", t.getType(t));
	}
	@Test
	public void test2() {
		t=new Triangle(2, 3, 2);
		assertEquals("Isosceles", t.getType(t));
	}
	@Test
	public void test3() {
		t=new Triangle(-2, 3, 2);
		assertEquals("Illegal", t.getType(t));
	}
	@Test
	public void test4() {
		t=new Triangle(2, -3, 2);
		assertEquals("Illegal", t.getType(t));
	}
	@Test
	public void test5() {
		t=new Triangle(2, 3, -2);
		assertEquals("Illegal", t.getType(t));
	}
	

}

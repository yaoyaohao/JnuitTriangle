import static org.junit.Assert.*;

import org.junit.Test;


public class testTri {
	
	public Triangle t;

	@Test
	public void test() {
		t = new Triangle(1,2,4);
		assertEquals(false,t.isTriangle(t));
		t = new Triangle(2,3,3);
		assertEquals("Isosceles",t.getType(t));
		t = new Triangle(3,3,3);
		assertEquals("Regular",t.getType(t));
		t = new Triangle(2,3,4);
		assertEquals("Scalene",t.getType(t));
		assertEquals(1, t.diffOfBorders(1, 2));
		assertEquals(1, t.diffOfBorders(2, 1));
		long[] borders = new long[]{1,2,3};
		assertArrayEquals(borders, t.getBorders());
		
	}

}
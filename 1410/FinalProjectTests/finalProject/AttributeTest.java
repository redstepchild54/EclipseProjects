package finalProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class AttributeTest {
	
	private Attribute att = new Attribute(10);
	
	@Test(expected = IllegalArgumentException.class)
	public void testAttributeWithNegative() {
		new Attribute(-1);
	}

	@Test
	public void testGetAttribute() {
		int expected = 10;
		int actual = att.getAttribute();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetAttribute() {
		int expectedAt = 9;
		int expectedMod = -1;
		att.setAttribute(9);
		int actualAt = att.getAttribute();
		int actualMod = att.getAttributeMod();
		assertEquals(expectedAt, actualAt);
		assertEquals(expectedMod, actualMod);
	}

	@Test
	public void testGetAttributeMod() {
		int expected = 0;
		int actual = att.getAttributeMod();
		assertEquals(expected, actual);
	}

	@Test
	public void testToString() {
		String expected = "Attribute [attribute=10, attributeMod=0]";
		String actual = att.toString();
		assertEquals(expected, actual);
	}

}

package com.epam.TDD_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class RemoveFirst2ACharsTest {
	/*
	 * 1.  "ABCD" => "BCD" --success
	 * 2.  "AACD" => "CD" --success
     * 3.  "BACD" => "BCD" --success
     * 4.  "BBAA" => "BBAA" --success      
     * 5.  "AABAA" => "BAA" --success (covered in test case 2)
	 * 6.  "A" => "" --success
	 * 7.  "" => "" --success
	 * 8.  "B" => "B" (covered in test case 6)
	 */
	
	RemoveFirst2AChars removeFirst2AChars; 
	
	@BeforeEach
	void setUp()
	{
		removeFirst2AChars = new RemoveFirst2AChars();
	}
	
	@Test
	void testFirst1A() {
		assertEquals("BCD",removeFirst2AChars.remove("ABCD"));
	}
	
	@Test
	void testFirst2A() {
		assertEquals("CD",removeFirst2AChars.remove("AACD"));
	}
	
	@Test
	void testSecond1A() {
		assertEquals("BCD",removeFirst2AChars.remove("BACD"));
	}
	
	@Test
	void testNoFirst2CharA() {
		assertEquals("BBAA",removeFirst2AChars.remove("BBAA"));
	}
	
	@Test
	void testOnlyCharA() {
		assertEquals("",removeFirst2AChars.remove("A"));
	}
	
	@Test
	void testNoChar() {
		assertEquals("",removeFirst2AChars.remove(""));
	}
}

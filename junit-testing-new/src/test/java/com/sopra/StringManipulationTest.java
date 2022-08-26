package com.sopra;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulationTest {

	public void testConcat() {
		StringManipulation obj=new StringManipulation();
		String result=obj.concat("Bhawna","Ji");
		assertEquals("Bhawna Ji", result);
		System.out.println("Testing Successful");
    
	}
}

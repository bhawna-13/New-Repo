package com.sopra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculationTest {
	
	Calculation c;
	
	@BeforeEach
	public void setUp() {
		c=new Calculation();
	}
	
    @Test
    void testSum() {
        Calculation c= new Calculation();
        int result= c.sum(10, 20);
        
        assertEquals(30, result);
        
        System.out.println("Testing Successful");
    }
    @Test
    void testExcepetionIsThrown() {
    	assertThrows(IllegalArgumentException.class,() -> c.divide(1000, 5));
    	
    }
//    @Test
//    void testdiv() {
//        Calculation c= new Calculation();
//        int result= c.div(30, 10);
//        
//        assertEquals(3, result);
//        
//        System.out.println("Testing Successful");
//    }
//    @Test
//    void testmult() {
//        Calculation c= new Calculation();
//        int result= c.mult(3, 5);
//        
//        assertEquals(15, result);
//        
//        System.out.println("Testing Successful");
//    }
//    
//    @AfterEach
//    public void clear() {
//    	c=null;
//    }
    
    
    }
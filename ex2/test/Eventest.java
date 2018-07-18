package com.ex2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.ex2.Even;

public class Eventest {
    private static Even pal;

    @BeforeClass
    public static void setup() {
        pal = new Even();

    }

    @AfterClass
    public static void teardown() {
        pal = null;

    }

    //@SuppressWarnings("deprecation")
    @Test
    public void testCheckPower() {
        int num = 16;
        assertEquals(true, pal.isEven(num));
    }
   /* @Test
   public void testPowerOfFour() {
        int num = 16;
        assertEquals(1, pal.reverse(num));
    }*/
    @Test
	public void testCheckPowerFailure() {
    	int num = 17;
		assertNotNull("ant",pal.isEven(num));
				
		assertNotEquals(
				1,pal.isEven(num));
				
	}

} 


package com.ex2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.ex2.Power;

public class Powertest {
    private static Power pal;

    @BeforeClass
    public static void setup() {
        pal = new Power();

    }

    @AfterClass
    public static void teardown() {
        pal = null;

    }

    //@SuppressWarnings("deprecation")
    @Test
    public void testCheckPower() {
        int num = 64;
        assertEquals(true, pal.isPowerOfFour(num));
    }
   /* @Test
   public void testPowerOfFour() {
        int num = 16;
        assertEquals(1, pal.reverse(num));
    }*/
    @Test
	public void testCheckPowerFailure() {
    	int num = 24542;
		assertNotNull("ant",pal.isPowerOfFour(num));
				
		assertNotEquals(
				1,pal.isPowerOfFour(num));
				
	}

} 


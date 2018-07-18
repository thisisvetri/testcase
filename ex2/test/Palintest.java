package com.ex2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.ex2.Palin;;

public class Palintest {
    private static Palin pal;

    @BeforeClass
    public static void setup() {
        pal = new Palin();

    }

    @AfterClass
    public static void teardown() {
        pal = null;

    }

    //@SuppressWarnings("deprecation")
    @Test
    public void testCheckPalindrome() {
        int num = 24542;
        assertEquals(24542, pal.reverse(num));
    }
   /* @Test
   public void testPowerOfFour() {
        int num = 16;
        assertEquals(1, pal.reverse(num));
    }*/
    @Test
	public void testCheckPalindromeFailure() {
    	int num = 24542;
		assertNotNull("ant",pal.reverse(num));
				
		assertNotEquals(
				1,pal.reverse(num));
				
	}

}
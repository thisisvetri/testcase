package com.ex2.test;
import com.ex2.Places;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Freqtest {
	
	
	  private static Places freq;
	    @Test
	    public void testFreq() {
	       assertEquals("{hi=1, vetri=2, i=2, am=2}", freq.output());
	   }

	}



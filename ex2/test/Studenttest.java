package com.ex2.test;
import com.ex2.Student;
import com.ex2.Newclass;
import com.ex2.Fileread;
import com.ex2.Factorial;
import com.ex2.NewClass1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/*import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;*/
import org.junit.Test;

public class Studenttest {
	private static NewClass1 clas;
	private static Factorial fact;
	 @Test
	public void testStudent() {
		String[] expect={"81.5","65","98"};
		int[] array={86,65,98,77};
		
		assertArrayEquals(expect,Student.findAvgMinMax(4,array));
		
	}
	//file read 
	 @Test
	    public void testFileUpperCase() {
	        String expect = "HI";
	        assertEquals(expect, Fileread.convertUpper("/home/vetri/Desktop/file.txt"));
	        assertEquals("3.0", Fileread.findLength("/home/vetri/Desktop/file.txt"));

  }@Test
	 public void testDisplayExt() {
//       String text1= "Hi hello";
     assertEquals("hi",clas.query("/home/vetri/Desktop/"));
 }
  @Test
  public void testFact() {


      assertEquals("hdafadaidha", 479001600, fact.printIntFactorials(1, 1));
      assertEquals("hdafadaidha", 2432902008176640000L, fact.printLongFactorials(1, 1));
  }
}


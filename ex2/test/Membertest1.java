package com.ex2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.ex2.MemberVariable;
class Membertest1 {
private static MemberVariable mem;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
			  assertArrayEquals(new String[]{"Members name:Harry Potter","member salary:2500.3","member age:30"},mem.displayMemberVariables(new String[]{"Members name:","member salary:","member age:"}));
	 }


	}



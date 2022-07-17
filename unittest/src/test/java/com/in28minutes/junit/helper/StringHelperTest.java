package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper help = new StringHelper();


	@Test
	public void test() {
		String actual =  help.truncateAInFirst2Positions("AACD");
		String exp = "CD";
		assertEquals(exp,actual ); //(Expected, Actual)
	}
	@Test
	public void test2() {
//		StringHelper help = new StringHelper();
		assertEquals(true, help.areFirstAndLastTwoCharactersTheSame("AB"));
	}

	@Test
	public void test3() {
//		StringHelper help = new StringHelper();
		assertEquals("CD",help.truncateAInFirst2Positions("ACD") );
	}
}

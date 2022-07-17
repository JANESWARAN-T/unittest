package com.in28minutes.junit.helper;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAFterfunc {

	StringHelper help;

	@Before
	public void func() {
		help = new StringHelper();
		System.out.println("Before fucntions");
	}

	@After
	public void func2() {
		System.out.println("After func2");
	}

	@Test
	public void test2() {

		assertEquals(true, help.areFirstAndLastTwoCharactersTheSame("AB"));
		System.out.println("Condition passed");
	}
	
	@Test
	public void testarray() {
		int[] num = { 1, 10, 6, 5 };
		int[] exp = { 1, 5, 6, 10 };
		Arrays.sort(num);
		assertArrayEquals(exp, num);

	}
	
	@Test(expected=NullPointerException.class)
	public void testarraynull() {
		int[] num = null;
		Arrays.sort(num);
	}
	
	@Test(timeout=100)
	public void testarray_performance() {
		int[] num = { 1, 10, 6, 5 };
		for(int i=1; i<=1000000; i++) {
			num[0]=i;
			Arrays.sort(num);
		}
		

	}

}

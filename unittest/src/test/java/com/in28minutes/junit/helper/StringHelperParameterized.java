package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterized {

	StringHelper help = new StringHelper();
	
	private String input;
	private String expectedOutputs;
	
	public StringHelperParameterized(String input, String expectedOutputs) {
		this.input = input;
		this.expectedOutputs = expectedOutputs;
	}

	@Parameters
	public static Collection<String[]> testcond(){
		
		String expectedOutputs[][] = {{"AACD" , "CD"},
				{"ACD", "CD"}
		};
		return Arrays.asList(expectedOutputs);
	}


	@Test
	public void test3() {
//		StringHelper help = new StringHelper();
		assertEquals(expectedOutputs,help.truncateAInFirst2Positions(input) );
	}

	
}

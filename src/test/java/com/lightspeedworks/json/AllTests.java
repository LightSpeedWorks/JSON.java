package com.lightspeedworks.json;

import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * デフォルト・パッケージのTestSuite
 */
public class AllTests {

	public static void main(String[] args) {
		//TestRunner.run(JSONTest.class);
		TestRunner.run(suite());
	}

	public static TestSuite suite() {
		TestSuite suite = new TestSuite("Test for default package");
		suite.addTest(new TestSuite(JSONTest.class));
		return suite;
	}
}

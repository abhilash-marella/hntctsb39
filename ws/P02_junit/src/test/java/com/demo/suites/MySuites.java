package com.demo.suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import com.demo.test.T01_DemoTest;
import com.demo.test.T02_GreetTest;

@Suite
//@SelectClasses({T01_DemoTest.class, T02_GreetTest.class})
@SelectPackages({"com.demo.test"})
public class MySuites {

}

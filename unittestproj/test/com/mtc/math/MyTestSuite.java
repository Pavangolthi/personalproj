package com.mtc.math;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ArithmeticTest.class,RectangleTest.class})
public class MyTestSuite {

}

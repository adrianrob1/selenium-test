package org.ispw.selenium_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleJUnitTest extends JUnitTestBase {

  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    String expected = "";
    String result = "";
    assertEquals(expected, result);
  }
}

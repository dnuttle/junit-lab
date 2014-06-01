package net.nuttle.junit;

import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.core.IsAnything.anything;
import static org.junit.Assert.assertThat;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

  @BeforeClass
  public static void setUp() throws Exception {
  }

  @AfterClass
  public static void tearDown() throws Exception {
  }

  @Test
  public void testGetInt() {
    assertThat("sss", anything());
    assertThat("sss", any(String.class));
  }

}

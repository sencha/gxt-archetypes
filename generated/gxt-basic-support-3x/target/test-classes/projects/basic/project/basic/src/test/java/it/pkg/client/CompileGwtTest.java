package it.pkg.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "it.pkg.AppModTest";
  }

  public void testSandbox() {
    assertTrue(true);
  }
}

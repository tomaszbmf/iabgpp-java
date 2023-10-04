package com.mobilefuse.sdk.iab.gpp.encoder.datatype;

import com.mobilefuse.sdk.iab.gpp.encoder.datatype.EncodableFixedInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class EncodableFixedIntegerTest {

  @Test
  public void testSubstring1() {
    Assertions.assertEquals("000", new EncodableFixedInteger(3).substring("10001", 1));
  }

  @Test
  public void testSubstring2() {
    Assertions.assertEquals("111", new EncodableFixedInteger(3).substring("01110", 1));
  }

}
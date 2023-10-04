package com.mobilefuse.sdk.iab.gpp.encoder.datatype;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import com.mobilefuse.sdk.iab.gpp.encoder.datatype.EncodableFibonacciInteger;
import com.mobilefuse.sdk.iab.gpp.encoder.error.DecodingException;

public class EncodableFibonacciIntegerTest {

  @Test
  public void testSubstring1() throws DecodingException {
    Assertions.assertEquals("0011", new EncodableFibonacciInteger().substring("100111", 1));
  }

}

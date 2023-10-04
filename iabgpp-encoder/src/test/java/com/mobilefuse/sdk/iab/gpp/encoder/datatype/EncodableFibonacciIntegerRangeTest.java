package com.mobilefuse.sdk.iab.gpp.encoder.datatype;

import com.mobilefuse.sdk.iab.gpp.encoder.datatype.EncodableFibonacciIntegerRange;
import com.mobilefuse.sdk.iab.gpp.encoder.error.DecodingException;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class EncodableFibonacciIntegerRangeTest {

  @Test
  public void testSubstring1() throws DecodingException {
    Assertions.assertEquals("0000000000100001110110011",
        new EncodableFibonacciIntegerRange().substring("100000000001000011101100110", 1));
  }
}

package com.mobilefuse.sdk.iab.gpp.encoder.datatype;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import com.mobilefuse.sdk.iab.gpp.encoder.datatype.EncodableDatetime;
import com.mobilefuse.sdk.iab.gpp.encoder.error.DecodingException;

public class EncodableDatetimeTest {

  @Test
  public void testSubstring1() throws DecodingException {
    Assertions.assertEquals("000000000000000000000000000000000000",
        new EncodableDatetime().substring("10000000000000000000000000000000000001", 1));
  }

  @Test
  public void testSubstring2() throws DecodingException {
    Assertions.assertEquals("111111111111111111111111111111111111",
        new EncodableDatetime().substring("01111111111111111111111111111111111110", 1));
  }

}

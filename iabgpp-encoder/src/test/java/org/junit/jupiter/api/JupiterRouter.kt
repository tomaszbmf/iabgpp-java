package org.junit.jupiter.api

import org.junit.Assert

object Assertions {

    @JvmStatic
    fun assertEquals(expected: Any, actual: Any) = Assert.assertEquals(expected, actual)

    @JvmStatic
    fun fail(msg: String) = Assert.fail(msg)
}
package stringcalculator

import org.junit.Assert.assertEquals
import org.junit.Test

class SampleTest {

    @Test
    fun `string calculator with an empty string`() {
        assertEquals(0, StringCalculator().add(""))
    }

    @Test
    fun `string calculator with one number`() {
        val result = StringCalculator().add("1")

        assertEquals(1, result)
    }

    
}
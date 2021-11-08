import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class SomaTest
{
    val soma = Soma()

    @Test
    fun sumNumTest()
    {
        assertEquals(6, soma.sumNum(5, 1))
    }

    @Test
    fun verificarNumNegativo()
    {
        assertNotEquals(false, soma.verificarNumNegativo(-2))
    }

}
import org.junit.Test
import kotlin.test.assertEquals

internal class CalculadoraTest {

    var calculadora = Calculadora()

    @Test

    fun somaTest() {

        assertEquals(10, calculadora.soma(5,5))

    }

    @Test
    fun subtracaoTest() {

        assertEquals(10, calculadora.subtracao(20,10))

    }

    @Test
    fun divisaoTest() {

        assertEquals(10.0, calculadora.divisao(100.0,10.0))

    }

    @Test
    fun multiplicacaoTest() {

        assertEquals(25.0, calculadora.multiplicacao(5.0,5.0))

    }

    @Test
    fun potenciaTest()
    {
        assertEquals(100.0, calculadora.potencia(10.0, 2.0))
    }

    @Test
    fun raizQuadTest()
    {
        assertEquals(5.0, calculadora.raizQuad(25.0))
    }
}
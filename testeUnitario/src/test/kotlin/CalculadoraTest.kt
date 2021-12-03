import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    var calculadora = Calculadora()

    @Test
    fun soma()
    {

        assertEquals(6, calculadora.soma(3,3))

    }

    @Test
    fun subtracao()
    {

        assertEquals(4, calculadora.subtracao(8,4))

    }

    @Test
    fun multiplicacao()
    {

        assertEquals(10, calculadora.multiplicacao(5,2))

    }

    @Test
    fun divisao() {

        assertEquals(2, calculadora.divisao(4,2))

    }
}
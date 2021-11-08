
import kotlin.math.pow

class Calculadora {

    fun soma (num1: Int, num2: Int): Int
    {
        return num1 + num2
    }

    fun subtracao (num1: Int, num2: Int): Int
    {
        return num1 - num2
    }

    fun divisao (num1: Double, num2: Double): Double
    {
        return num1 / num2
    }

    fun multiplicacao (num1: Double, num2: Double): Double
    {
        return num1 * num2
    }

    fun potencia (num1: Double, num2: Double): Double
    {
        var potenciaResult = num1.pow(num2)
        println(potenciaResult)
        return  potenciaResult
    }

    fun raizQuad (num1: Double): Double
    {
        var raizQuadResult = Math.sqrt(num1)
        println(raizQuadResult)
        return raizQuadResult
    }

}
import kotlin.math.pow

fun main(args: Array<String>) {

    var somar: Double
    var subr: Double
    var multr: Double
    var divir: Double
    var potres: Double


    somar = soma(10.0 , 20.0)
    println("O resultado da soma é de $somar")

    subr = sub(50.0, 60.0)
    println("O resultado da subtração é de $subr")

    multr = mult(30.0 , 30.0)
    println("O resultado da Multiplicação é $multr")

    divir = divi(50.0, 70.0)
    println("O resultado da divisão é $divir")

    potres = pot(5.0, 2.0)
    println("O resultado da potencia é $potres")


}

fun soma(num1: Double, num2: Double) = num1 + num2

fun sub(num1: Double, num2: Double) = num1 - num2

fun mult(num1: Double, num2: Double) = num1 * num2

fun divi(num1: Double, num2: Double) = num1 / num2

fun pot(num1: Double, num2: Double): Double
{
    return num1.pow(num2)
}

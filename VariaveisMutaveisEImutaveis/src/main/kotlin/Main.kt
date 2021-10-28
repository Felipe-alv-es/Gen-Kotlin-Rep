import kotlin.math.pow

fun main(args: Array<String>) {

    /*
    var nome: String
    var idade: Int
    var curso: String

    println("Informe seu nome: ")
    nome = readLine()!!

    println("Informe sua idade: ")
    idade = readLine()!!.toInt()

    println("Informe seu curso: ")
    curso = readLine()!!

    cad(nome, idade, curso)
     */

    println(posNeg(-5))

    var num: Double = 2.3333333

    Math.round(num)

    println(Math.round(num))
}

fun cad(nome: String, idade: Int, curso: String)
{
    println("Cadastro Efetuado")
    println("Nome: $nome")
    println("idade: $idade")
    println("Curso: $curso")
}

fun nome (): String
{
    return "Olá mundo"
}

fun posNeg(num : Int): String
{
    if (num < 0)
    {
        return "Número é negativo"
    }
    else
    {
        return "Número é positivo"
    }
}

fun subtra (num1: Int, num2:Int) = num1 - num2
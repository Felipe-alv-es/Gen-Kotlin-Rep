package `interface`

interface Funcionarios{

    var nome: String

    fun calcularSalario()

    var salario: Double

    fun mostrarSalario()
    {
        println("Salario $salario")
    }

}

interface Pessoa{

    fun andar()

}

class Tecnico(override var nome: String, var bonus: Double) : Funcionarios, Pessoa
{
    override var salario: Double = 1500.0

    override fun calcularSalario() {
        println(bonus + salario)
    }

    override fun andar() {

    }

}

fun main() {



}
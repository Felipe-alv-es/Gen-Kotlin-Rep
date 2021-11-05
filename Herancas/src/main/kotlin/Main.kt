/*
open class Maquina(var nome: String, var numPeças: Int, var numFios: Int)
{
    var parafusos = 10

    open fun ligar(){
        println("Ligado")
    }

    fun desligar(){
        println("Desligado")
    }
}

class Computador(nome: String, numPeças: Int, numFios: Int,var nubleos: Int): Maquina(nome, numPeças, numFios){

    fun mostrarN(){
        println("Tenho nucleos")
    }

    override fun ligar()
    {
        println("Ligadasso")
    }

    fun soma (n1: Int, n2: Int)
    {
        println(n1 + n2)
    }

    fun soma (n1: Double, n2: Double)
    {
        println(n1 + n2)
    }
}
*/

abstract class Maquina(var nome: String, var numPeças: Int, var numFios: Int)
{
    var parafusos = 10

    abstract fun ligar()

    abstract fun desligar()

}

class Computador(nome: String, numPeças: Int, numFios: Int,var nubleos: Int): Maquina(nome, numPeças, numFios){

    fun mostrarN(){
        println("Tenho nucleos")
    }

    override fun ligar()
    {
        println("Ligadasso")
    }

    override fun desligar()
    {
        println("Ligadasso")
    }

    fun soma (n1: Int, n2: Int)
    {
        println(n1 + n2)
    }

    fun soma (n1: Double, n2: Double)
    {
        println(n1 + n2)
    }
}

class CameraFoto(nome: String, numPeças: Int, numFios: Int,var nubleos: Int): Maquina(nome, numPeças, numFios){

    override fun ligar()
    {
        println("Ligadasso igual camera")
    }

    override fun desligar()
    {
        println("Desligadasso igual ameracasastasc")
    }
}

fun main(args: Array<String>) {


  //  val maquina = Maquina("Generica", 50, 100)

  //  maquina.ligar()
  //  maquina.desligar()

    val computador = Computador("Samsung", 20, 50, 5)

    computador.ligar()
    computador.desligar()
    computador.parafusos = 30

}
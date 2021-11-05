import bd.Banco
import seres.Animais
import seres.Pessoas

fun main(args: Array<String>) {
    /*
    var leao = Animais()

    leao.nome = "Lele"
    leao.especie = "leaozao"

    var felipe = Pessoas()

    felipe.idade = 22
    felipe.nome = "Felipe"

    try {
        var num = "teste".toInt()
        }
    catch (e: Exception)
        {
            println("Deu errado")
        }
     */

    val banco = Banco()

    try {
        banco.conexao("Felipe","GeekGamer459")
        banco.consulta("")
    }catch (e: Exception){
        println(e.message)
    }

}
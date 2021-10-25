fun main(args: Array<String>) {

    //variaveis
    var nome: String
    var idade: Int
    var preferencia: String
    var nacionalidade: String
    var tipoSang: String
    var nascim: Int
    //variaveis

    println("Informe seu Nome: ")
    nome = readLine()!!

    println("Informe sua Idade: ")
    idade = readLine()!!.toInt()

    println("Informe sua Preferencia de emprego: ")
    preferencia = readLine()!!

    println("Informe sua Nacionalidade: ")
    nacionalidade = readLine()!!

    println("Informe seu tipo Sanguineo: ")
    tipoSang = readLine()!!

    nascim = 2021 - idade

    println("Seu nome é $nome")
    println("Você tem $idade anos")
    println("Você possui a preferencia de emprego $preferencia")
    println("Sua nacionalidade é $nacionalidade")
    println("Seu tipo sanguineo é $tipoSang")
    println("O seu ano de nascimento foi $nascim")

}
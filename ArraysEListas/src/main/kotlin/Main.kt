fun main(args: Array<String>) {

    /*
    val nomes = arrayOf("Henrique", "Genivaldo", "Rogério")

    for (item in nomes)
    {
        println(item)
    }
    */
    /*
    val itens = Array(10){1}

    for (i in 0..9)
    {
        println("Digite o valor $i: ")
        itens[i] = readLine()!!.toInt()
    }

    for (i in itens)
    {
        println(i)
    }
     */
    /*
    //val nomes = listOf("Henrique", "Genivaldo", "Rogério")
    val nomes = mutableListOf("Henrique", "Genivaldo", "Rogério")

    nomes.add("Josnei")
    */
    /*
    val pessoas = mutableListOf<String>()

    pessoas.add("Felipe")
    pessoas.add("Felipe")
    pessoas.add("Felipe")
    pessoas.add("Cremilson")
    */
    /*
    println(pessoas.isEmpty())
    println(pessoas.size)
    println(pessoas.first())
    println(pessoas.last())
    println(pessoas.slice(0..1))
    pessoas.remove("Cremilson")
    pessoas.sort()
    */
    /*
    println("Remova uma pessoa: ")
    val name = readLine()!!

    if (pessoas.contains(name))
    {
        pessoas.remove(name)
        println("Usuário removido")
    }
    else
    {
        println("$name não existe")
    }
    */
    /*
    val nomes = mutableSetOf("Henrique", "Genivaldo", "Rogério", "Henrique")

    println(nomes)

     */

    val usuarios = mutableMapOf(
        1 to "Henrique",
        2 to "Pri",
        3 to "Gen"
    )

    usuarios.put(4, "Jos")
    /*
    for (i in 1..3)
    {
        println("Informe o ID")
        val id = readLine()!!.toInt()
        println("Informe o nome")
        val nome = readLine()!!

        usuarios.put(id, nome)
    }
    */

    println("Informe a chave")
    val valor = readLine()!!.toInt()

    if (usuarios.contains(valor))
    {
        usuarios.remove(valor)
    }
    else
    {
        println("Não existe essa chave")
    }

    println(usuarios)



}
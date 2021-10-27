fun main(args: Array<String>) {

    var num: Int

    println("Por favor, informe o numero de 1 a 10 que deseja calcular: ")
    num = readLine()!!.toInt()

    for(i in 10 downTo 1)
        {
            println("$i X $num = ${ i * num }")
        }

}
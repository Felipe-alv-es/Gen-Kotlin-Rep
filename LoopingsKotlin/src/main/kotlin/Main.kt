fun main(args: Array<String>) {

    /*
    var numW: Int

    println("Informe um numero")
    numW = readLine()!!.toInt()

    while(numW > 0)
        {
            println("Por favor, informe um numero abaixo de zero")
            numW = readLine()!!.toInt()
        }
     */
    /*
    var num: Int = 0
    var soma: Int = 0

    println("Informe um numero para ser somado")
    num = readLine()!!.toInt()
    soma += num

    while(num != 0)
        {
            println("Informe um numero para ser somado")
            num = readLine()!!.toInt()
            soma += num
        }

    println("O resultado da soma é $soma")

     */
    /*
    var soma = 0
    var cont = 0
    var num = 0

    println("Digite um número para fazermos a soma de 1 até ele: ")
    num = readLine()!!.toInt()

    do {

        soma += cont
        cont++

        }
        while(cont <= num)

        println(soma)

     */
    /*
    for (aux in 10 downTo 1 step 2)
    {
        println("$aux - Felipe")
    }
     */
    /*
    var arrayNum = arrayOf(1, 2, 3, 4, 5)

    println(arrayNum[2])

    arrayNum[2] = 20

    println(arrayNum[2])

    println(arrayNum.size)

    for(item in arrayNum)
        {
            println(item)
        }

     */

    var num: Int

    println("Digite um valor para calcularmos a tabuada")
    num = readLine()!!.toInt()

    for(i in 1..10)
        {

            println("$num X $i = ${ num * i }")

        }


}
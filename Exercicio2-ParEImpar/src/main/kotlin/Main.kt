fun main(args: Array<String>) {

    var num: Int
    var cont: Int = 0
    var impar: Int = 0
    var par: Int = 0

    println("Por favor, informe 10 numeros para serem verificados: ")

    for (i in 1..10)
        {
            println("Informe outro numero por gentileza")
            num = readLine()!!.toInt()

            if(num % 2 != 0)
            {
                impar++
            }
            else
            {
                par++
            }
        }

    println("Dos numeros informados $impar são impares e $par são pares")

}
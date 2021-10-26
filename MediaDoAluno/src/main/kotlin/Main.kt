fun main(args: Array<String>) {

    var media1: Double
    var media2: Double
    var media3: Double
    var media4: Double
    var mediaT: Double

    println("Por favor, informe a sua nota do primeiro bimestre")
    media1 = readLine()!!.toDouble()

    println("Por favor, informe a sua nota do segundo bimestre")
    media2 = readLine()!!.toDouble()

    println("Por favor, informe a sua nota do terceiro bimestre")
    media3 = readLine()!!.toDouble()

    println("Por favor, informe a sua nota do quarto bimestre")
    media4 = readLine()!!.toDouble()

    mediaT = (media1 + media2 + media3 + media4) / 4

    if (mediaT < 4)
        {
            println("Sua media está abaixo de 4, dessa forma, está reprovado!")
        }
    else if (mediaT >= 4 && mediaT <= 5)
        {
            println("Você está regular")
        }
    else if (mediaT > 5 && mediaT <= 8)
        {
            println("Você teve um desempenho Excelente")
        }
    else if (mediaT > 8 && mediaT <= 10)
        {
            println("Excepcional, otimo!")
        }
    else
        {
            println("Algum numero foi digitado invalidamente")
        }
}
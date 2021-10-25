fun main(args: Array<String>) {

    var diam: Int
    var pi: Double = 3.14
    var raio: Double
    var raioQuad: Double
    var area: Double
    var perim: Double

    println("Informe o diametro do circulo: ")
    diam = readLine()!!.toInt()

    //Caculo da area
    raio = diam.toDouble() / 2
    raioQuad = raio * raio
    area = raioQuad * pi

    //Caculo da Perimetro
    perim = 2 * pi * raio

    println("O perímetro do diametro informado é de: $perim")
    println("\nA area do valor informado é de: $area")


}
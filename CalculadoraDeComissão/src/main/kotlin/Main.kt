fun main(args: Array<String>) {

    var faixaVendas: Double

    println("Informe sua faixa de vendas: ")
    faixaVendas = readLine()!!.toDouble()

    if(faixaVendas > 1000 && faixaVendas <= 4999 )
        {
            println("Será recebido de comissão o valor de ${(faixaVendas * 10) / 100}")
        }
    else if(faixaVendas >= 5000 && faixaVendas < 9999)
        {
            println("Será recebido de comissão o valor de ${(faixaVendas * 20) / 100}")
        }
    else if(faixaVendas >= 10000)
        {
            println("Será recebido de comissão o valor de ${(faixaVendas * 30) / 100}")
        }
    else
        {
            println("O valor digitado está abaixo de 1000,00 dessa forma, não há comissão")
        }

}
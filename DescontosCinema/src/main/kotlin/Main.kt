fun main(args: Array<String>) {

    var idade: Int
    var preco: Double = 18.0
    var quant: Int

    println("Por favor, informe sua idade: ")
    idade = readLine()!!.toInt()

    println("Quantos ingressos deseja comprar: ")
    quant = readLine()!!.toInt()

    if(idade <= 5)
        {
            println("Devido a possuir menos de 5 Anos, você terá 60% de desconto no ingresso, ficando no valor de " +
                    " ${ preco - ((preco * 60) / 100)}")
        }
    else if(idade >= 60)
        {
            println("Devido a possuir mais de 60 Anos, você terá 55% de desconto no ingresso, ficando no valor de " +
                    " ${ preco - ((preco * 55) / 100)}")
        }
    else
        {
            if(quant >= 2)
            {
                println("Devido a ter comprado mais de 1 ingresso, você terá o desconto de 30% em cada, ficando " +
                        "${ preco - ((preco * 30) / 100)}")
            }
            else
                {
                    println("O preço ficará 18,00 por ingresso")
                }
        }

}
class SalesManager (primeiroNome: String, idade: Int, anosTrabalhados: Int, diasTrabalhados: Int, diasDeFerias: Int,
                    salario: Double, vendasFeitas: Double, var totalVendas: Double ):
    SalesRep(primeiroNome, idade, anosTrabalhados, diasTrabalhados, diasDeFerias, salario, vendasFeitas )
{

    val vendasTime = HashMap<Int, SalesRep.teste>()
    var comissaoGestor: Double = 0.0

    /*
    fun calcularComissaoGerente()
    {
        comissaoGestor = 0.03 * totalVendas
        println(map)
        return println("O gestor recebera $comissaoGestor de comissão")
    }
    */

    fun calcularComissaoGerente ()
    {
          //vendasTime.put(1, vendasFeitas)
        for (i in 1..10)
        {
            vendasTime.put(i, SalesRep.teste)
            println(vendasTime.size)
            vendasTime.forEach(System.out::println)
        }

    }

}


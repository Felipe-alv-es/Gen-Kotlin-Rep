fun main(args: Array<String>) {

/*
val maria = Pessoa()

maria.nome = "Maria"
maria.idade = 20
maria.corPele = "Parda"
maria.corOlhos = "Castanhos"
*/
/*
    val contaCorrente = ContaBanco()

    contaCorrente.proprie = "Henrique"
    contaCorrente.saldo = 2500.0

    val contaPoupanca = ContaBanco()

    contaPoupanca.proprie = "Henrique"
    contaPoupanca.saldo = 3200.0

    contaPoupanca.saldo()
    contaCorrente.saldo()

    contaCorrente.saque(200.00)
    contaCorrente.saldo()

    println(contaCorrente.proprie)
 */
    /*
    val contaCorrente = ContaBanco("Henrique")

    println(contaCorrente.proprietario)

     */

    ListaContas.addContas(contaCorrente1)

    for(item in ListaContas.listaContas)
    {
        println(item.proprietario)
    }

}

object ListaContas
{
    val listaContas = mutableListOf<ContaBanco>()

    fun addContas(contas: ContaBanco)
    {
        listaContas.add(contas)
    }

    val maria = Pessoa.create("Maria", 22, 1.75)

}



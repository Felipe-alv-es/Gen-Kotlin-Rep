data class ContaBanco (val proprietario: String)
{

    var tipo = 0

    constructor(proprietario: String, tipo: Int):
            this(proprietario){
                this.tipo
            }

    /*
    var saldo = 0.0
    var proprie = ""
        get() = field.uppercase()
    var tipo = 1
        set(value) = if (value <= 0)
        {
            println("Valor invalido")
            field = 1
        }else
        {
            field = value
        }

    fun saldo()
    {
        println("O saldo da conta é $saldo")
    }

    fun saque(valor: Double)
    {
        if (valor <= 0)
        {
            println("Valor impossível de ser sacado")
        }else
        {
            saldo -= valor
            println("Saque de $valor realizado com sucesso")
        }
    }

    fun deposito(valor: Double)
    {
        if (valor <= 0)
        {
            println("Valor impossível de ser depositado")
        }else
        {
            saldo -= valor
            println("Saque de $valor realizado com sucesso")
        }
    }
    */


    override fun toString(): String {
        return "Ah se loco"
    }
}


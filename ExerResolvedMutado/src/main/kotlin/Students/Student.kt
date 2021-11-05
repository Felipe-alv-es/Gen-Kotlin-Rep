package Students

data class Student (private var nome: String?, private var sobrenome: String?, private var ra: Int) {

    private var nota = 0.0
    private var ano = 0

    constructor(nome: String?, sobrenome: String?, ra: Int, nota: Double): this(nome, sobrenome, ra)
                {
                    this.nota = nota
                }

    constructor(nome: String?, sobrenome: String?, ra: Int, nota: Double, ano: Int):
            this(nome, sobrenome, ra, nota)
                {
                     this.ano = ano
                }

    fun nomeCompleto()
    {
        println("$nome $sobrenome")
    }

    private val aprovado: Boolean
        get()
        {
            return nota >= 60
        }

    fun mudarAnoSeAprovado(): Int
    {
        if (aprovado)
        {
            ano += 1
            println("Parabéns, você foi aprovado!")
        }
        else
        {
            println("Você foi reprovado")
        }
        return 0
    }

    fun exiNotas(): Double {
        var exibirNotas = nota
        return exibirNotas
    }

}
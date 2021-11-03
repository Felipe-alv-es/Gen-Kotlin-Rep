class Student (val primeiroNome: String, val ultimoNome: String, val registro: Int) {

    var grade: Int = 0
    var year: Int = 0

    var isAproved: Boolean = false
        get()
        {
            if(grade >= 60)
            {
                return true
            }
            else
            {
                return false
            }
        }


    constructor (primeiroNome: String, ultimoNome: String, registro: Int, grade: Int, year: Int):
        this(primeiroNome, ultimoNome, registro)
        {
            this.grade
        }

    constructor (primeiroNome: String, ultimoNome: String, registro: Int, grade: Int):
        this(primeiroNome, ultimoNome, registro)
        {
            this.year
        }

    fun escreverNome ()
    {
        println("O nome do estudante cadastrado é $primeiroNome $ultimoNome")
    }

    fun testeMedia()
    {
        if (isAproved == true)
        {
            return println("Ta tudo certo")
        }
        else
        {
            return println("Não ta td certo")
        }
    }

}
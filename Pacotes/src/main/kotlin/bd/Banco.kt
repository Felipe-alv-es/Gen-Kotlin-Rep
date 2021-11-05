package bd

class Banco {

    fun conexao (usuario: String, senha: String)
    {
        if (senha == "GeekGamer459")
        {
            println("Conexão com BD feita com sucesso")
        }
        else
        {
            throw Exception("A senha está incorreta")
        }
    }

    fun consulta(queryDb: String)
    {
        if (queryDb != "")
        {
            println("Consulta realizada com sucesso")
        }
        else
        {
            throw Exception("A query não pode ser vazia")
        }
    }

}
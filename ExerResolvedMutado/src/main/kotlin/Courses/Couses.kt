package Courses

import Students.Student

data class Couses (private val nomeCurso: String?, private var nomeProfessor: String?, private var ano: Int){

    private val listaEstudantes = mutableListOf<Student?>()

    fun cadastrar(student: Student?)
    {
        listaEstudantes.add(student)
        println("Cadastrado com sucesso")
    }

    fun cadastrar2 (students: Array<Student?>?)
    {
        if (students != null) {
            for (i in students)
            {
                listaEstudantes.add(i)
            }

        }
        println("Estudantes Cadastrados")
    }


    fun removerEstudante (student: Student?)
    {
        if (listaEstudantes.contains(student))
        {
            listaEstudantes.remove(student)
            println("Estudante removido!")
        }
        else
        {
            println("Esse estudante não existe na lista")
        }
    }

    fun contarEstudantes(): Int
    {
        println("O número de estudantes cadastrados no curso é $listaEstudantes.size")
        return 0
    }

    fun maiorNota()
    {
        var melhorNota = listaEstudantes[0]?.exiNotas()

        for (i in listaEstudantes)
        {
            if (i?.exiNotas()!! > melhorNota!!)
            {
               melhorNota = i?.exiNotas()
            }
        }
        println("A maior nota desse curso é $melhorNota")
    }

    fun verificarAluno(student: Student){
        if (listaEstudantes.contains(student))
        {
            println("O estudante informado existe na lista, segue os dados: $student")
        }
        else
        {
            throw Exception("Estudante informado não existe na listaaaaaaaaaaaa")
        }
    }

}
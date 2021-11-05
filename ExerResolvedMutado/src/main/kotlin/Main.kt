import Courses.Couses
import Students.Student

fun main(args: Array<String>) {

    var jobesval = Student("Jobesval", "Ramilton", 55115511, 70.0,0)
    var rebeca = Student("Rebeca","Silva", 55885588, 90.0, 1)
    var Henrique = Student("Rebeca","Silva", 55885588, 80.0, 1)
    var Leticio = Student("Leticio","Bananal", 224002, 70.0, 1)

    jobesval.nomeCompleto()
    jobesval.mudarAnoSeAprovado()

    val cursoIngles = Couses("Ingles", "Geni", 1)

    cursoIngles.cadastrar(rebeca)
    cursoIngles.cadastrar(Henrique)
    cursoIngles.cadastrar(jobesval)

    cursoIngles.contarEstudantes()

    cursoIngles.removerEstudante(jobesval)

    val estudantes: Array<Student?> = arrayOf(Henrique, rebeca)

    cursoIngles.cadastrar2(estudantes)

    cursoIngles.contarEstudantes()

    cursoIngles.maiorNota()

    try {
        cursoIngles.verificarAluno(Leticio)
    }catch (e: Exception){
        println(e.message)
    }

}
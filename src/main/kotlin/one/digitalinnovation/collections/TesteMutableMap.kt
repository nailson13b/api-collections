package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("Joao", 2000.00,"CLT")
    val pedro = Funcionario("Pedro", 1500.00, "PJ")
    val maria = Funcionario("Maria", 4000.00, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("---------------------")
    repositorio.findAll().forEach{
        println(it)
    }

    println("---------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{
        println(it)
    }
}
package one.digitalinnovation

class Pessoa {
    var nome: String = "Diogenes"
    var cpf: String = "123.456.789-01"
    private set

    constructor()
                    //   inner class Endereco { //usar em ocasião especial
                   //        var rua: String = "Rua Direita"
                  //   }
    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val Diogenes = Pessoa()

    println(Diogenes.pessoaInfo())


             // println(Diogenes.Endereco().rua)
}
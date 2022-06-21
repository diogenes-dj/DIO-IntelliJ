package one.digitalinnovation

class Pessoa {
    var nome: String = "Diogenes"
    var cpf: String = "123.456.789-01"

 //   inner class Endereco { //usar em ocasião especial
//        var rua: String = "Rua Direita"
 //   }
}

fun main() {
    val Diogenes = Pessoa()

    println(Diogenes.nome)
    println(Diogenes.cpf)

    println(Diogenes.Endereco().rua)
}
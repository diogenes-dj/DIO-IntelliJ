package one.digitalinnovation.testes

import one.digitalinnovation.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12) //para não alterar ou fazer copy se quiser alterar

    println(digiOneBank.nome)
    println(digiOneBank.numero)


}
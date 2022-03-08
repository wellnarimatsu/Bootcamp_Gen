fun main() {

    val dog = Cachorro("dog", 5)
    val manhoso = Cavalo("manhoso", 12)
    val sloth = Preguica("sloth", 7)


    println("${dog.nome}")
    println("${dog.idade}")
    dog.correr()
    dog.emitirSom()

    println("\n${manhoso.nome}")
    println("${manhoso.idade}")
    manhoso.emitirSom()
    manhoso.correr()

    println("\n${sloth.nome}")
    println("${sloth.idade}")
    sloth.emitirSom()
    sloth.subirEmArvores()


}
class Cachorro(nome: String, idade: Int): Animal(nome,idade) {

    override fun emitirSom() {
         println("au au au")
    }

    fun correr(){
        println("correndo")
    }
}
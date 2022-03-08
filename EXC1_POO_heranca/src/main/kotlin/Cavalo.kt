class Cavalo(nome : String, idade : Int): Animal(nome, idade ) {

    override fun emitirSom() {
        println("hinhihihi")
    }

    fun correr(){
        println("Correndo")
    }
}
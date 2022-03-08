open class Animal(val nome: String, var idade: Int) {

    open fun emitirSom(){
        println("Emitindo som")
    }

    fun corre(){
        println("Correndooo")
    }

}
class Preguica(nome:String, idade: Int): Animal(nome, idade) {

    override fun emitirSom() {
         println("Ai que preguicinha")
    }

     fun subirEmArvores(){
        println("Subindo")
    }
}
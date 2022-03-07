package encapsulamento

class Cliente (private val nome : String){

   private  var endereco = ""
   private var telefone = ""

   private var listaDeCompras = mutableListOf<String>()

    constructor(nome:String, endereco : String) : this(nome){
        this.endereco = endereco

    }
    constructor(nome:String, endereco: String, telefone:String
    ) : this(nome, endereco){
        this.telefone = telefone
    }


    init {
        if (nome.isEmpty()){
            throw Exception("A classe cliente não foi instanciada corretamente")
        }
    }


    fun addCompra(valor : String){
        if (valor.isEmpty()){
            println("Valor inválido")
        }else {
            listaDeCompras.add(valor)
        }
    }

    fun removeCompra(valor : String){
        if (valor.isEmpty()){
            println("Valor inválido")
        }else if (listaDeCompras.contains(valor)){
            listaDeCompras.remove(valor)
            println("O item $valor foi removido com sucesso!")
        }else{
            println("o item $valor não existe")
        }
    }

    fun listarCompras(){
        println("Lista do cliente $nome")
        listaDeCompras.forEach{
            println(it)
        }
    }
}

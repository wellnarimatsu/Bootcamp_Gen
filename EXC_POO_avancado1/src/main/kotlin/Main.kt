import encapsulamento.Cliente

fun main() {
    /*
    Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos
    mais duas opções de construtores conforme sua percepção, com os atributos: nome (String),
    endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
    A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
     */



    try {
        val wellison = Cliente(
            "Wellison",
            "Rua: Oito ",
            "40028922")
        var opc =0
        while(true){

            println("1 - Adicionar  item na lista")
            println("2 - remover itens da lista")
            println("3 - listar todos itens")
            println("4 - para sair")

            println("Digite a opção desejada")
            opc = readLine()!!.toInt()
        }

        when(opc){
            1 -> println

        }
    }catch (e : Exception){
        println(e.message)
    }


}
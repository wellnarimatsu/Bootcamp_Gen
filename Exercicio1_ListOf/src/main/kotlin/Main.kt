fun main(){

    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.
     */
    val produtosLoja = mutableListOf<String>()
    println("Produtos do nosso estoque")
    produtosLoja.add("feijão")
    produtosLoja.add("arroz")
    produtosLoja.add("sal")
    produtosLoja.add("açucar")
    produtosLoja.add("água")

    println(produtosLoja)

    while (true){

        print("\nDeseja adicionar algum produto na loja?: ")
        val nomeproduto = readLine()!!

        if(nomeproduto.isEmpty()){
            break
        }else{
            produtosLoja.add(nomeproduto)
        }
    }
    while (true){

        print("\nDeseja remover algum produto da lista: ")
        val nomeproduto = readLine()!!

        if(produtosLoja.contains(nomeproduto)){
            produtosLoja.remove(nomeproduto)
            println("\nProduto $nomeproduto removido")
            break
        }else{
            println("\nO produto $nomeproduto não existe na lista")
        }
    }

    println("\nOs Produtos atuais do nosso estoque são: $produtosLoja")


}
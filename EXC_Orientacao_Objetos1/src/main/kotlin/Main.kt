fun main() {
    /*
    6) Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe,
    em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente as
    informações deste objeto no console.

    */

    val conta = ContaBanco()
    conta.titular = "wellison"

    conta.saldo = 5000.0

    conta.mostrarSaldo()



    while (true) {

        println("\n***Escolha a opção abaixo***\n")

        println("1 - Saque")
        println("2 - Depósito")
        println("3 - SAIR")

        val opc = readLine()!!.toInt()


        when (opc) {
            1 -> {
                println("Digite o valor de saque: ")
                val saque = readLine()!!.toDouble()
                println("Saque efetuado!")
                conta.saque(saque)
                conta.mostrarSaldo()
            }
            2 -> {
                println("Digite o valor do depósito: ")
                val valor = readLine()!!.toDouble()
                println("Depósito efetuado!")
                conta.deposito(valor)
                conta.mostrarSaldo()
            }
            3 -> break

        }

    }
}
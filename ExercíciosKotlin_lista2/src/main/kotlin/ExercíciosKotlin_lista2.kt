fun main(args: Array<String>) {


        /*
        /*
        EXERCICIO 1 KOTLIN LISTA 2 -Informar todos os números de 1000 a 1999 que quando divididos por 11
         obtemos resto = 5. (FOR)*/



        for (i in 1000..1999 ){


            if(i % 11 == 5){
                println("$i")
            }

        }
    */

        /*
        /*
        EXERCICIO 3 -Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
         Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
        */


        var idade = 0
        var under = 0
        var over = 0

        while(idade != -99) {
            print("Digite a sua idade: ")
            idade = readLine()!!.toInt()

         if(idade<21 && idade!= -99 ){
               under++++



        }else if(idade>50){
            over++

            }
          println("Total das idade abaixo de 21 anos são: $under")
          println("O total das idade acima de 50 é: $over")

        }
          */

        /*
        /*
        EXERCICIO 5 KOTLIN - LISTA 2 Crie um programa que leia um número do teclado até que encontre um número
        igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
        */


        var soma = 0
        var num = 0

        do{
            print("Digite um número: ")
            num = readLine()!!.toInt()

            if (num!= 0){
                soma = soma + num

            }


        } while (num != 0)

        println("A soma dos número digitados são: $soma")

         */





}
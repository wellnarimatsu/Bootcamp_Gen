fun main() {

     /*
    4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe,
    em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as
    informações deste objeto no console.

      */

    var funcionario1 = Funcionario()

    funcionario1.nome = "wellison"
    funcionario1.cargo = "Dev junior"
    funcionario1.turno = "Diurno"
    funcionario1.salario = 5000.0
    funcionario1.bonificacao = "20%"
    funcionario1.salarioTotal = (5000.0+(5000.0*0.2))


   println("Nome - ${funcionario1.nome}")
   println("Cargo - ${funcionario1.cargo}")
   println("Turno - ${funcionario1.turno}")
   println("Salário - ${funcionario1.salario}")
   println("bonificação - ${funcionario1.bonificacao} ")
   println("Salário + Bonificação - ${funcionario1.salarioTotal} ")



}
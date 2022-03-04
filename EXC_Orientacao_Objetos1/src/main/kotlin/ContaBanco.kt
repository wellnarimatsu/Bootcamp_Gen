class ContaBanco {

  var titular = ""
  var saldo = 0.0


  fun mostrarSaldo(){
      println("Saldo da sua conta: $saldo")
  }

  fun deposito (valor: Double){
    if(valor <= 0){
      println("Depósito impossível de ser realizado")
    }else{
      saldo += valor
      println("Depósito de R$$valor realizado com sucesso!")
    }
  }

  fun saque (valor: Double){
    if(saldo <= 0){
      println("Saldo insuficiente")
    }else if(valor <= 0){
      println("Saque impossível de ser realizado")
    }else if (valor > saldo){
      println("Saldo insuficiente")
    }else{
      saldo -= valor
      println("Saque de R$$valor Efetuado")
    }
  }


}
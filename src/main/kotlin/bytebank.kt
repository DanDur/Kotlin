fun main() {
    println("Bem vindo ao Bytebank")

    val contaAlex = Conta(titular="Alex", numero= 1000)
    contaAlex.deposita(200.0)


    val contaFran = Conta(numero=1001, titular = "Fran")
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

//    println("depositando na conta do Alex")
//    contaAlex.deposita(50.0)
//    println(contaAlex.saldo)
//
//    println("depositando na conta do Fran")
//    contaFran.deposita(70.0)
//    println(contaFran.saldo)
//
//    println("sacando na conta do Alex")
//    contaAlex.saca(250.0)
//    println(contaAlex.saldo)
//
//    println("sacando na conta da Fran")
//    contaFran.saca(100.0)
//    println(contaFran.saldo)
//
//    println("sacando em excesso na conta do Alex")
//    contaAlex.saca(100.0)
//    println(contaAlex.saldo)
//
//    println("sacando em excesso na conta da Fran")
//    contaFran.saca(500.0)
//    println(contaFran.saldo)

//    println("Transferencia da conta da Fran para o Alex")
//    if (contaFran.transfere(300.0, contaAlex)) {
//        println("Transferencia bem sucedida")
//    } else {
//        println("Falha na transferencia")
//
//    }
//    println(contaAlex.saldo)
//    println(contaFran.saldo)
}

class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        private set
//    constructor(titular:String, numero:Int){
//
//        this.titular = titular
//        this.numero = numero


    //  get (){return field}

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

    /*fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        if (valor > 0) {
            saldo = valor

        }

}*/


    fun testaCopiasEReferencias() {
        val numeroX = 10
        var numeroY = numeroX
        numeroY++

        println("numeroX $numeroX")
        println("numeroY $numeroY")

        val contaJoao = Conta("Jo??o", 1002)
        var contaMaria = Conta("Maria", 1003)

        println("titular conta joao: ${contaJoao.titular}")
        println("titular conta maria: ${contaMaria.titular}")

        println(contaJoao)
        println(contaMaria)
    }

    fun testaLacos() {
        var i = 0
        while (i < 5) {
            val titular: String = "Alex $i"
            val numeroConta: Int = 1000 + i
            var saldo = i + 10.0

//    val titular: String = "Alex"
//    val numeroConta: Int = 1000
//    var saldo = 0.0
//    saldo = 100 + 2.0
//    saldo += 200


            println("titular $titular")
            println("N??mero da conta $numeroConta")
            println("Saldo da conta $saldo")
            println()
            i++

            //    for (i in 5 downTo 1) {
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("n??mero da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//    }
        }
        fun testaCondicoes(saldo: Double) {
            if (saldo > 0.0) {
                println("conta ?? positiva")
            } else if (saldo == 0.0) {
                println("conta ?? neutra")
            } else {
                println("conta ?? negativa")
            }
            when {
                saldo > 0.0 -> println("conta ?? positiva")
                saldo == 0.0 -> println("conta ?? neutra")
                else -> println("conta ?? negativa")
            }
        }
    }
}



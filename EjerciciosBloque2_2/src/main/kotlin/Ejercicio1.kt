fun main(args: Array<String>) {

    println("PROGRAMA SISTEMA BANCARIO")

    var saldo: Int = 0
    var totalSaldo = 0

    do {


        println("1. Ver saldo")
        println("2. Ingresar dinero")
        println("3. Sacar dinero")
        println("4. Salir")
        var numero = readLine()!!.toInt()


        when (numero) {
            1 -> {
                println(totalSaldo)
            }

            2 -> {
                println("Ingresa el dinero:")

                saldo = readLine()!!.toInt()
                if (saldo >= 0)
                    totalSaldo += saldo
                else
                    println("No se pueden valores negativos")
            }

            3 -> {
                println("Introduce el dinero a sacar:")
                saldo = readLine()!!.toInt()
                if ((totalSaldo - saldo) < 0 )
                    println("Quieres sacar una cantidad que no tienes!!!")
                else if (saldo<0)
                    println("No se admiten valores negativos")
                else
                    totalSaldo = totalSaldo - saldo

            }
            4->{
                println("Fin del programa.")
            }
            else->{
                println("Esa opcion no existe")
            }


        }
    } while (numero!=4)
}
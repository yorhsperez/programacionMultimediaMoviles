fun main() {
    println("PROGRAMA GENERA NUMERO ALEATORIO ENTRE 1 Y 10. INTENTA ADIVINARLO")

    var random = (Math.random() * 10 + 1).toInt()
    while (true) {


       // println(random)
        println("Adivina el numero: ")
        var numero = readLine()!!.toInt()

        if (numero == 0)
            break

        if (random == numero) {
            println("ACERTASTE")
            random = (Math.random() * 10 + 1).toInt()
        } else if (numero < 1 || numero > 10) {
            println("Ese no es el rango!! Va a ser el mismo adivinalo")

        } else {
            println("PERDISTE!!")
            random = (Math.random() * 10 + 1).toInt()
        }

    }

}


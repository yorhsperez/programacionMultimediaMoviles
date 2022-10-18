fun main(args:Array<String>){

    do {


    println("Introduce las dimensiones de los lados de un rectangulo:")
    println("Introduce la altura del rectangulo:")
    var largo= readLine()!!.toDouble()
    println("Introduce el ancho del rectangulo:")
    var ancho = readLine()!!.toDouble()

    println("Elige la opcion")
    println("1. Calcular perimetro del rectangulo")
    println("2. Calcular superficie del rectangulo")
    println("3. Calcular la diagonal trazada entre dos vertices del rectangulo")
    println("4. Calcular el area del triangulo formado al trazar esta diagonal")
    println("0. Salir")
    var opcion = readLine()!!.toInt()
    when(opcion){
        1->{
            println("Perimetro: "+(largo*2+ancho*2))
        }
        2->{
            println("Superficie: "+(ancho*largo))

        }
        3->{
            println("Diagonal: "+(Math.sqrt(Math.pow(largo,2.0)+Math.pow(ancho,2.0))))

        }
        4->{
            println("El area : "+((ancho*largo)/2))

        }
        0->{
            println("Terminado")
        }


    }

    }while (opcion!=0)
}
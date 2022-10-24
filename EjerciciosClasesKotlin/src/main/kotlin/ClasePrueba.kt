
fun main(args: Array<String>) {

    println("Introduce el nombre: ")
    val nombre = readLine()!!
    println("Introduce la edad: ")
    val edad = readLine()!!.toInt()
    println("Introduce el sexo: ")
    val sexo = readLine()!!.toCharArray()[0]
    println("Introduce el peso: ")
    val peso = readLine()!!.toDouble()
    println("Introduce la altura: ")
    val altura = readLine()!!.toDouble()

    val persona1 = Persona(nombre, edad, sexo, peso, altura)
    val persona2 = Persona(nombre, edad, sexo)
    val persona3 = Persona()
    println("El peso de la persona 1 es: ${persona1.calcularIMC()}")
    println("El peso de la persona 2 es: ${persona2.calcularIMC()}")
    println("El peso de la persona 3 es: ${persona3.calcularIMC()}")
    println("La persona 1 es mayor de edad: ${persona1.esMayorEdad()}")
    println("La persona 2 es mayor de edad: ${persona2.esMayorEdad()}")
    println("La persona 3 es mayor de edad: ${persona3.esMayorEdad()}")
    println(persona1.toString())
    println(persona2.toString())
    println(persona3.toString())

}
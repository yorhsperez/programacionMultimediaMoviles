class Persona {
    private var nombre: String = ""
    private var edad: Int = 0
    private var DNI: String = ""
    private var sexo: Char = 'H'
    private var peso: Double = 0.0
    private var altura: Double = 0.0

    constructor() {

    }

    constructor(nombre: String, edad: Int, sexo: Char) {
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo

    }

    constructor(nombre: String, edad: Int, sexo: Char, peso: Double, altura: Double) {
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }

    //calcular IMC.
    fun calcularIMC(): Int {

        val imc = peso / (altura * altura)
        return when {
            imc < 20 -> -1
            imc >= 20 && imc <= 25 -> 0
            else -> 1
        }

    }

    fun esMayorEdad(): Boolean {
        return edad >= 18
    }

   //Metodo comprobar sexo
    fun comprobarSexo(sexo: Char): Char {
        return if (sexo == 'H' || sexo == 'M') {
            sexo
        } else {
            'H'
        }
    }


    //Metodo geneara numero aleatorio de 8 cifras y genera la letra del DNI
    private fun generarDNI(): String {
        var clave = String()
        val numeros = "1234567890"
        var index = 0
        for (i in 1..8) {
            index = (Math.random() * numeros.length - 1).toInt()
            clave += numeros[index]
        }

        DNI= "" + clave + "-" + calcularLetraDNI(clave.toInt())
        return DNI
    }
    private fun calcularLetraDNI(num: Int): Char {
        val letras = charArrayOf('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E')
        return letras[num % 23]
    }



    override fun toString(): String {
        return "Persona(nombre='$nombre', edad=$edad, DNI='${generarDNI()}, sexo=${comprobarSexo(sexo)}, peso=$peso, altura=$altura)"
    }










}
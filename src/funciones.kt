fun main(args: Array<String>) {
    println("Funciones")
    println(sumar(4, 5))

    println(esMayorDeEdad(18))
    println(esMayorDeEdad(17))
}

fun sumar(a: Int, b: Int) = a + b

fun esMayorDeEdad(edad: Int) = if(edad >= 18) true else false
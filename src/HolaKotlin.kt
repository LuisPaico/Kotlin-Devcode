import java.util.*

fun main(args: Array<String>) {

    println("Escribe tu nombre o pulsa [Enter o Entrar] para seguir anónimo:")
    val scanner = Scanner(System. `in`)
    val nextLine = scanner.nextLine()
    val name = if(nextLine != "") nextLine else "Kotlin"

    println("Hola $name!")
}
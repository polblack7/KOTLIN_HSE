package practice.s04.echo

fun main() {
    println("Введите строку: ")
    val input = readln()

    val line = input.split(" ")

    val lastWord = line.last()
    println(input)
    if (line.isNotEmpty()) {
        for (i in 1..3) {
            println(lastWord)
        }
    }
}
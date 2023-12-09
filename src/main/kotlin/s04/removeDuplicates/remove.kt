fun main() {
    println("Введите массив через пробел: ")
    val array = readln().split(' ')
    println(array.distinct().size)
}
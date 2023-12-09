import kotlin.math.PI
import kotlin.math.pow



abstract class Figure(val name: String, val height: Int, val base: Int) {
    open fun volume() : Double {return 0.0}
    open fun lateralProjectionArea() : Double {return 0.0}
    open fun topProjectionArea() : Double {return 0.0}
}

class Cone(height: Int, radius: Int) : Figure("Конус", height, radius) {
    override fun volume(): Double = height.toDouble() * topProjectionArea() / 3
    override fun lateralProjectionArea(): Double = base.toDouble() * 2 / 2
    override fun topProjectionArea(): Double = base.toDouble() * base.toDouble() * PI / 4
}


class Cube(sideLength: Int) : Figure("Куб", sideLength, sideLength) {
    override fun volume(): Double = base.toDouble().pow(3)
    override fun lateralProjectionArea(): Double = base.toDouble().pow(2)
    override fun topProjectionArea(): Double = base.toDouble().pow(2)
}


class Pyramid(height: Int, sideLength: Int) : Figure("Пирамида", height, sideLength) {
    override fun volume(): Double = (base.toDouble().pow(2) * height) / 3
    override fun lateralProjectionArea(): Double = base.toDouble() * height / 2
    override fun topProjectionArea(): Double = base.toDouble() * base.toDouble()
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)


    print("Введите тип фигуры: ")
    val figureType = scanner.nextLine().lowercase()


    print("Введите высоту фигуры: ")
    val height = scanner.nextInt()

    print("Введите основание/диаметр фигуры: ")
    val base = scanner.nextInt()


    val figure = when (figureType) {
        "конус" -> Cone(height, base)
        "куб" -> Cube(base)
        "пирамида" -> Pyramid(height, base)
        else -> throw IllegalArgumentException("Неподдерживаемый тип фигуры")
    }


    println("Объем ${figure.name}: ${figure.volume()}")
    println("Площадь боковой проекции: ${figure.lateralProjectionArea()}")
    println("Площадь проекции сверху: ${figure.topProjectionArea()}")
}

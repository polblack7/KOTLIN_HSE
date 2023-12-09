import java.util.Random

fun arrayCreate(rand: Random): Array<Array<Int>> {
    println("Введите размер: ")
    val size = readln().toInt()
    var m = Array(size) {Array(size) {rand.nextInt(0, 10)} }
    return m;
}

fun underlineSum(arr: Array<Array<Int>>): Int {
    var cnt = 0
    for (i in 1..<arr.size) {
        for (j in arr.size - i..<arr.size) {
            cnt += arr[i][j];
        }
    }
    return cnt;
}

fun main() {
    var arr = arrayCreate(Random(42))
    for (i in 0..<arr.size) {
        for (j in 0..<arr.size) {
            print("${arr[i][j]} ")
        }
        println()
    }
    println(underlineSum(arr))
}
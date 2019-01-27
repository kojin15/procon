package kotlin.abc_116

/**
 * @author kojin15.
 */
fun main() {
    val (AB, BC, CA) = readLine()!!.split(" ").map { it.toInt() }
    println((AB * BC) / 2)
}
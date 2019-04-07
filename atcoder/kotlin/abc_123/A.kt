package kotlin.abc_123

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val x = (1..6).map { readLine()!!.toInt() }
    if (x[4] - x[0] <= x[5]) println("Yay!") else println(":(")
}
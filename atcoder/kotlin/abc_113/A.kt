package kotlin.abc_113

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (X, Y) = readLine()!!.split(" ").map { it.toInt() }
    println(X + Y / 2)
}
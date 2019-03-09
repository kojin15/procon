package kotlin.abc_118

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    if (B % A == 0) println(A + B) else println(B - A)
}
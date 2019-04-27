package kotlin.AtCoderBeginnerContest.contest125

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (A, B, T) = readLine()!!.split(" ").map { it.toInt() }
    println(T / A * B)
}
package kotlin.AtCoderBeginnerContest.contest034

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(n + (n % 2) * 2 - 1)
}
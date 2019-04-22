package kotlin.AtCoderBeginnerContest.contest107

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, i) = readLine()!!.split(" ").map { it.toInt() }
    println(N - (i - 1))
}
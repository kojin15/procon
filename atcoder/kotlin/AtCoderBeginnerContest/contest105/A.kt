package kotlin.AtCoderBeginnerContest.contest105

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    println(Math.min(1, (N % K)))
}
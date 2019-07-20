package kotlin.AtCoderBeginnerContest.contest131

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, L) = readLine()!!.split(" ").map { it.toInt() }
    val A = (1..N).map { it to L + it - 1 }
    val min = A.minBy { Math.abs(it.second) }
    println((N * (N + 1))/2 - min!!.first + (L - 1) * (N - 1))
}
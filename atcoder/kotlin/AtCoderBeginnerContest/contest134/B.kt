package kotlin.AtCoderBeginnerContest.contest134

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, D) = readLine()!!.split(" ").map { it.toInt() }
    var t = N / (2 * D + 1)
    if (N % (2 * D + 1) != 0) t++
    println(t)
}
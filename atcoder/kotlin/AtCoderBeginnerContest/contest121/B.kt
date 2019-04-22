package kotlin.AtCoderBeginnerContest.contest121

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, M, C) = readLine()!!.split(" ").map { it.toInt() }
    val B = readLine()!!.split(" ").map { it.toInt() }
    var result = 0

    for (i in 0 until N) {
        val A = readLine()!!.split(" ").map { it.toInt() }
        var s = 0
        for (j in 0 until M) s += A[j] * B[j]
        if (s + C > 0) result++
    }
    println(result)
}
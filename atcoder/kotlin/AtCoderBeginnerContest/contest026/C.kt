package kotlin.AtCoderBeginnerContest.contest026

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val B = (2..N).map { readLine()!!.toInt() }
    val X = Array(N) { mutableListOf<Int>() }
    for (i in N - 1 downTo 1) {
        var p = 1
        if (X[i].isNotEmpty()) p += X[i].max()!! + X[i].min()!!
        X[B[i - 1] - 1].add(p)
    }
    var q = 1
    if (X.first().isNotEmpty()) q += X.first().max()!! + X.first().min()!!
    println(q)
}
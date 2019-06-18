package kotlin.AtCoderBeginnerContest.contest130

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, X) = readLine()!!.split(" ").map { it.toInt() }
    val L = readLine()!!.split(" ").map { it.toInt() }
    var d = 0; var count = 1
    for (i in 2..N + 1) {
        d += L[i - 2]
        if (d <= X) count++
    }
    println(count)
}
package kotlin.AtCoderBeginnerContest.contest130

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, K) = readLine()!!.split(" ").map { it.toLong() }
    val a = readLine()!!.split(" ").map { it.toLong() }
    var S = 0L; var count = 0L

    var r = 0
    for (l in 0 until N.toInt()) {
        while (r < N && S + a[r] < K) {
            S += a[r]
            r++
        }
        count += N - r
        S -= a[l]
    }
    println(count)
}
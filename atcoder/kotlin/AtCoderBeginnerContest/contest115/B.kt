package kotlin.AtCoderBeginnerContest.contest115

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val p = (1..N).map { readLine()!!.toInt() }.sortedDescending()
    var S = p.first() / 2
    for (i in 1 until N) {
        S += p[i]
    }
    println(S)
}
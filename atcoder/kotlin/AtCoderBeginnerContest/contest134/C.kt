package kotlin.AtCoderBeginnerContest.contest134

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val A = (1..N).map { it to readLine()!!.toInt() }.sortedByDescending { it.second }
    val (m1, m2) = A
    for (i in 1..N) {
        val t = if (i != m1.first) m1.second else m2.second
        println(t)
    }
}
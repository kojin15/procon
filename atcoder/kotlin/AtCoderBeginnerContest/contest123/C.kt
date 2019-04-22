package kotlin.AtCoderBeginnerContest.contest123

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toLong()
    val M = (1..5).map { readLine()!!.toLong() }.min()!!
    println((N / M + if (N % M == 0L) 0L else 1L) + 4L)
}
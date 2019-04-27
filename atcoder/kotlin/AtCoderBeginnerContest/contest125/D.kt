package kotlin.AtCoderBeginnerContest.contest125

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toLong() }

    val isOdd = A.count { it < 0L } % 2 == 1
    val B = A.asSequence().map { Math.abs(it) }.sortedDescending()
    println(B.sum() - if (isOdd) 2 * B.last() else 0)
}
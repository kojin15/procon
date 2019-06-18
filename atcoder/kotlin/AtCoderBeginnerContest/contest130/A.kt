package kotlin.AtCoderBeginnerContest.contest130

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (X, A) = readLine()!!.split(" ").map { it.toInt() }
    println(if (X < A) 0 else 10)
}
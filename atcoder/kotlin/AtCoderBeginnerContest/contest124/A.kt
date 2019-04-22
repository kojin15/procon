package kotlin.AtCoderBeginnerContest.contest124

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    println(if (A != B) Math.max(A, B) * 2 - 1 else 2 * A)
}
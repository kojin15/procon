package kotlin.AtCoderBeginnerContest.contest109

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    println(if ((A * B) % 2 == 0) "No" else "Yes")
}
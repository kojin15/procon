package kotlin.AtCoderBeginnerContest.contest125

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val V = readLine()!!.split(" ").map { it.toInt() }
    val C = readLine()!!.split(" ").map { it.toInt() }
    println((0 until N).map { V[it] - C[it] }.filter { it > 0 }.sum())
}
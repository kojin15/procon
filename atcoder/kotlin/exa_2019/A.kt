package kotlin.exa_2019

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (A, B, C) = readLine()!!.split(" ").map { it.toInt() }
    println(if (A == B && B == C) "Yes" else "No")
}
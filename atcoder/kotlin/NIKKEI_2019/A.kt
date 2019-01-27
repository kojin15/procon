package kotlin.NIKKEI_2019

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, A, B) = readLine()!!.split(" ").map { it.toInt() }
    println("${Math.min(A, B)} ${Math.max((A + B) - N, 0)}")
}
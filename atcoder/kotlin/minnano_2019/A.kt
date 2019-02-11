package kotlin.minnano_2019

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    if ((N + (N % 2)) / 2 >= K) println("YES") else println("NO")
}
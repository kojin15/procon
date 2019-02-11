package kotlin.minnano_2019

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (K, A, B) = readLine()!!.split(" ").map { it.toLong() }
    if (B - A <= 2 || K - (A - 1) < 2) {
        println(K + 1)
    } else {
        val x = K - (A - 1)
        println(A + (B - A) * (x / 2) + (x % 2))
    }
}
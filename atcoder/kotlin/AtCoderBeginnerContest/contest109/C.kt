package kotlin.AtCoderBeginnerContest.contest109

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, X) = readLine()!!.split(" ").map { it.toInt() }
    val x = readLine()!!.split(" ").map { it.toInt() - X }
    var buffer = x[0]
    for (i in 1 until N) {
        buffer = gcd(buffer, x[i])
    }
    println(Math.abs(buffer))
}

fun gcd(a: Int, b: Int): Int {
    if (b == 0) return a
    return gcd(b, a % b)
}
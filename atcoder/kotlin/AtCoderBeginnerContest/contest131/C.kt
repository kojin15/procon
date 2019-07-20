package kotlin.AtCoderBeginnerContest.contest131

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (A, B, C, D) = readLine()!!.split(" ").map { it.toLong() }
    println((B - A + 1) - (f(B, C, D) - f(A - 1, C, D)))
}

fun f(x: Long, a: Long, b: Long): Long {
    return x / a + x / b - x / lcm(a, b)
}

fun lcm(a: Long, b: Long): Long = a * b / gcd(a, b)

tailrec fun gcd(a: Long, b: Long): Long = when {
    a < b -> gcd(b, a)
    b == 0L -> a
    else -> gcd(b, a % b)
}

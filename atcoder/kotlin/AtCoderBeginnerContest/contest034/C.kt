package kotlin.AtCoderBeginnerContest.contest034

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (W, H) = readLine()!!.split(" ").map { it.toLong() }
    println(f(W + H - 2) * pow(f(W - 1), mod - 2) % mod * pow(f(H - 1), mod - 2) % mod)
}

val mod = 1000000007L
fun f(n: Long): Long {
    return if (n == 1L) 1 else n * f(n - 1) % mod
}
fun pow(x: Long, n: Long): Long {
    return when {
        n == 0L -> 1
        n % 2 == 0L -> pow(x, n / 2).let { (it * it) % mod }
        else -> (x * pow(x, n - 1)) % mod
    }
}
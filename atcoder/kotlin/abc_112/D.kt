package kotlin.abc_112

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    for (i in N..(M / 2)) {
        if (M % i == 0) {
            println(M / i)
            return
        }
    }
    println(1)
}
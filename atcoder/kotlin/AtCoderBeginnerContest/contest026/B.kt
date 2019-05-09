package kotlin.AtCoderBeginnerContest.contest026

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val R = (1..N).map { readLine()!!.toInt() }.sortedDescending()
    var sign = 1; var result = 0
    for (i in 0 until N) {
        result += R[i].pow2() * sign
        sign *= -1
    }
    println(result * Math.PI)
}

fun Int.pow2() = this * this
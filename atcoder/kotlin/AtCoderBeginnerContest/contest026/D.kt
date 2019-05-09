package kotlin.AtCoderBeginnerContest.contest026

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (A, B, C) = readLine()!!.split(" ").map { it.toInt() }
    var tM = 200.0
    var tm = 0.0
    var tc = 100.0
    for (i in 0 until 256) {
        tc = (tM + tm) / 2
        if (f(tc, A, B, C) > 100) tM = tc else tm = tc
    }
    println(tc)
}

fun f(t: Double, a: Int, b: Int, c: Int): Double {
    return a * t + b * Math.sin(c * t * Math.PI)
}
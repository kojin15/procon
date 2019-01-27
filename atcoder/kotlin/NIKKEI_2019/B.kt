package kotlin.NIKKEI_2019

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val A = readLine()!!
    val B = readLine()!!
    val C = readLine()!!

    var count = 0
    for (i in 0 until N) {
        val c = booleanArrayOf(A[i] == B[i], B[i] == C[i], C[i] == A[i]).count { it }
        count += when (c) {
            0 -> 2
            1 -> 1
            else -> 0
        }
    }
    println(count)
}
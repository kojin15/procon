package kotlin.AtCoderBeginnerContest.contest105

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    for (x in 0..(N / 4)) {
        val n = N - 4 * x
        if (n >= 0 && n % 7 == 0) {
            println("Yes")
            return
        }
    }
    println("No")
}
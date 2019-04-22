package kotlin.AtCoderBeginnerContest.contest123

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val X = (1..5).map { readLine()!!.toInt() }
        .sortedByDescending { (it % 10).let { i -> if (i == 0) Int.MAX_VALUE else i } }
        .mapIndexed { index, it -> if (it % 10 == 0 || index == 4) it else 10 * (it / 10 + 1) }
    println(X.sum())
}
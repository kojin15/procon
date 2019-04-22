package kotlin.AtCoderBeginnerContest.contest124

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val H = readLine()!!.split(" ").map { it.toInt() }

    var count = 0
    var maxH = 0
    H.forEach {
        if (maxH <= it) {
            count++
            maxH = it
        }
    }
    println(count)
}
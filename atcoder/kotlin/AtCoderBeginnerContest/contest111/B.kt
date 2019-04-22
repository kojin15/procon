package kotlin.AtCoderBeginnerContest.contest111

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    var base = 111
    while (true) {
        if (N <= base) {
            println(base)
            break
        }
        base += 111
    }
}
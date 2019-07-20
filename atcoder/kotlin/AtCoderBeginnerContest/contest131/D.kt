package kotlin.AtCoderBeginnerContest.contest131

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val AB = (1..N).map { readLine()!!.split(" ").map { it.toInt() } }.sortedBy { it[1] }
    var t = 0
    for ((a, b) in AB) {
        t += a
        if (t > b) {
            println("No")
            return
        }
    }
    println("Yes")
}
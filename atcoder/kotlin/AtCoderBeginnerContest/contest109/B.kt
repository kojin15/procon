package kotlin.AtCoderBeginnerContest.contest109

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val list = mutableListOf<String>()
    list.add(readLine()!!)
    for (i in 2..N) {
        val next = readLine()!!
        if (list.contains(next) || list.last().last() != next.first()) {
            println("No")
            return
        }
        list.add(next)
    }
    println("Yes")
}
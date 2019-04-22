package kotlin.AtCoderBeginnerContest.contest118

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val list = arrayListOf<List<Int>>()
    for (i in 1..N) list.add(readLine()!!.split(" ").map { it.toInt() }.filterIndexed { index, i -> index != 0 })

    var result = 0
    for (j in 1..M) {
        if (list.all { it.contains(j) }) result++
    }
    println(result)
}
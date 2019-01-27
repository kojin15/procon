package kotlin.abc_113

/**
 * @author kojin15.
 */
fun main() {
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val Plist = IntArray(N) {1}
    val PY = (1..M).mapIndexed { index, i ->
        val (P, Y) = readLine()!!.split(" ").map { it.toInt() }
        Triple(index, P, Y)
    }.sortedBy { it.third }
    val results = arrayListOf<Pair<Int, String>>()
    PY.forEach {
        results.add(Pair(it.first, f(it.second) + f(Plist[it.second-1]++)))
    }
    results.sortedBy { it.first }.forEach { println(it.second) }
}

fun f(n: Int): String {
    var result = ""
    for (i in 0 until 6 - n.toString().length) result += "0"
    return "$result$n"
}
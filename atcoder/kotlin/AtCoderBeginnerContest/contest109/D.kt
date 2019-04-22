package kotlin.AtCoderBeginnerContest.contest109

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (H, W) = readLine()!!.split(" ").map { it.toInt() }
    val a = (1..H).map { readLine()!!.split(" ").map { it.toInt() }.toMutableList() }
    val result = mutableListOf<String>()

    for (i in 0 until H) for (j in 0 until W - 1) {
        val c = a[i][j]
        if (c % 2 != 0) {
            a[i][j + 1] += 1
            result.add("${i + 1} ${j + 1} ${i + 1} ${j + 2}")
        }
    }

    for (k in 0 until H - 1) {
        val c = a[k][W - 1]
        if (c % 2 != 0) {
            a[k + 1][W - 1] += 1
            result.add("${k + 1} $W ${k + 2} $W")
        }
    }

    println(result.size)
    result.forEach(::println)
}
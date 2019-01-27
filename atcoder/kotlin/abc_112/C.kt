package kotlin.abc_112

/**
 * @author kojin15.
 */
fun main() {
    val N = readLine()!!.toInt()
    val xyh = (1..N).map { readLine()!!.split(" ").map { it.toInt() } }
    var cx = 0; var cy = 0; var H = Int.MAX_VALUE
    for (x in 0..100) for (y in 0..100) {
        val first = xyh.first { it[2] != 0 }
        val h = Math.abs(x - first[0]) + Math.abs(y - first[1]) + first[2]
        if (h < H && xyh.all { it[2] == Math.max(h - Math.abs(x - it[0]) - Math.abs(y - it[1]), 0) }) {
            cx = x; cy = y; H = h
        }
    }
    println("$cx $cy $H")
}
package kotlin.abc_116

/**
 * @author kojin15.
 */
fun main() {
    val N = readLine()!!.toInt()
    var h = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    var result = 0
    h = f(h)
    for (i in 100 downTo 1) {
        for (j in h.indices) if (h[j] == i) {
            h[j] -= 1
            result++
        }
        h = f(h)
    }
    println(result)
}

fun f(a: IntArray): IntArray {
    val b = mutableListOf<Int>()
    b.add(a.first())
    for (i in 1 until a.size) {
        if (b.last() != a[i]) b.add(a[i])
    }
    return b.toIntArray()
}
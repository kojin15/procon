package kotlin.abc_118

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    var A = readLine()!!.split(" ").map { it.toInt() }.sorted()
    var min: Int = A.first()
    while (A.size > 1) {
        min = A.first()
        A = A.mapIndexed { index, i -> if (index != 0) i % min else i }.filter { it != 0 }.sorted()

    }
    println(if (A.isNotEmpty()) A[0] else min)
}
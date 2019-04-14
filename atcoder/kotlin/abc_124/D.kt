package kotlin.abc_124

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val S = readLine()!!

    val isFirst0 = S.first() == '0'
    val x0 = S.split("1").map { it.length }.filter { it != 0 }
    val x1 = S.split("0").map { it.length }.filter { it != 0 }

    val k = Math.min(K, x0.size)
    val result = mutableListOf<Int>()
    for (i in 0..(x0.size - k)) {
        val y0 = x0.subList(i, i + k)
        val y1 = if (isFirst0) {
            if (i == 0) {
                x1.subList(0, Math.min(k, x1.size))
            } else {
                x1.subList(Math.max(i - 1, 0), Math.min(i + k, x1.size))
            }
        } else {
            if (i == 0) {
                x1.subList(0, Math.min(k + 1, x1.size))
            } else {
                x1.subList(i, Math.min(i + k + 1, x1.size))
            }
        }
        result.add(y0.sum() + y1.sum())
    }
    println(result.max())
}
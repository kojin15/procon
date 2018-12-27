package kotlin.abc_114

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val S = readLine()!!
    val a = mutableListOf<Int>()
    for (i in 0 until S.length - 2) {
        a.add(Math.abs(S.substring(i, i + 3).toInt() - 753))
    }
    println(a.min())
}
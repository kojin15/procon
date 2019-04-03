package kotlin.exa_2019

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val s = readLine()!!
    println(if (s.count { it == 'R' } > s.count { it == 'B' }) "Yes" else "No")
}
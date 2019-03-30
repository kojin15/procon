package kotlin.abc_122

import kotlin.abc_113.f

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, Q) = readLine()!!.split(" ").map { it.toInt() }
    val S = readLine()!!

    var sum = 0
    var flag = false
    val list = S.mapIndexed { i, s ->
        if (s == 'A') {
            flag = true
        } else {
            if (flag && s == 'C') sum++
            flag = false
        }
        sum
    }

    for (j in 1..Q) {
        val (l, r) = readLine()!!.split(" ").map { it.toInt() - 1 }
        println(list[r] - list[l])
    }
}
package kotlin.minnano_2019

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val ab = (1..3).map { readLine()!!.split(" ").map { it.toInt() } }.flatten()
    var flag = true
    for (i in 1..4) {
        if (!(ab.count { it == i } in 1..2)) {
            flag = false
            break
        }
    }
    println(if (flag) "YES" else "NO")
}
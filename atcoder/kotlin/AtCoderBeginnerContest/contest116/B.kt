package kotlin.AtCoderBeginnerContest.contest116

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val s = readLine()!!.toInt()
    val a = mutableListOf<Int>()
    a.add(s)
    var _a = s
    for (i in 2..1000000) {
        _a = f(_a)
        if (a.contains(_a)) {
            println(i)
            return
        }
        a.add(_a)
    }
}

fun f(n: Int): Int {
    return if (n % 2 == 0) n / 2 else 3 * n + 1
}
package kotlin.AtCoderBeginnerContest.contest134

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val result = mutableSetOf<Int>()

    for (i in N downTo 1) {
        //i自身を除くiの倍数の箱のボールの総数を求める
        var j = i * 2
        var t = 0
        while (j <= N) {
            if (result.contains(j)) t++
            j += i
        }

        //上で求めた値とa_iの値が異なる場合iの箱にボールを入れる
        if (t % 2 != a[i - 1]) result.add(i)
    }
    println(result.size)
    println(result.joinToString(separator = " "))
}
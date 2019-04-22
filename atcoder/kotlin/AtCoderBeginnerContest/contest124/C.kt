package kotlin.AtCoderBeginnerContest.contest124

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val S = readLine()!!
    var a = 0;var b = 0

    S.forEachIndexed { index, c ->
        if (index % 2 != Character.getNumericValue(c)) a++
        if ((index + 1) % 2 != Character.getNumericValue(c)) b++
    }
    println(Math.min(a, b))
}

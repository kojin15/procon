package kotlin.AtCoderBeginnerContest.contest105

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    var result = if (N == 0) "0" else ""
    while (N != 0) {
        val r = N % -2
        when {
            r >= 0 -> {
                result = "$r$result"
                N /= -2
            }
            r < 0 -> {
                result = "${-r}$result"
                N = (N / -2) + 1
            }
        }
    }
    println(result)
}
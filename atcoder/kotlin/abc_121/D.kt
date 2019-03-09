package kotlin.abc_121

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (A, B) = readLine()!!.split(" ").map { it.toLong() }
    var result = 0L
    if (A % 2 == 0L) {
        for (i in 0 until ((B - A + 1) % 4)) {
            if (i == 0L) result = B else result = result xor (B - i)
        }
        println(result)
        return
    } else {
        for (i in 0 until ((B - A) % 4)){
            if (i == 0L) result = B else result = result xor (B - i)
        }
        println(result xor A)
        return
    }
}
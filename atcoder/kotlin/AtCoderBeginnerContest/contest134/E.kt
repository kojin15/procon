package kotlin.AtCoderBeginnerContest.contest134

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val C = IntArray(N) { 0 }
    var count = 1
    C[0] = readLine()!!.toInt()

    var min = C[0]

    a@ for (i in 1 until N) {
        val A = readLine()!!.toInt()
        if (min >= A) {
            C[count] = A
            count++
            min = A
            continue@a
        }
        for (j in 0 until count) {
            if (C[j] < A) {
                C[j] = A
                continue@a
            }
        }
        C[count] = A
        count++
    }

    println(count)
}
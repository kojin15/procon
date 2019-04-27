package kotlin.AtCoderBeginnerContest.contest125

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }

    val B = mutableListOf<Int>()
    val C = mutableListOf<Int>()
    B.add(A.first()); C.add(A.last())
    for (i in 1 until N) {
        B.add(gcd(B.last(), A[i]))
        C.add(gcd(C.last(), A[N - 1 - i]))
    }
    val G = mutableListOf<Int>()
    G.add(C[N - 2])
    for (i in 0 until N - 2) {
        G.add(gcd(B[i], C[N - 3 - i]))
    }
    G.add(B[N - 2])
    println(G.max())
}

fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
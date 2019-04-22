package kotlin.Tenka1ProgrammerBeginnerContest2019

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt(); val S = readLine()!!; val K = readLine()!!.toInt()
    val k = S[K - 1]
    println(String(S.map { if (it != k) '*' else it }.toCharArray()))
}
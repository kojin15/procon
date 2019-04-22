package kotlin.Tenka1ProgrammerBeginnerContest2019

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (A, B, C) = readLine()!!.split(" ").map { it.toInt() }
    println(if (C in Math.min(A, B)..Math.max(A, B)) "Yes" else "No")
}
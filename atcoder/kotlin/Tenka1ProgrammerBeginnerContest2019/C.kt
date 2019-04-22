package kotlin.Tenka1ProgrammerBeginnerContest2019

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt(); val S = readLine()!!

    val W = S.split("#").filter { it.isNotBlank() }.map { it.length }.let { if (S.first() == '.') it.drop(1) else it }
    val B = S.split(".").filter { it.isNotBlank() }.map { it.length }

    val sw = mutableListOf<Int>()
    sw.add(W.sum())
    W.forEach { sw.add(sw.last() - it) }

    val sb = mutableListOf<Int>()
    sb.add(0)
    B.forEach { sb.add(sb.last() + it) }

    val counts = mutableListOf<Int>()
    counts.add(sb.last())
    for (i in B.indices) {
        val w = if (i in sw.indices) sw[i] else 0
        val b = if (i in sb.indices) sb[i] else 0
        counts.add(w + b)
    }
    println(counts.min())
}
package kotlin.AtCoderBeginnerContest.contest115

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val D = readLine()!!.toInt()
    var S = "Christmas"
    for (i in 1..(25 - D)) S += " Eve"
    println(S)
}
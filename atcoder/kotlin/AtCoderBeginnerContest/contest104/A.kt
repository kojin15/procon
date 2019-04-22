package kotlin.AtCoderBeginnerContest.contest104

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    readLine()!!.toInt().let {
        if (it < 1200) println("ABC") else if (it < 2800) println("ARC") else println("AGC")
    }
}
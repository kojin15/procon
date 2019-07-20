package kotlin.AtCoderBeginnerContest.contest131

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val S = readLine()!!
    if (S[0] == S[1] || S[1] == S[2] || S[2] == S[3]) {
        println("Bad")
    } else println("Good")
}
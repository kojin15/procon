package kotlin.AtCoderBeginnerContest.contest104

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val S = readLine()!!
    if (S.startsWith("A") && S[1].isLowerCase() && S.last().isLowerCase()) {
        S.substring(2, S.lastIndex).let {
            if (it.count { c -> c == 'C' } == 1) {
                if (it.filter { c -> c != 'C' }.all { c -> c.isLowerCase() }) {
                    println("AC")
                } else println("WA")
            } else println("WA")
        }
    } else println("WA")
}
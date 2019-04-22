package kotlin.AtCoderBeginnerContest.contest111

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    println(readLine()!!.map { if (it == '1') '9' else '1' }.let { "${it[0]}${it[1]}${it[2]}" })
}
package kotlin.abc_114

/**
 * @author kojin15.
 */
fun main() {
    readLine()!!.toInt().let {
        if (it == 3 || it == 5 || it == 7) println("YES") else println("NO")
    }
}
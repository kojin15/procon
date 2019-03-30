package kotlin.abc_122

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val list = mutableListOf<Int>()
    readLine()!!.forEach {
        if (acgt.contains(it)) list.add(if (list.isEmpty()) 1 else list.last() + 1) else list.add(0)
    }
    println(list.max())
}

val acgt = arrayOf('A', 'C', 'G', 'T')
package algorithm.chapter2

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    if (a < b) {
        println("<")
    } else if (a > b) {
        println(">")
    } else {
        println("==")
    }
}
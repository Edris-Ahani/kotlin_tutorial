package course

val pi: Float by lazy{
    3.14f
}

val pi2: Float? by lazy{
    3.14f
}

fun main() {
    println("Some initial code...")

    val area1 = pi * 4 * 4

    val area2 = pi * 4 * 4

    println("Some more code...")
}
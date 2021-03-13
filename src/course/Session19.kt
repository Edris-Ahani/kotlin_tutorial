package course

fun main() {
    val x = 4

    when(x){
        0, 1 -> println("x is zero or one")
        2 -> println("x is 2")
        in 3..10 -> println("x is between 3 to 10")
        !in 40..100 -> println("x isn't between 40 to 100")
        else -> {
            println("x value is unknown")
        }
    }

    var str: String = when(x){
        0, 1 -> "x is zero or one"
        2 -> "x is 2"
        in 3..10 -> "x is between 3 to 10"
        !in 40..100 -> "x isn't between 40 to 100"
        else -> {
            "x value is unknown"
        }
    }
    println(str)
}
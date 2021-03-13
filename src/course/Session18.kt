package course

fun main() {
    // If as Expression
    val a = 2
    val b = 5
    var maxValue:Int

    if(a>b){
        maxValue = a
    }
    else{
        maxValue = b
    }
    println(maxValue)

    var maxValue2: Int =
        if(a>b){
            println("a")
            a
        } else{
            println("b")
            b
        }
    println(maxValue2)
}
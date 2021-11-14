package course

fun main() {
    var maxValue = max(2, 4)
    var maxValue2 = max2(5,1)

    println(maxValue)
    println(maxValue2)
}

fun max(a: Int, b: Int): Int{
    if(a>b)
        return a
    else
        return b
}

//Functions as Expressions
fun max2(a: Int, b: Int): Int = if( a>b) a else b
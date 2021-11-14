package course
//INFIX FUNCTION
//1. All Infix function are extension function
//  But all extension function are not Infix
//2. Infix functions just have one parameter
fun main() {
    var a:Int = 2
    var b:Int = 6
    println(a greaterValue1 b)
}

infix fun Int.greaterValue1(other: Int): Int{
    if(this>other)
        return this
    else
        return other
}
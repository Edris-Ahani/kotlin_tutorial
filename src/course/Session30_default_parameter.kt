package course

fun main() {
    var result = findVolume(2, 3)
    println(result)

    var result1 = findVolume(2, 3, 5)
    println(result1)

    //Named Parameters
    var result2 = findVolume(height = 5, breadth = 3, length = 2)
    println(result2)
}

@JvmOverloads
fun findVolume(length: Int, breadth: Int, height: Int = 10): Int{
    return length * breadth * height;
}
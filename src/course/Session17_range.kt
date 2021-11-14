package course

fun main() {

    var range = 1..10   // 1 to 10
    var recursiveRange1 = 10 downTo 1 // 10 to 1
    var recursiveRange2 = 5 downTo 1 step 2  //5, 3, 1
    var range2 = "a".."z" // "a" to "z"
    var range3 = 'A'..'Z'   // 'A' to 'Z'
    var range4 = 'A'..'z'   // 'A' to 'z'

    var isPresent = 'a' in range3
    var isPresent2 = 'a' in range4
    println(isPresent)
    println(isPresent2)
    var countDown = 10.downTo(1)
    println(countDown)
    var moveUp = 1.rangeTo(10)
    println(moveUp)


    for (count in 10 downTo 1){
        println(count)
    }
    println("//////////////////////////////")
    for (count in countDown){
        println(count)
    }
    println("//////////////////////////////")
    for (count in moveUp){
        println(count)
    }
}
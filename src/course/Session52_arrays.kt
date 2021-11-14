package course
// Arrays
fun main() {
    var myArray = Array<Int>(5){0}
    myArray[3] = 3
    for (element in myArray){
        println(element)
    }

    for(index in 0..myArray.size -1){
        println("myArray[$index]: ${myArray[index]}")
    }
}

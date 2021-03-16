package course
// SET and HASH SET
fun main() {
    // "Set" contains unique elements
    // "HashSet" also contains unique elements but sequence is not guaranteed in output
    var mySet = setOf<Int>(1, 2 ,5, 5, 6, 7, 9, 9, 9)   //Immutable, Read Only

    for (element in mySet){
        println("$element")
    }
    println()

    var myMutableSet = mutableSetOf<Int>(1, 2 ,5, 5, 6, 7, 9, 9, 9)   //mutable, Read and Wright
    //var myHashSetOf = hashSetOf<Int>(1, 2 ,5, 5, 6, 7, 9, 9, 9)   //mutable, Read and Wright
    myMutableSet.add(2)
    myMutableSet.add(0)

    for (element in myMutableSet){
        println("$element")
    }
    println()

}

package course

fun main() {
    val myNumbers = listOf(2, 3, 4, 6, 23, 90)
    val all = myNumbers.all { num -> num > 10 } // Are all elements greater than 10?
    println(all)

    val myPredicate = {num: Int -> num > 10}

    val any = myNumbers.any(myPredicate) // Does any of these elements satisfy the predicate?
    println(any)

    val count = myNumbers.count({ num -> num > 10 }) // number of elements that satisfy the predicate?
    println(count)

    val find = myNumbers.find { num -> num > 10 } // Return the first number that matches the predicate
    println(find)

    val find2 = myNumbers.find { num -> num > 100 } // Return the first number that matches the predicate
    println(find2)

}
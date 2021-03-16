package course
/**FILTER
* Returns a list containing only elements matching the given [predicate].
*/
/**MAP
 * Returns a list containing the results of applying the given [transform] function
 * to each element in the original collection.
 */
fun main() {
    val myNumbers = listOf(2, 3, 4, 6, 23, 90)
    //val mySmallNums = myNumbers.filter { num -> num<10 }
    val mySmallNums = myNumbers.filter { it<10 }

    for (e in mySmallNums){
        println(e)
    }
    println()

    val mySquaredNums: List<Int> = myNumbers.map { num -> num * num} // {it * it}
    for (e in mySquaredNums){
        println(e)
    }
    println()

    val myCombineNum: List<Int> = myNumbers.filter { it<10 }.map { num -> num * num} // {it * it}
    for (e in myCombineNum){
        println(e)
    }
    println()

    val people = listOf<Person2>(Person2(10, "Ali"), Person2(31, "Edris"), Person2(5, "Magi"), Person2(6, "Emi"))
    val names = people.filter { person2 -> person2.name.startsWith("E") }.map { person2 -> person2.name }

    for (e in names){
        println(e)
    }
    println()

    val persons = people.filter { person2 -> person2.age < 10
     }

    for (e in persons){
        println(e)
    }
    println()
}

class Person2(var age: Int, var name:String){
    override fun toString(): String {
        return "Person2(age=$age, name='$name')"
    }
}
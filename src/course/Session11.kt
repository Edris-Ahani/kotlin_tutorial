package course

fun main() {
    var name: String
    name = "Edris"

    display(name);

    var personObj = Person()
    personObj.name = "Arash"
    personObj.display(personObj.name)
    println("the name of person is ${personObj.name}")
}

fun display(name: String) {
    println(name)
}

class Person{
    var name: String = ""
    fun display(name: String) {
        println(name)
    }
}

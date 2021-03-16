package course
//WITH and APPLY
fun main() {

    var person1 = Person1()
    with(person1){
        name = "Edris"
        age = 31
    }
    println(person1.name)
    println(person1.age)

    person1.apply {
        name = "Arman"
        age = 19
    }.startRun()
}

class Person1{
    var name: String = ""
    var age: Int = -1
    fun startRun(){
        println("Name: $name, Age: $age")
        println("Now I am ready to run")
    }
}
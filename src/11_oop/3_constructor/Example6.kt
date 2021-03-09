package `11_oop`.`3_constructor`

//Calling supper class secondary constructor from derived class secondary constructor
open class Parent{

    constructor(name: String, id: Int){
        println("this executes first")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int,pass: String){
        println("this executes third")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}
class Child: Parent{
    constructor(name: String, id: Int): super(name,id){
        println("this executes second")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int,pass: String):super(name,id,"password"){
        println("this executes forth")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}
fun main(args: Array<String>){
    val obj1 = Child("Ashu", 101)
    val obj2 = Child("Ashu", 101,"mypassword")
}
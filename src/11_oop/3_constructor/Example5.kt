package `11_oop`.`3_constructor`
//Calling one secondary constructor from another secondary constructor of same class
class MyClass6{
    constructor(name: String, id: Int): this(name,id, "mypassword"){
        println("this executes next")
        println("Name = ${name}")
        println("Id = ${id}")
    }
    constructor(name: String, id: Int,pass: String){
        println("this executes first")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}
fun main(args: Array<String>){
    val obj = MyClass6 ("Ashu", 101)
}
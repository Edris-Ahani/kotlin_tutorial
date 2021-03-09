package `11_oop`.`3_constructor`
//secondary constructor
class MyClass3{
    constructor(name: String){
        println("Name = ${name}")
        println()
    }
    constructor(name: String, id: Int){
        println("Name = ${name}")
        println("Id = ${id}")
        println()
    }
}
fun main(args: Array<String>){
    val obj = MyClass3 ("Ashu")
    val obj1 = MyClass3 ("Ashu", 101)
}
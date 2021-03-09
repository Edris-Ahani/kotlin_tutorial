package `11_oop`.`3_constructor`
//primary as well as secondary constructor in a same class
class MyClass4(password: String){

    constructor(name: String, id: Int, password: String): this(password){
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${password}")
        println()
    }
}
fun main(args: Array<String>){
    val obj = MyClass4 ("mypassword")
    val obj1 = MyClass4 ("Ashu", 101, "mypassword")

}
package `11_oop`.`3_constructor`
//primary constructor
class myClass(val name: String, var id: Int) {
}
fun main(args: Array<String>){
    val myclass = myClass ("Ashu", 101)

    println("Name = ${ myclass.name}")
    println("Id = ${ myclass.id}")
}
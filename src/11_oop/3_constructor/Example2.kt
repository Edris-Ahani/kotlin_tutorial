package `11_oop`.`3_constructor`
//Primary constructor with initializer block
class myClass2(name: String, id: Int) {
    val e_name: String
    var e_id: Int
    init{
        e_name = name.capitalize()
        e_id = id
        println("Name = ${e_name}")
        println("Id = ${e_id}")
    }
}
fun main(args: Array<String>){
    val myclass2 = myClass2 ("ashu", 101)

}
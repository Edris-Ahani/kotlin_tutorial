package `11_oop`.`4_visibility_modifier`

//Overriding of protected types
open class Base1{
    open protected val i = 5
}
class Another : Base1(){
    fun getValue() : Int
    {
        return i
    }
    override val i =10
}
fun main(args: Array<String>) {
    var obj = Another()
    println(obj.getValue())
}
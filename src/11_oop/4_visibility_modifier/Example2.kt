package `11_oop`.`4_visibility_modifier`

//protected modifier
open class Base{
    protected val i = 2
}
class Derived : Base(){

    fun getValue() : Int
    {
        return i
    }
}

fun main(args: Array<String>) {
    var obj = Derived()
    println(obj.getValue())
}
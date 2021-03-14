package course

fun main() {
    println(Customer.count)
    println(Customer.typeOfCustomer(null))
    Customer.count = 23
    println(Customer.count)
    println(Customer.typeOfCustomer("Canadian"))
    Customer.myMethod("Hello")
}

open class MySupperClass{
    open fun myMethod(str: String){
        println("MySupperClass")
    }
}

object Customer: MySupperClass(){
    var count: Int = -1

    init {
        println("init")
    }

    fun typeOfCustomer(name: String?): String{
        if( name == null){
            return "American"
        }
        return name
    }

    override fun myMethod(str: String){
        super.myMethod(str)
        println("Object Customer: $str")
    }
}
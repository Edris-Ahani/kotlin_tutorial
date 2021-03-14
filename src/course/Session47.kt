package course
//Lambdas and Higher Order Functions
fun main() {
    var program = Program()
    program.addTwoNumbers(2, 5)

    program.addTwoNumbers(2,5, object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    val myLambda: (Int) -> Unit = { s: Int ->  println(s)} // Lambda Expression (function)
    program.addTwoNumbers(2, 5, myLambda)
}

class Program{

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit){ // High level function with lambda as parameter
        var sum = a + b
        action(sum)
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface){ // Using interface / object oriented way
        var sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int){
        var sum = a + b
        println(sum)
    }
}

interface MyInterface{
    fun execute(sum: Int)
}
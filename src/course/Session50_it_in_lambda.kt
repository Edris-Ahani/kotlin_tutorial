package course
//"it" keyword in Lambda expression
fun main() {

    var program1 = Program1()

    program1.reverseAndDisplay("Hello", { s -> s.reversed() })
    program1.reverseAndDisplay("Hello", { it.reversed() })

}

class Program1{
    fun reverseAndDisplay(str: String, myFunc: (String) -> String){ // High level function with lambda as parameter
        var result = myFunc(str)
        println(result)
    }
}
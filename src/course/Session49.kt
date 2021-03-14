package course
//CLOSURES
fun main() {

    var calculation = Calculation()
    var result = 0

    println(result)
    calculation.addTwoNum(2, 5){x, y -> result = x + y}
    println(result)
}

class Calculation{
    fun addTwoNum(a: Int, b: Int, action: (Int, Int) -> Unit){
        action(a, b)
    }
}
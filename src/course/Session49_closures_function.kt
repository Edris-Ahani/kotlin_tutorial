package course
//CLOSURES
fun main() {

    var calculation = Calculation()
    var result = 0

    println(result)
    calculation.addTwoNum(2, 5){x, y -> result = (x + y) * 2}
    println(result)
    println(calculation.addTwoNum2(2, 8){x, y -> (x + y) * 2})
}

class Calculation{
    fun addTwoNum(a: Int, b: Int, action: (Int, Int) -> Unit){
        action(a, b)
    }
    fun addTwoNum2(a: Int, b: Int, action: (Int, Int) -> Int): Int {
        return action(a, b)
    }
}
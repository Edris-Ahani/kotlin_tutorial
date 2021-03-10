package `11_oop`.`4_visibility_modifier`
//private modifier
private class PrivateModifier {
    private val x = 20
    private fun myPrintln(){
        println(x)
        println()
    }

    fun publicPrint(){
        myPrintln()
    }

}

fun main() {
    var obj = PrivateModifier()
    obj.publicPrint()
}



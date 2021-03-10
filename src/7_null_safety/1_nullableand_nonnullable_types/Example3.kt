package `7_null_safety`.`1_nullableand_nonnullable_types`

//Checking for null in conditions
fun main(args: Array<String>){
    var str: String? = "Hello"     // variable is declared as nullable
    var len = if(str!=null) str.length else -1
    println("str is : $str")
    println("str length is : $len")

    str = null
    println("str is : $str")
    len = if(str!=null) str.length else -1
    println("b length is : $len")
}
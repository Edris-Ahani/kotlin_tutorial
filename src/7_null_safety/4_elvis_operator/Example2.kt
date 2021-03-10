package `7_null_safety`.`4_elvis_operator`

//Elvis Operator example
fun main(args: Array<String>){

    var str: String? = null
    var str2: String? = "May be declare nullable string"
    var len1:  Int = str ?.length ?: -1
    var len2:  Int = str2 ?.length ?:  -1

    println("Length of str is ${len1}")
    println("Length of str2 is ${len2}")
}
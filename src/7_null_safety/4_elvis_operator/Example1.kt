package `7_null_safety`.`4_elvis_operator`

fun main(args: Array<String>){
    var str: String? = null
    var str2: String? = "May be declare nullable string"
    var len1:  Int = if (str != null) str.length else -1
    var len2:  Int = if (str2 != null) str2.length else -1
    println("Length of str is ${len1}")
    println("Length of str2 is ${len2}")
}
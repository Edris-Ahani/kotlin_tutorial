package `7_null_safety`.`3_unsafe_safe_cast`

//Safe cast operator: as?
fun main(args: Array<String>){

    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)
}
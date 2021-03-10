package `7_null_safety`.`3_unsafe_safe_cast`
//Unsafe cast operator: as
fun main(args: Array<String>){
    val obj: String? = "String unsafe cast"
    val str: String? = obj as String? // Works
    println(str)
}
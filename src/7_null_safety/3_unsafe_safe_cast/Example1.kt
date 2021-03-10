package `7_null_safety`.`3_unsafe_safe_cast`
//Unsafe cast operator: as
//A nullable string (String?) cannot be cast to non nullabe string (String),
// this throw an exception.
fun main(args: Array<String>){
    val obj: Any? = null
    val str: String = obj as String
    println(str)
}
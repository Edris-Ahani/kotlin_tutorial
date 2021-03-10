package `7_null_safety`.`2_smart_cast`

//Use of is for smart cast
fun main(args: Array<String>){
    val obj: Any = "The variable obj is automatically cast to a String in this scope"
    if(obj is String) {
        // No Explicit Casting needed.
        println("String length is ${obj.length}")
    }
}
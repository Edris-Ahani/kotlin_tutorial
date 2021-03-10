package `7_null_safety`.`3_unsafe_safe_cast`
//Unsafe cast operator: as
//While try to cast integer value of Any type into string type lead to generate
// a ClassCastException.
fun main() {
    val obj: Any = 123
    val str: String = obj as String
}
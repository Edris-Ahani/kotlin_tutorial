package `7_null_safety`.`2_smart_cast`

fun main(args: Array<String>){
    var string: String? = "Hello!"
    if(string != null) { // smart cast
        print(string.length) // It works now!
    }
}
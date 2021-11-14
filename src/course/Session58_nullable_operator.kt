package course

fun main() {
    val name: String? = null
    // 1. Safe Call (?.)
    // Returns the length if 'name' is not null else returns NULL
    // Use it if you don't mind getting NULL value
    println("the length of name is ${name?.length}")
    println("=======================================================")

    // 2. Safe Call with let (?.let)
    // It executes the block Only If name is Not Null
    name?.let { println("the length of name is ${name?.length}") }
    println("=======================================================")

    // 3. Elvis-operator (?:)
    // When we have nullable reference 'name', we can say "is name is not null", use it,
    // otherwise use some non-null value

    val len = if(name != null)
                    name.length
                  else
                    -1
    println(len)
    println("=======================================================")

    val length = name?.length ?: -1
    println(len)
    println("=======================================================")

    // 4. Non-null assertion operator (!!)
    // Use it when you are sure the value is Not Null
    // throws NullPointerException if the value is found to be Null
    println("the length of name is ${name!!.length}")
    println("=======================================================")
}
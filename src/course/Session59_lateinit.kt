package course
//lateinit used only with mutable data type [var]
//lateinit used only with non-nullable data type
//lateinit values must be initialised before you use it
fun main() {
    var country = Country()
    country.setup()

    var country2 = Country()
    println(country2.name)
}

class Country{
    lateinit var name: String

    fun setup(){
        name = "USA"
        println("the name of country is $name")
    }
}

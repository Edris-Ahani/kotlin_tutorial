package course
//COMPANION OBJECT
fun main() {
    println(MyCustomClass.count)
    println(MyCustomClass.typeOfCustomer(null))
}

class MyCustomClass{
    companion object{
        init {
            println("init")
        }

        var count: Int = -1

        @JvmStatic
        fun typeOfCustomer(name: String?): String {
            if (name == null) {
                return "American"
            }
            return name
        }
    }
}
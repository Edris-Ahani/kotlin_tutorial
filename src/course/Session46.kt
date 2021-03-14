package course
//COMPANION OBJECT
fun main() {
    println(MyCustomClass.count)
    println(MyCustomClass.typeOfCustomer(null))
}

class MyCustomClass{
    companion object{
        var count: Int = -1

        init {
            println("init")
        }

        @JvmStatic
        fun typeOfCustomer(name: String?): String {
            if (name == null) {
                return "American"
            }
            return name
        }
    }
}
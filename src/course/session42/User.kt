package course.session42

class User() : Person() {
    override var name: String = ""

    override fun printName() {
        println("My name is $name")
    }
}
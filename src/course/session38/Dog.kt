package course.session38

class Dog: Animals() {
    var breed: String = ""
    override var color: String = "black"
    fun bark(){
        println("Bark")
        println()
    }
    override fun eat(){
        println("Dog is eating")
        println()
    }
}
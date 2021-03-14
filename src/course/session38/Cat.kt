package course.session38

class Cat: Animals() {
    var age: Int = -1

    fun meow(){
        println("Meow")
        println()
    }

    override
    fun eat(){
        //super.eat()
        super<Animals>.eat()
        println("Cat is eating")
        println()
    }
}
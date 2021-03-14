package course.session40

//primary constructor
/*class Dog1(color: String, var breed: String):Animal(color) {
    init {
        println("from dog init: color=$color, breed=$breed")
    }
}*/

//secondary constructor
class Dog1:Animal{
    var breed: String = ""

    constructor(color: String, breed: String): super(color){
        this.breed = breed
        println("from dog: color=$color, breed=$breed")
    }
}
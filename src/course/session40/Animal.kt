package course.session40

//primary constructor
/*open class Animal(var color: String = "") {
    init {
        println("From animal init: color=$color")
    }
}*/

//secondary constructor
open class Animal{
    var color: String = ""
    constructor(color: String){
        this.color = color
        println("From animal: color=$color")
    }
}
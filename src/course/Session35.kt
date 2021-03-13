package course

fun main() {
    var teacher = Teacher("Edris")
    println(teacher.name)
    println(teacher.toString())

    var teacher1 = Teacher("Arash", 1)
    println(teacher1.toString())
}

/*class Teacher constructor(name: String){
    var name: String = ""
    init {
        this.name = name
        println("My name is $name")
    }
}*/

/*
class Teacher(name: String){
    init {
        println("My name is $name")
    }
}*/

class Teacher(var name: String){
    var id: Int = 0
    init {
        println("My name is $name")
    }
    //secondary constructor
    constructor(n: String, id: Int): this(n){
        this.id = id
        this.name = n
    }

    override fun toString(): String {
        return "Teacher(name='$name', id=$id)"
    }


}




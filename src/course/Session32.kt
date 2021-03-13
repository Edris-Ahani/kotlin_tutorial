package course

fun main() {
    var student = Student()
    println(student.hasPassed(57))
    println(student.isScholar(57))

    val str1:String = "Hello "
    val str2:String = "World"

    var str3:String = "Hey "

    println(str3.add(str1, str2))

    var a:Int = 2
    var b:Int = 6
    println(a.greaterValue(b))
}

fun Int.greaterValue(other: Int): Int{
    if(this>other)
        return this
    else
        return other
}

fun String.add(s1: String, s2: String): String{
    return this + s1 + s2
}

//EXTENSION FUNCTIONS
fun Student.isScholar(marks: Int):Boolean{
    return marks > 95
}

class Student{
    fun hasPassed(marks: Int): Boolean{
        return marks > 40
    }
}
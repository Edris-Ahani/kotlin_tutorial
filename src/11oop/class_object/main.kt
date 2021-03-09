package `11oop`.class_object

fun main(args: Array<String>){

    class Teacher{   // class header
        // property
        // member function
    }

    class Student constructor(){   // class header
        // property
        // member function
    }

    var obj = Account();
    obj.accNo = 10
    obj.amount = 22.55f
    obj.name = "edris"
    println(obj.toString())

    var acc= Account()
    acc.insert(832345,"Edris",1000f) //accessing member function
    println("${acc.name}") //accessing class property
}
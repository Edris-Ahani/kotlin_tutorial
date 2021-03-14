package course

fun main() {

    var myUser1 = MyUser("Edris", 1)
    var myUser2 = MyUser("Edris", 1)
    println(myUser1)
    println(myUser2)
    if(myUser1 == myUser2){
        println("Equal")
    }
    else{
        println("Not Equal")
    }
    var newMyUser1 = myUser1.copy()
    println(newMyUser1)
    var newMyUser2 = myUser1.copy(name = "Arash")
    println(newMyUser2)
}

data class MyUser(var name: String, var id: Int){

}
package course
// LIST and ARRAYLIST
fun main() {
    var list = listOf<String>("Arash", "Edris", "Aria", "Arman")    //Immutable Fixed Size, Read Only

    for (element in list){
        println(element)
    }

    for(index in 0..list.size -1){
        println("list[$index]: ${list[index]}")
    }
    println()

    //var list1 = mutableListOf<String>("Arash", "Edris", "Aria", "Arman")    //mutable, No Fixed Size, Can add or remove elements
    var list1 = arrayListOf<String>("Arash", "Edris", "Aria", "Arman")    //mutable, No Fixed Size, Can add or remove elements
    list1.add("Modi")
    list1.removeAt(2)
    list1.remove("Edris")
    list1.add(0, "Ali")
    list1[3] = "John"
    for (element in list1){
        println(element)
    }

    for(index in 0..list1.size -1){
        println("list[$index]: ${list1[index]}")
    }
    println()

    var list2 = ArrayList<String>()   //mutable, No Fixed Size, Can add or remove elements
    list2.add("Edris")
    list2.add("Modi")
    list2.remove("Modi")
    for (element in list2){
        println(element)
    }
}

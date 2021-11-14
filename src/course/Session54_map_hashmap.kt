package course
// MAP and HASH MAP
fun main() {
    var myMap = mapOf<String, String>("name" to "Edris", "age" to "31")   //Immutable Fixed Size, Read Only

    for (element in myMap){
        println("${element.key}: ${element.value}")
    }
    println()

    for (key in myMap.keys){
        println("$key: ${myMap[key]}")
        println("$key: ${myMap.get(key)}")
    }
    println()

    //var myHashMap = hashMapOf<String, String>("name" to "Edris")   //mutable, No Fixed Size, read and wright both
    //var myHashMap = mutableMapOf<String, String>("name" to "Edris")   //mutable, No Fixed Size, read and wright both
    var myHashMap = hashMapOf<String, String>("name" to "Edris")   //mutable, No Fixed Size, read and wright both
    myHashMap["color"] = "Red"
    myHashMap.put("age", "31")
    myHashMap.replace("name", "Aria")
    for (key in myHashMap.keys){
        println("$key: ${myHashMap[key]}")
    }
    println()

}

package course.session38

fun main() {
    var animals = Animals()
    animals.color = "white"
    animals.eat()

    var dog = Dog()
    dog.breed = "pitbull"
    dog.color = "black"
    dog.eat()
    dog.bark()

    var cat = Cat()
    cat.color = "gray"
    cat.age = 7
    cat.eat()
    cat.meow()
}
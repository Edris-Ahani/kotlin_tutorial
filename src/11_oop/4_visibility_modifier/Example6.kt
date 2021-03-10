package `11_oop`.`4_visibility_modifier`

open class Base2() {
    var a = 1 // public by default
    private var b = 2 // private to Base class
    protected open val c = 3  // visible to the Base and the Derived class
    internal val d = 4 // visible inside the same module
    protected fun e() { } // visible to the Base and the Derived class
}

class Derived1: Base2() {
    // a, c, d, and e() of the Base class are visible
    // b is not visible
    override val c = 9 // c is protected
}

fun main(args: Array<String>) {
    val base = Base2()
    // base.a and base.d are visible
    // base.b, base.c and base.e() are not visible
    val derived = Derived1()
    // derived.c is not visible
}
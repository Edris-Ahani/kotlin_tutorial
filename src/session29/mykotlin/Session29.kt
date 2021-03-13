@file:JvmName("MyCustomKotlinFileName")
package session29.mykotlin

import session29.myjava.MyJavaFile

fun main() {
    var area = MyJavaFile.getArea(4, 5)
    print(area)
}

fun add1(a: Int, b: Int): Int{
    return  a+b
}

@JvmOverloads
fun findVolume(length: Int, breadth: Int, height: Int = 10): Int{
    return length * breadth * height;
}
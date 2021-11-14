package course

import java.math.BigInteger

fun main() {
    print(getFibonacciNumber(2000000, BigInteger("0"), BigInteger("1")))
}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger):BigInteger{
    if(n==0)
        return b
    else
        return getFibonacciNumber(n-1, a+b , a)
}
package `11oop`.class_object

class Account {
    var accNo: Int = 0
    var name: String? = null
    var amount: Float = 0f

    fun insert(ac: Int,n: String, am: Float ) {
        accNo=ac
        name=n
        amount=am
        println("Account no: ${accNo} holder :${name} amount :${amount}")
    }

    fun deposit() {
        //deposite code
    }

    fun withdraw() {
        // withdraw code
    }

    fun checkBalance() {
        //balance check code
    }

    override fun toString(): String {
        return "Account(accNo=$accNo, name=$name, amount=$amount)"
    }

}
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

    var obj = Account();
    obj.accNo = 10
    obj.amount = 22.55f
    obj.name = "edris"
    println(obj.toString())

    var acc= Account()
    acc.insert(832345,"Edris",1000f) //accessing member function
    println("${acc.name}") //accessing class property
}
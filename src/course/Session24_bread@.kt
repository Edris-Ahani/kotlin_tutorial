package course

fun main() {
    /*for(i in 1..3){
        for(j in 1..3){
            println("$i, $j")
            if(i == 2 && j==2){
                break
            }
        }
    }*/

    myloop@for(i in 1..3){
         for(j in 1..4){
            println("$i, $j")
            if(i == 2 && j==2){
                break
            }
        }
    }

    println("++++++++++++++++++++++++++++++++++++++++++++++++++++")

    myloop@for(i in 1..3){
        for(j in 1..4){
            println("$i, $j")
            if(i == 2 && j==2){
                break@myloop
            }
        }
    }
}
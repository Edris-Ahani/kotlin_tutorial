package course

fun main() {
    /*for(i in 1..3){
        for(j in 1..3){
            if(i == 2 && j==2){
                continue
            }
            println("$i, $j")
        }
    }*/

    myloop@for(i in 1..3){
         for(j in 1..4){
            if(i == 2 && j==2){
                continue@myloop
            }
             println("$i, $j")
        }
    }
}
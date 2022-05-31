package flowControl

fun main(){
    for(i in 0..5){
        if(i == 2){
            break;
        }
        println(i)
    }

    println()

    for(i in 0..5){
        if(i == 2){
            continue;
        }
        println(i)
    }
}
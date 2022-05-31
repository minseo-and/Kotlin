package flowControl

fun main(){
    awd@for(i in 0..10){
        for(j in 0..10){
            if(i ==0 && j == 3){
                break@awd //awd가 붙어있는 for문이 break
            }
            println("$i, $j")
        }
    }
}
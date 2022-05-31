package `class`.abstract

fun main(){
    var a = Rabbit()
    a.eat()
    a.sniff()
}

abstract class Animal{
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class Rabbit : Animal(){
    override fun eat() {
        println("awd")
    }
}
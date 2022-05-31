package `class`.`interface`

fun main(){
    val a = Dog(1)
    a.eat()
    a.run()
}

interface Runner{
    fun run()
}
interface Eater{
    fun eat(){
        println("awd")
    }
}
class Dog(var a: Int) : Runner, Eater{
    override fun run() {
        println("run")
    }

    override fun eat() {
        println("eat")
    }
}
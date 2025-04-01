import kotlin.random.Random

enum class Daysofweek {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;
    fun Names() = Daysofweek.values().asList()
    fun Search() {
        var num = readln().toInt()
        when(num){
            0-> println(Daysofweek.Monday)
            1-> println(Daysofweek.Tuesday)
            2-> println(Daysofweek.Wednesday)
            3-> println(Daysofweek.Thursday)
            4-> println(Daysofweek.Friday)
            5-> println(Daysofweek.Saturday)
            6-> println(Daysofweek.Sunday)
            else-> println("такого дня недели нет")


        }
    }
    fun Rand(){

        when(Random.nextInt(0,6)){
            0-> println(Daysofweek.Monday)
            1-> println(Daysofweek.Tuesday)
            2-> println(Daysofweek.Wednesday)
            3-> println(Daysofweek.Thursday)
            4-> println(Daysofweek.Friday)
            5-> println(Daysofweek.Saturday)
            6-> println(Daysofweek.Sunday)
            else-> println("такого дня недели нет")


        }
    }
    fun Par(){
        println("сколько пар прошло ?")
        var count = readln().toInt()
        when{
            count<12->println("прошло примерно 3 дня с начала недели")
            count>12 &&count<20->println("прошло больше 3 дней")
            else->
                   println("прошла неделя")
        }
    }
}
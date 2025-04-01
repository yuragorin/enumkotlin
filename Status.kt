enum class Status {
    Готово,
    почти,
    не_готово;
    fun Info()=Status.values().asList()
    fun Ready(num:Double){
     if(num>30){
         println("блюдо готово")
     }
        else{
            println("еще не готово")
     }
    }
    fun Time(time:Int){
        println("сколько времени")
        var t = readln().toInt()
        if(time>t){
            println("заказ еще не пришел"+(time-t)+" придет через это время")
        }
        else{
            println("заказ пришел"+(t-time)+" времени назад")
        }
    }
    fun Otvet(){
        println("состояние заказа")
        var num = readln().toInt()
        when(num){
            Готово.ordinal-> println("готово")
            почти.ordinal-> println("почти")
            не_готово.ordinal-> println("не готово")
        }

    }
}
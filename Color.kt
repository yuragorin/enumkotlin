enum class Color {
    red,
    green,
    yellow,
    blue;
    fun Plus(num1:Int,num2:Int){
        var text = Color.red
        if(num1==Color.red.ordinal && num2==Color.blue.ordinal){
            println("фиолетовый")

        }
        if(num1==Color.yellow.ordinal && num2==Color.blue.ordinal){
            println("зеленый")

        }
        if(num1==Color.red.ordinal && num2==Color.yellow.ordinal){
            println("оранжевый")

        }

    }
    fun Info()=Color.values().asList()
    fun Price(num:Int){
         if(num==red.ordinal){
             println("спелый фрукт")
         }
        if(num==green.ordinal){
            println("полуспелый фрукт")
        }
        if(num==yellow.ordinal){
            println("неспелый фрукт")
        }

    }
    fun Ask(){
        println("какого цвета трава?")
        var otv = readln().toInt()
        if(otv==green.ordinal){
            println("верно")
        }
        else{
            println("неправильно")
        }
    }



}
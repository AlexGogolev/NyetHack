fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    //Аура
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
//    if (auraVisible){
//        println("GREEN")
//    }
//    else {
//        println("NONE")
//    }
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    println(auraColor)

//    if (healthPoints == 100){
//        println("$name is in excellent condition!")
//    }
//    else if (healthPoints >= 90) {
//        println("$name has a few scratches.")
//    }
//    else if (healthPoints >= 75) {
//        if (isBlessed){
//            println("$name has some minor wounds but is healing quite quickly!")
//        } else {
//            println("$name has some minor wounds.")
//        }
////        println("$name has some minor wounds.")
//    }
//    else if (healthPoints >= 15) {
//        println("$name looks pretty hurt.")
//    }
//    else{
//        println("$name is in awful condition!")
//    }

//    if (healthPoints == 100) println("$name is in excellent condition!")
//    else if (healthPoints >= 90) println("$name has a few scratches.")
//    else if (healthPoints >= 75) println("$name has some minor wounds.")
//    else if (healthPoints >= 15) println("$name looks pretty hurt.")
//    else println("$name is in awful condition!")


//    if (healthPoints == 100) println("$name is in excellent condition!")
//    else println("$name is in awful condition!")

    val healthStatus = if (healthPoints == 100) "$name is in excellent condition!"
        //else if (healthPoints >= 90) "$name has a few scratches."
        else if (healthPoints in 90..99) "$name has a few scratches."
        //else if (healthPoints >= 75)
        else if (healthPoints in 75..89)
            if (isBlessed) "$name has some minor wounds but is healing quite quickly!"
            else "$name has some minor wounds."
    //        println("$name has some minor wounds.")
        //else if (healthPoints >= 15) "$name looks pretty hurt."
        else if (healthPoints in 15..74) "$name looks pretty hurt."
        else "$name is in awful condition!"

    //Состояние игрока
    println("$name $healthStatus")


}
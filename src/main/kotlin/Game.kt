fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 77
    val isBlessed = true
    val isImmortal = false
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    //    println(auraColor)

    //region Description
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

//    val healthStatus = if (healthPoints == 100) "$name is in excellent condition!"
//        //else if (healthPoints >= 90) "$name has a few scratches."
//        else if (healthPoints in 90..99) "$name has a few scratches."
//        //else if (healthPoints >= 75)
//        else if (healthPoints in 75..89)
//            if (isBlessed) "$name has some minor wounds but is healing quite quickly!"
//            else "$name has some minor wounds."
//    //        println("$name has some minor wounds.")
//        //else if (healthPoints >= 15) "$name looks pretty hurt."
//        else if (healthPoints in 15..74) "$name looks pretty hurt."
//        else "$name is in awful condition!"
    //endregion

    val healthStatus = formatHealthStatus(healthPoints, name, isBlessed)

//    val statusFormatString = "(HP: $healthPoints)(Aura: $auraColor) -> $healthStatus"
//    println(statusFormatString)
    //Состояние игрока
    printPlayerStatus(auraColor, isBlessed, healthStatus)

    //region test_pattern_str_if
//    println("***********")
//    println("aaa ${if (1==2) "1" else "2"}")
    //endregion region test_pattern_str_if

    //region test_when
    val race = "gnome"
    val faction = when (race){
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> {}
    }
    //endregion test_when

    castFireball(5)
    castFireball()
}

private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, healthStatus: String) {
    println("(AuraColor: $auraColor) " + "(Blessed: ${if (isBlessed) "YES" else "NONE"})")
    println("$healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    //Аура
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    //region old_condition_auraVisible
//    if (auraVisible){
//        println("GREEN")
//    }
//    else {
//        println("NONE")
//    }
    //endregion old_condition_auraVisible
    val auraColor = "${if (auraVisible) "GREEN" else "NONE"}"
    return auraColor
}

private fun formatHealthStatus(healthPoints: Int, name: String, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "$name is in excellent condition!"
        in 90..99 -> "$name has a few scratches."
        in 75..89 ->
            if (isBlessed) "$name has some minor wounds but is healing quite quickly!"
            else "$name has some minor wounds."
        in 15..74 -> "$name looks pretty hurt."
        else -> {
            "$name is in awful condition!"
        }
    }
//    return healthStatus


private fun castFireball(numFireballs: Int = 2) =
    println("A glass of Fireball springs into existence. (x$numFireballs)")

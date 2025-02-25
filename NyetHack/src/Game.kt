fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    /*
    val healthStatus = if (healthPoints == 100) {
        "is in excellent condition!"
    } else if (healthPoints in 90..99) {
        "has a few scratches."
    } else if (healthPoints in 75..89) {
        if (isBlessed){
            "has some wounds but is healing quite quickly!"
        } else {
            "has some minor wounds"
        }
    } else if (healthPoints in 15..74) {
        "looks pretty hurt."
    } else {
        "is in awful condition!"
    }
    println("$name $healthStatus")
    */

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
    //castFireball(5)
    castFireball()
}

private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
    println("(Aura: $auraColor) (Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val aurVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (aurVisible) "GREEN" else "NONE"
    return auraColor
}

/* standard function
private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds"
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
    return healthStatus
}
*/

// single-expression function
private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
     when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds"
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

private fun castFireball(numFireballs: Int = 2){
    println("A glass of Fireball springs into existence. (x$numFireballs)")
}
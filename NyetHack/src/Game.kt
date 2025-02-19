fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    val aurVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (aurVisible) "GREEN" else "NONE"
    //println(auraColor)
    println("(Aura: $auraColor) (Blessed: ${if (isBlessed) "YES" else "NO"})")

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
    println("$name $healthStatus")
}
const val MAX_EXPERIENCE: Int = 5000

fun main(args: Array<String>) {
    // this variable CANNOT be modified (aka immutable)
    val playerName: String = "Estragon"
    // this variable CAN be modified (aka mmutable)
    var experiencePoints: Int = 5
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
}
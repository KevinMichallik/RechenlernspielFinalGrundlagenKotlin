class RechnungAddition(calcRange1: IntRange = 1..50, calcRange2: IntRange = 1..50)
    : Rechnung(calcRange1, calcRange2) {


    fun calcAddition() {

        val add1 = calcRange1.random()
        val add2 = calcRange2.random()
        val result = add1 + add2


        println("$add1 + $add2")
        println("Tippe dein Ergebnis ein:")

        val resultPlayer = safeReadInt()
        Thread.sleep(1_000)
        win = false
        if (resultPlayer == result) {
            win = true
            println("Super weiter so!!")
            println()

        } else {
            println("Leider falsch.")
            println()
        }
    }
}
class RechnungDivision(calcRange1: IntRange = 10..10, calcRange2: IntRange = 10..10) :
    Rechnung(calcRange1, calcRange2) {

    init {
        this.calcRange1 = 1..10
        this.calcRange2 = 1..10
    }

    fun calcDivision() {

        val calcNumber1 = calcRange1
        val calcNumber2 = calcRange2


        val add1 = calcNumber1.random()
        val add2 = calcNumber2.random()
        val result1 = add1 * add2
        val result2 = result1 / add2


        println("$result1 / $add2")
        println("Tippe dein Ergenis ein:")

        var resultPlayer = safeReadInt()
        win = false
        Thread.sleep(1_000)
        if (resultPlayer == result2) {
            win = true
            println("Super weiter so!!")
            println()

        } else {
            println("Leider falsch.")
            println()
        }
    }
}

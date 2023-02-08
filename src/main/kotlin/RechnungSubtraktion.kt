class RechnungSubtraktion(calcRange1: IntRange = 50..100, calcRange2: IntRange = 1..49) :
    Rechnung(calcRange1, calcRange2) {

    init {
        this.calcRange1 = 50..100
        this.calcRange2 = 1..49
    }

    fun calcSubtraktion() {

        val calcNumber1 = calcRange1
        val calcNumber2 = calcRange2


        val add1 = calcNumber1.random()
        val add2 = calcNumber2.random()
        val result = add1 - add2


        println("$add1 - $add2")
        println("Tippe dein Ergebnis ein:")
        win = false

        var resultPlayer = safeReadInt()
        Thread.sleep(1_000)
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
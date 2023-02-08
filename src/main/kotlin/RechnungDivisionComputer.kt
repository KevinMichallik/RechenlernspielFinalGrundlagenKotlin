class RechnungDivisionComputer(calcRange1: IntRange = 10..10, calcRange2: IntRange = 10..10) :
    Rechnung(calcRange1, calcRange2) {

    init {
        this.calcRange1 = 10..10
        this.calcRange2 = 10..10
    }

    fun calcDivision() {

        var calcNumber1 = calcRange1
        var calcNumber2 = calcRange2


        var add1 = calcNumber1.random()
        var add2 = calcNumber2.random()
        var result1 = add1 * add2
        var result2 = result1 / add2


        println("$result1 / $add2")


        var resultPlayer = (result2 - 2..result2 + 2).random()
        win = false

        println("Das Ergebnis des Computers ist: $resultPlayer")

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
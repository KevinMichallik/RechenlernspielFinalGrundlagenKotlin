class RechnungMultiplikationComputer(calcRange1: IntRange = 10..10, calcRange2: IntRange = 10..10) :
    Rechnung(calcRange1, calcRange2) {

    init {
        this.calcRange1 = 10..10
        this.calcRange2 = 10..10
    }

    fun calcMultiplikation() {

        var calcNumber1 = calcRange1
        var calcNumber2 = calcRange2


        var add1 = calcNumber1.random()
        var add2 = calcNumber2.random()
        var result = add1 * add2


        println("$add1 * $add2")


        var resultPlayer = (result - 2..result + 2).random()

        println("Das Ergebnis des Computers ist: $resultPlayer")

        if (resultPlayer == result) {
            win = true
            println("Super weiter so!!")

        } else
            println("Leider falsch.")
    }
}
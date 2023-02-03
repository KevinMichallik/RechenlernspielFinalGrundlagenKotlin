class RechnungMultiplikationComputer(calcRange1: IntRange = 1..10, calcRange2: IntRange = 1..10) :
    Rechnung(calcRange1, calcRange2) {


    fun calcMultiplikation() {

        var calcNumber1 = calcRange1.random()
        var calcNumber2 = calcRange2.random()


        var add1 = calcNumber1
        var add2 = calcNumber2
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
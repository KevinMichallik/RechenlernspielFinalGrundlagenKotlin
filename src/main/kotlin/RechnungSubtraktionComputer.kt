class RechnungSubtraktionComputer(calcRange1: IntRange = 50..100, calcRange2: IntRange = 1..49) :
    Rechnung(calcRange1, calcRange2) {


    fun calcSubtraktion() {

        val calcNumber1 = calcRange1.random()
        val calcNumber2 = calcRange2.random()


        val add1 = calcNumber1
        val add2 = calcNumber2
        val result = add1 - add2


        println("$add1 - $add2")


        val resultPlayer = (result - 2..result + 2).random()
        win = false

        println("Das Ergenis des Computers ist: $resultPlayer")

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
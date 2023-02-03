class RechnungAdditionComputer(calcRange1: IntRange = 1..50, calcRange2: IntRange = 1..50) :
    Rechnung(calcRange1, calcRange2) {


    fun calcAddition() {

        val calcNumber1 = calcRange1.random()
        val calcNumber2 = calcRange2.random()


        val add1 = calcNumber1
        val add2 = calcNumber2
        val result = add1 + add2


        println("$add1 + $add2")


        var resultPlayer = (result - 2..result + 2).random()

        println("Das Ergenis des Computers ist: $resultPlayer")

        if (resultPlayer == result) {
            win = true
            println("Super weiter so!!")

        } else
            println("Leider falsch.")
    }
}
class RechnungSubtraktionComputer (calcRange1: IntRange = 50..100, calcRange2: IntRange = 1..49) :
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


        val resultPlayer = (result - 2..result + 2).random()

        println("Das Ergenis des Computers ist: $resultPlayer")

        if (resultPlayer == result) {
            win = true
            println("Super weiter so!!")

        } else
            println("Leider falsch.")
    }
}
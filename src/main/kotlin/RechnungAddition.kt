class RechnungAddition(calcRange1: IntRange = 1..50, calcRange2: IntRange = 1..50) : Rechnung(calcRange1, calcRange2) {

    init {
        this.calcRange1 = 1..50
        this.calcRange2 = 1..50
    }

    fun calcAddition() {

        val calcNumber1 = calcRange1
        val calcNumber2 = calcRange2


        val add1 = calcNumber1.random()
        val add2 = calcNumber2.random()
        val result = add1 + add2


        println("$add1 + $add2")
        println("Tippe dein Ergenis ein:")

        val resultPlayer = readln().toInt()
        Thread.sleep(1_000)
        if (resultPlayer == result) {
            win = true
            println("Super weiter so!!")

        } else
            println("Leider falsch.")

    }

}
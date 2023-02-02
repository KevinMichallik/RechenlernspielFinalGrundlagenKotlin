class RechnungMultiplikation(calcRange1: IntRange = 10..10, calcRange2: IntRange = 10..10) :
    Rechnung(calcRange1, calcRange2) {

    init {
        this.calcRange1 = 1..10
        this.calcRange2 = 1..10
    }

    fun calcMultiplikation() {

        var calcNumber1 = calcRange1
        var calcNumber2 = calcRange2


        var add1 = calcNumber1.random()
        var add2 = calcNumber2.random()
        var result = add1 * add2


        println("$add1 * $add2")
        println("Tippe dein Ergenis ein:")

        var resultPlayer = readln().toInt()
        Thread.sleep(1_000)
        if (resultPlayer == result) {
            win = true
            println("Super weiter so!!")

        } else
            println("Leider falsch.")
    }
}
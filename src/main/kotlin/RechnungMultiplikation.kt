class RechnungMultiplikation(calcRange1: IntRange = 1..10, calcRange2: IntRange = 1..10) :
    Rechnung(calcRange1, calcRange2) {


    fun calcMultiplikation() {

        var calcNumber1 = calcRange1.random()
        var calcNumber2 = calcRange2.random()


        var add1 = calcNumber1
        var add2 = calcNumber2
        var result = add1 * add2


        println("$add1 * $add2")
        println("Tippe dein Ergenis ein:")

        var resultPlayer = safeReadInt()
        win = false
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
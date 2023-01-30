open class Player(
    var name: String = "",
    var age: Int = 0,
    var score: Int = 0,
    var win: Boolean = false
) {

    open fun addition() {

        var zahl1 = 1..50
        var zahl2 = 1..50


        var add1 = zahl1.random()
        var add2 = zahl2.random()
        var ergebnis = add1 + add2


        println(" Bitte Rechne folgendes: $add1 + $add2")
        println("Tippe dein Ergebnis ein:")

        var ergebnisPlayer = readln().toInt()

        if (ergebnisPlayer == ergebnis) {
            win = true
            println("Super weiter so!!")


        } else
            println("Leider falsch.")


    }
}




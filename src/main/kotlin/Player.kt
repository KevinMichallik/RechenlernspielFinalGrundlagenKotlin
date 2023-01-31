open class Player(
    var name: String = "",
    var age: Int = 0,
    var score: Int = 0,
    var win: Boolean = false
) {

    open fun addition() {

        var adzahl1 = 1..50
        var adzahl2 = 1..50


        var add1 = adzahl1.random()
        var add2 = adzahl2.random()
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

    open fun subtraktion() {

        var subzahl1 = 50..100
        var subzahl2 = 1..49


        var add1 = subzahl1.random()
        var add2 = subzahl2.random()
        var ergebnis = add1 - add2


        println(" Bitte Rechne folgendes: $add1 - $add2")
        println("Tippe dein Ergebnis ein:")

        var ergebnisPlayer = readln().toInt()

        if (ergebnisPlayer == ergebnis) {
            win = true
            println("Super weiter so!!")


        } else
            println("Leider falsch.")


    }

    open fun multiplikation(){

        var mulzahl1 = 1..50
        var mulzahl2 = 1..50


        var add1 = mulzahl1.random()
        var add2 = mulzahl2.random()
        var ergebnis = add1 * add2


        println(" Bitte Rechne folgendes: $add1 * $add2")
        println("Tippe dein Ergebnis ein:")

        var ergebnisPlayer = readln().toInt()

        if (ergebnisPlayer == ergebnis) {
            win = true
            println("Super weiter so!!")


        } else
            println("Leider falsch.")


    }







}





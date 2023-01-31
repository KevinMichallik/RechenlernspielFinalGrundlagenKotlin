open class PlayerComputer(name: String = "", age: Int = 0) : Player(name, age, win = false) {

    val nameList = mutableListOf<String>("Peter", "Paul", "Tina")
    val ageList = 6..99


    init {
        this.name = nameList.random()
        this.age = ageList.random()

    }

    open fun additionComputer() {

        var adzahl1 = 1..50
        var adzahl2 = 1..50


        var add1 = adzahl1.random()
        var add2 = adzahl2.random()
        var ergebnis = add1 + add2
        var ergebnisComputer = mutableListOf<Int>(ergebnis, 52, 8, 6, 75, 88, 23, 41, 3, 88).random()

        println("$add1 + $add2 = $ergebnisComputer")

        if (ergebnis == ergebnisComputer) {
            this.win = true
            println("Der Computer hat richtig gerechnet")

        } else println("Der Computer lag falsch.")


    }

    open fun subtraktionComputer(){


            var subzahl1 = 50..100
            var subzahl2 = 1..49


            var add1 = subzahl1.random()
            var add2 = subzahl2.random()
            var ergebnis = add1 - add2
            var ergebnisComputer = mutableListOf<Int>(ergebnis, 52, 8, 6, 75, 88, 23, 41, 3, 88).random()

            println("$add1 - $add2 = $ergebnisComputer")

            if (ergebnis == ergebnisComputer) {
                this.win = true
                println("Der Computer hat richtig gerechnet")

            } else println("Der Computer lag falsch.")


        }

    open fun multiplikationComputer(){

        var mulzahl1 = 1..10
        var mulzahl2 = 1..10


        var add1 = mulzahl1.random()
        var add2 = mulzahl2.random()
        var ergebnis = add1 * add2
        var ergebnisComputer = mutableListOf<Int>(ergebnis, 52, 8, 6, 75, 88, 23, 41, 3, 88).random()

        println("$add1 * $add2 = $ergebnisComputer")

        if (ergebnis == ergebnisComputer) {
            this.win = true
            println("Der Computer hat richtig gerechnet")

        } else println("Der Computer lag falsch.")


    }


}










open class PlayerComputer(name: String = "", age: Int = 0) : Player(name, age, win = false) {

    val nameList = mutableListOf<String>("Peter", "Paul", "Tina")
    val ageList = 6..99


    init {
        this.name = nameList.random()
        this.age = ageList.random()

    }

    open fun additionComputer() {

        var zahl1 = 1..50
        var zahl2 = 1..50


        var add1 = zahl1.random()
        var add2 = zahl2.random()
        var ergebnis = add1 + add2
        var ergebnisComputer = mutableListOf<Int>(ergebnis, 52, 8, 6, 75, 88, 23, 41, 3, 88).random()

        println("$add1 + $add2 = $ergebnisComputer")

        if (ergebnis == ergebnisComputer) {
            this.win = true
            println("Der Computer hat richtig gerechnet")

        } else println("Der Computer lag falsch.")


    }
}






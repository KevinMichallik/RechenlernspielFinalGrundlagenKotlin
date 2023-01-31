open class PlayerComputer(name: String = "", age: Int = 0) : Player(name, age, win = false) {

    val nameList = mutableListOf<String>("C3-PO", "JARVIS", "STORM-TROOPER", "WALL-E", "R2D2")
    val ageList = 6..99


    init {
        this.name = nameList.random()
        this.age = ageList.random()

    }

    open fun additionComputer() {

        var calcNumber1 = 1..50
        var calcNumber2 = 1..50


        var add1 = calcNumber1.random()
        var add2 = calcNumber2.random()
        var result = add1 + add2
        var resultComputer = (result -3.. result +3).random()

        println("$add1 + $add2 = $resultComputer")

        if (result == resultComputer) {
            this.win = true
            println("Der Computer hat richtig gerechnet")

        } else println("Der Computer lag falsch.")


    }

    open fun subtraktionComputer(){


            var calcNumber1 = 50..100
            var calcNumber2 = 1..49


            var add1 = calcNumber1.random()
            var add2 = calcNumber2.random()
            var result = add1 - add2
            var resultComputer = (result -3..result +3).random()

            println("$add1 - $add2 = $resultComputer")

            if (result == resultComputer) {
                this.win = true
                println("Der Computer hat richtig gerechnet")

            } else println("Der Computer lag falsch.")


        }

    open fun multiplikationComputer(){

        var calcNumber1 = 1..10
        var calcNumber2 = 1..10


        var add1 = calcNumber1.random()
        var add2 = calcNumber2.random()
        var result = add1 * add2
        var resultComputer = (result -3 .. result +3).random()

        println("$add1 * $add2 = $resultComputer")

        if (result == resultComputer) {
            this.win = true
            println("Der Computer hat richtig gerechnet")

        } else println("Der Computer lag falsch.")


    }

    // TODO Division hinzufügen


}










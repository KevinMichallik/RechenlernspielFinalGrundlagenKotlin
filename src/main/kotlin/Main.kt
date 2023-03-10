import java.time.Duration
import java.time.LocalTime

fun main() {

    // Spieler & Rechenarten
    val player1: Player = Player()
    val player2: Player = Player()
    val addition: RechnungAddition = RechnungAddition()
    val subtraktion: RechnungSubtraktion = RechnungSubtraktion()
    val multiplikation: RechnungMultiplikation = RechnungMultiplikation()
    val division: RechnungDivision = RechnungDivision()

    // Computer & Rechenarten
    val computer: PlayerComputer = PlayerComputer()
    val additionComputer: RechnungAdditionComputer = RechnungAdditionComputer()
    val subtraktionComputer: RechnungSubtraktionComputer = RechnungSubtraktionComputer()
    val multiplikationComputer: RechnungMultiplikationComputer = RechnungMultiplikationComputer()
    val divisionComputer: RechnungDivisionComputer = RechnungDivisionComputer()

    // Variablen für den Spielablauf
    var lapCounter = 1
    var roundQuantity = 10
    var playerQuantity: Int = 0
    var calculationType = 0
    var spielende: Int

    // Begrüßung
    println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
    println("+ Hallo und Willkommen im Rechenlernspiel!!                                                       +")
    println("+-------------------------------------------------------------------------------------------------+")
    println("+                                                                                                 +")

    // Anzahl der Spieler muss angegeben werden und die Daten der Spieler

    println("+ Bitte gib an, ob du alleine üben möchtest, oder ob Ihr zu zweit lernen möchtet.                 +")
    println("+ Tipp die 1 für alleine gegen den Computer spielen, oder die 2 wenn ihr gemeinsam lernen wollt:  +")
    println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
    println()
    playerQuantity = safeReadInt()

    while (playerQuantity < 1 || playerQuantity > 2) {
        println("Bitte gib eine gültige Zahl ein.:")
        playerQuantity = safeReadInt()
    }

    fun spielerAnlegen() {

        if (playerQuantity == 1) {

            println("Bitte gib deinen Namen ein:")
            player1.name = readln()
            println("Bitte gib dein Alter ein:")
            player1.age = safeReadInt()

        }
        if (playerQuantity == 2) {

            println("Bitte gib deinen Namen ein:")
            player1.name = readln()
            println("Bitte gib dein alter ein:")
            player1.age = safeReadInt()


            println("Bitte gib den Namen des 2. Spielers ein:")
            player2.name = readln()
            println("Bitte gib das Alter von Spieler 2 ein:")
            player2.age = safeReadInt()
        }
    }
    spielerAnlegen()

    // Auswahl der Rundenanzahl pro Spiel
    Thread.sleep(2000)
    println()
    println("Wie viele Aufgaben soll die Spielrunde haben? Gib bitte eine Zahl ein:")

    roundQuantity = safeReadInt()

    // Auswahl der Rechenart
    fun calculationType() {
        println()
        println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +")
        println("+ Jetzt ist es an der Zeit zu entscheiden was gerechnet werden soll.  +")
        println("+ Folgendes steht zur Auswahl:                                        +")
        println("+ 1. - Addition                                                       +")
        println("+ 2. - Subtraktion                                                    +")
        println("+ 3. - Multiplikation                                                 +")
        println("+ 4. - Division                                                       +")
        println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +")
        println()
        Thread.sleep(1_000)
        println("Bitte wähle die Rechenart aus und gib die entsprechende Zahl ein:")
        calculationType = safeReadInt()

        while (calculationType < 1 || calculationType > 4) {
            println("Bitte gib eine gültige Zahl zwischen 1 & 4 ein.:")
            calculationType = safeReadInt()
        }

        Thread.sleep(1_000)

    }
    calculationType()


    // Start der Aufgaben
    fun additionInGame() {

        if (playerQuantity == 1) {

            do {
                println("${player1.name} bitte rechne:")
                addition.calcAddition()
                if (addition.win) player1.score++
                Thread.sleep(1_000)

                println("${computer.name} rechnet jetzt:")
                additionComputer.calcAddition()
                Thread.sleep(1_000)
                if (additionComputer.win) computer.score++

                lapCounter++

            } while (lapCounter <= roundQuantity)

            println()
            println("Du hast ${player1.score} Punkte und der Computer hat ${computer.score}.")
            println()
            Thread.sleep(1_000)
            if (player1.score == computer.score) println("Das spiel ging unentschieden aus.")
            if (player1.score > computer.score) println("Du hast gewonnen!! Tolle Leistung für eine/n ${player1.age} jährige/n !")
            if (player1.score < computer.score) println("${computer.name} hat gewonnen")
            Thread.sleep(1_000)
        }


        if (playerQuantity == 2) {

            do {
                println("${player1.name} bitte rechne:")
                addition.calcAddition()
                if (addition.win) player1.score++

                println("${player2.name} bitte rechne: ")
                addition.calcAddition()
                if (addition.win) player2.score++

                lapCounter++

            } while (lapCounter <= roundQuantity)

            println()
            println("${player1.name} hat ${player1.score} Punkte und ${player2.name} hat ${player2.score}.")
            println()
            Thread.sleep(1_000)
            if (player1.score == player2.score) println("Das Spiel ging unentschieden aus.")
            if (player1.score > player2.score) println("${player1.name} hat gewonnen!! Tolle Leistung für eine/n ${player1.age} jährige/n !")
            if (player1.score < player2.score) println("${player2.name} hat gewonnen! Tolle Leistung für eine/n ${player2.age} jährige/n !")
            Thread.sleep(1_000)
        }
    }

    fun subtraktionInGame() {

        if (playerQuantity == 1) {

            do {
                println("${player1.name} bitte rechne:")
                subtraktion.calcSubtraktion()
                if (subtraktion.win) player1.score++
                Thread.sleep(1_000)

                println("${computer.name} rechnet jetzt:")
                subtraktionComputer.calcSubtraktion()
                if (subtraktionComputer.win) computer.score++
                Thread.sleep(1_000)

                lapCounter++
            } while (lapCounter <= roundQuantity)   // Anzahl der Runden vorgeben!!

            println()
            println("Du hast ${player1.score} Punkte und der Computer hat ${computer.score}.")
            println()
            Thread.sleep(1_000)
            if (player1.score == computer.score) println("Das spiel ging unentschieden aus.")
            if (player1.score > computer.score) println("Du hast gewonnen!! Tolle Leistung für eine/n ${player1.age} jährige/n !")
            if (player1.score < computer.score) println("${computer.name} hat gewonnen")
            Thread.sleep(1_000)
        }


        if (playerQuantity == 2) {

            do {
                println("${player1.name} bitte rechne:")
                subtraktion.calcSubtraktion()
                if (subtraktion.win) player1.score++
                Thread.sleep(1_000)

                println("${player2.name} bitte rechne:")
                subtraktion.calcSubtraktion()
                if (subtraktion.win) player2.score++
                Thread.sleep(1_000)

                lapCounter++
            } while (lapCounter <= roundQuantity)   // Anzahl der Runden vorgeben!!

            println()
            println("${player1.name} hat ${player1.score} Punkte und ${player2.name} hat ${player2.score}.")
            println()
            Thread.sleep(1_000)
            if (player1.score == player2.score) println("Das Spiel ging unentschieden aus.")
            if (player1.score > player2.score) println("${player1.name} hat gewonnen!! Tolle Leistung für eine/n ${player1.age} jährige/n !")
            else println("${player2.name} hat gewonnen! Tolle Leistung für eine/n ${player2.age} jährige/n !")
            Thread.sleep(1_000)
        }
    }

    fun multiplikationInGame() {

        if (playerQuantity == 1) {

            do {
                println("${player1.name} bitte rechne:")
                multiplikation.calcMultiplikation()
                if (multiplikation.win) player1.score++
                Thread.sleep(1_000)

                println("${computer.name} rechnet jetzt:")
                multiplikationComputer.calcMultiplikation()
                if (multiplikationComputer.win) computer.score++
                Thread.sleep(1_000)

                lapCounter++

            } while (lapCounter <= roundQuantity)

            println()
            println("Du hast ${player1.score} Punkte und der Computer hat ${computer.score}.")
            println()
            Thread.sleep(1_000)
            if (player1.score == computer.score) println("Das spiel ging unentschieden aus.")
            if (player1.score > computer.score) println("Du hast gewonnen!! Tolle Leistung für eine/n ${player1.age} jährige/n !")
            if (player1.score < computer.score) println("${computer.name} hat gewonnen")
            Thread.sleep(1_000)
        }


        if (playerQuantity == 2) {

            do {
                println("${player1.name} bitte rechne:")
                multiplikation.calcMultiplikation()
                if (multiplikation.win) player1.score++
                Thread.sleep(1_000)

                println("${player2.name} bitte rechne:")
                multiplikation.calcMultiplikation()
                if (multiplikation.win) player2.score++
                Thread.sleep(1_000)

                lapCounter++
            } while (lapCounter <= roundQuantity)   // Anzahl der Runden vorgeben!!

            println()
            println("${player1.name} hat ${player1.score} Punkte und ${player2.name} hat ${player2.score}.")
            println()
            Thread.sleep(1_000)
            if (player1.score == player2.score) println("Das Spiel ging unentschieden aus.")
            if (player1.score > player2.score) println("${player1.name} hat gewonnen!! Tolle Leistung für eine/n ${player1.age} jährige/n !")
            else println("${player2.name} hat gewonnen! Tolle Leistung für eine/n ${player2.age} jährige/n !")
            Thread.sleep(1_000)
        }
    }

    fun divisionInGame() {

        if (playerQuantity == 1) {

            do {
                println("${player1.name} bitte rechne:")
                division.calcDivision()
                if (division.win) player1.score++
                Thread.sleep(1_000)

                println("${computer.name} rechnet jetzt:")
                divisionComputer.calcDivision()
                if (divisionComputer.win) computer.score++
                Thread.sleep(1_000)

                lapCounter++
            } while (lapCounter <= roundQuantity)   // Anzahl der Runden vorgeben!!

            println()
            println("Du hast ${player1.score} Punkte und der Computer hat ${computer.score}.")
            println()
            Thread.sleep(1_000)
            if (player1.score == computer.score) println("Das spiel ging unentschieden aus.")
            if (player1.score > computer.score) println("Du hast gewonnen!!! Tolle Leistung für eine/n ${player1.age} jährige/n !!")
            if (player1.score < computer.score) println("${computer.name} hat gewonnen")
            Thread.sleep(1_000)
        }


        if (playerQuantity == 2) {

            do {
                println("${player1.name} ")
                division.calcDivision()
                if (division.win) player1.score++
                Thread.sleep(1_000)

                println("${player2.name} ")
                division.calcDivision()
                if (division.win) player2.score++
                Thread.sleep(1_000)

                lapCounter++
            } while (lapCounter <= roundQuantity)   // Anzahl der Runden vorgeben!!

            println()
            println("${player1.name} hat ${player1.score} Punkte und ${player2.name} hat ${player2.score}.")
            println()
            Thread.sleep(1_000)
            if (player1.score == player2.score) {
                println("Das Spiel ging unentschieden aus.")
            }
            if (player1.score > player2.score) {
                println("${player1.name} hat gewonnen!! Tolle Leistung für eine/n ${player1.age} jährige/n ! ")
            } else println("${player2.name} hat gewonnen!Tolle Leistung für eine/n ${player2.age} jährige/n ! ")
            Thread.sleep(1_000)
        }
    }

    if (calculationType == 1) {
        additionInGame()
    }
    if (calculationType == 2) {
        subtraktionInGame()
    }
    if (calculationType == 3) {
        multiplikationInGame()
    }
    if (calculationType == 4) {
        divisionInGame()
    }


    // Abschluss nach den Aufgaben & Abfrage ob weiter gespielt werden soll
    println()
    println("Wie soll es weiter gehen? Drücke die 1 um nochmal zu spielen oder die 2 zum Beenden.")
    println()
    spielende = safeReadInt()

    while (spielende < 1 || spielende > 2) {
        println("Bitte gib eine gültige Zahl ein.:")
        spielende = safeReadInt()
        Thread.sleep(1_000)
    }

    if (spielende == 1) {
        main()
    }
    if (spielende == 2) {
        println("Danke und bis Bald!!!")
    }

}








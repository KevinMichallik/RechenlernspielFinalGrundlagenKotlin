fun main() {

    // initialisierung der Spieler

    var player1: Player = Player()
    var player2: Player = Player()
    var computer: PlayerComputer = PlayerComputer()

    var rundenzaehler = 0

    // Begrüßung

    println("Hallo und Willkommen im Rechenlernspiel!!")
    println("Bitte gib an, ob du alleine üben möchtest, oder ob Ihr zu zweit lernen möchtet.")

    // Anzahl der Spieler muss angegeben werden und die Daten

    println("Tipp die 1 für alleine gegen den Computer spielen, oder die 2 wenn ihr gemeinsam lernen wollt:")

    var anzahlSpieler = readln().toInt()

    if (anzahlSpieler == 1) {

        println("Bitte gib deinen Namen ein:")
        player1.name = readln()
        println("Bitte gib dein alter ein:")
        player1.age = readln().toInt()

    }
    if (anzahlSpieler == 2) {

        println("Bitte gib deinen Namen ein:")
        player1.name = readln()
        println("Bitte gib dein alter ein:")
        player1.age = readln().toInt()


        println("Bitte gib den Namen des 2. Spielers ein:")
        player2.name = readln()
        println("Bitte gib das Alter von Spieler 2 ein:")
        player2.age = readln().toInt()
    }


    // Auswahl der Rechenart

    println("Jetzt ist es an der Zeit zu entscheiden was gerechnet werden soll.")
    println("Folgendes steht zur Auswahl:")
    println("1. - Addition")
    println("2. - Subtraktion")
    println("3. - Multiplikation")
    println("4. - Division")

    println("Bitte wähle die Rechenart aus:")
    var rechenArtWaehlen = readln().toInt()

    // Start der Aufgaben

    if (rechenArtWaehlen == 1) {
        fun additionInGame() {


            if (anzahlSpieler == 1) {

                do {
                    player1.addition()
                    if (player1.win) player1.score++
                    computer.additionComputer()
                    if (computer.win) computer.score++

                    rundenzaehler++
                } while (rundenzaehler <= 2)   // Anzahl der Runden vorgeben!!

                println("Du hast ${player1.score} Punkte und der Computer hat ${computer.score}.")
                if (player1.score == computer.score) println("Das spiel ging unentschieden aus.")
                if (player1.score > computer.score) println("Du hast gewonnen!!!")
                else println("Der Computer hat gewonnen!")
            }


            if (anzahlSpieler == 2) {

                do {
                    println("${player1.name} ")
                    player1.addition()
                    if (player1.win) player1.score++
                    println("${player2.name} ")
                    player2.addition()
                    if (player2.win) player2.score++

                    rundenzaehler++
                } while (rundenzaehler <= 2)   // Anzahl der Runden vorgeben!!

                println("${player1.name} hat ${player1.score} Punkte und ${player2.name} hat ${player2.score}.")
                if (player1.score == player2.score) println("Das Spiel ging unentschieden aus.")
                if (player1.score > player2.score) println("${player1.name} hat gewonnen!!!")
                else println("${player2.name} hat gewonnen!")
            }
        }
    }
    if (rechenArtWaehlen == 2) {
        fun subtraktionInGame() {

            if (anzahlSpieler == 1) {

                do {
                    player1.subtraktion()
                    if (player1.win) player1.score++
                    computer.subtraktionComputer()
                    if (computer.win) computer.score++

                    rundenzaehler++
                } while (rundenzaehler <= 2)   // Anzahl der Runden vorgeben!!

                println("Du hast ${player1.score} Punkte und der Computer hat ${computer.score}.")
                if (player1.score == computer.score) println("Das spiel ging unentschieden aus.")
                if (player1.score > computer.score) println("Du hast gewonnen!!!")
                else println("Der Computer hat gewonnen!")
            }


            if (anzahlSpieler == 2) {

                do {
                    println("${player1.name} ")
                    player1.subtraktion()
                    if (player1.win) player1.score++
                    println("${player2.name} ")
                    player2.subtraktion()
                    if (player2.win) player2.score++

                    rundenzaehler++
                } while (rundenzaehler <= 2)   // Anzahl der Runden vorgeben!!

                println("${player1.name} hat ${player1.score} Punkte und ${player2.name} hat ${player2.score}.")
                if (player1.score == player2.score) println("Das Spiel ging unentschieden aus.")
                if (player1.score > player2.score) println("${player1.name} hat gewonnen!!!")
                else println("${player2.name} hat gewonnen!")
            }
        }
    }
    if (rechenArtWaehlen == 3) {
        fun multiplikationInGame() {

            if (anzahlSpieler == 1) {

                do {
                    player1.multiplikation()
                    if (player1.win) player1.score++
                    computer.multiplikationComputer()
                    if (computer.win) computer.score++

                    rundenzaehler++
                } while (rundenzaehler <= 2)   // Anzahl der Runden vorgeben!!

                println("Du hast ${player1.score} Punkte und der Computer hat ${computer.score}.")
                if (player1.score == computer.score) println("Das spiel ging unentschieden aus.")
                if (player1.score > computer.score) println("Du hast gewonnen!!!")
                else println("Der Computer hat gewonnen!")
            }


            if (anzahlSpieler == 2) {

                do {
                    println("${player1.name} ")
                    player1.multiplikation()
                    if (player1.win) player1.score++
                    println("${player2.name} ")
                    player2.multiplikation()
                    if (player2.win) player2.score++

                    rundenzaehler++
                } while (rundenzaehler <= 2)   // Anzahl der Runden vorgeben!!

                println("${player1.name} hat ${player1.score} Punkte und ${player2.name} hat ${player2.score}.")
                if (player1.score == player2.score) println("Das Spiel ging unentschieden aus.")
                if (player1.score > player2.score) println("${player1.name} hat gewonnen!!!")
                else println("${player2.name} hat gewonnen!")
            }
        }
    }


}






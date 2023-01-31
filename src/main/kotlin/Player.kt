open class Player(
    var name: String = "",
    var age: Int = 0,
    var score: Int = 0,
    var win: Boolean = false
) {

    open fun addition() {

        var calcNumber1 = 1..50
        var calcNumber2 = 1..50


        var add1 = calcNumber1.random()
        var add2 = calcNumber2.random()
        var result = add1 + add2


        println(" Bitte Rechne folgendes: $add1 + $add2")
        println("Tippe dein result ein:")

        var resultPlayer = readln().toInt()

        if (resultPlayer == result) {
            win = true
            println("Super weiter so!!")


        } else
            println("Leider falsch.")


    }

    open fun subtraktion() {

        var calcNumber1 = 50..100
        var calcNumber2 = 1..49


        var add1 = calcNumber1.random()
        var add2 = calcNumber2.random()
        var result = add1 - add2


        println(" Bitte Rechne folgendes: $add1 - $add2")
        println("Tippe dein result ein:")

        var resultPlayer = readln().toInt()

        if (resultPlayer == result) {
            win = true
            println("Super weiter so!!")


        } else
            println("Leider falsch.")


    }

    open fun multiplikation(){

        var calcNumber1 = 1..50
        var calcNumber2 = 1..50


        var add1 = calcNumber1.random()
        var add2 = calcNumber2.random()
        var result = add1 * add2


        println(" Bitte Rechne folgendes: $add1 * $add2")
        println("Tippe dein result ein:")

        var resultPlayer = readln().toInt()

        if (resultPlayer == result) {
            win = true
            println("Super weiter so!!")


        } else
            println("Leider falsch.")


    }

    // TODO Divison hinzufügen







}





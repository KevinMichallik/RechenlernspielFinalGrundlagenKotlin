fun safeReadInt(): Int {

    var srl: Int

    return try {
        srl = readln().toInt()
        srl

    } catch (e: Exception) {
        println("Bitte wiederhole deine Eingabe mit einer korrekten angabe.")
        safeReadInt()
    }
}







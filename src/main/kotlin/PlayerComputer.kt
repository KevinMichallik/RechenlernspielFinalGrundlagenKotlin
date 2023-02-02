open class PlayerComputer(name: String = "", age: Int = 0) : Player(name, age, win = false) {

    val nameList = mutableListOf<String>("C3-PO", "JARVIS", "STORM-TROOPER", "WALL-E", "R2D2")
    val ageList = 6..99


    init {
        this.name = nameList.random()
        this.age = ageList.random()

    }


}










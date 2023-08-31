fun main(args: Array<String>) {

    // veggies in a fridge

    var veggieInventory = arrayOf(
        arrayOf("Tomatoes", 7),
        arrayOf("Zucchini", 1),
        arrayOf("Beets", 3),
        arrayOf("Carrots", 0),
        arrayOf("Brussel Sprouts", 16)
    )

    println(" These are the veggies we have in the fridge: Tomatoes, " +
            "Zucchini, Beets, Carrots, and Brussel Sprouts.")

    println("========================")
    println("Please enter the veggie name you wish to find: ")
    val veggieSearch = readLine()
    var found = false

    for (x in veggieInventory) {
        val veggieName = x[0] as String
        var veggieCount = x[1] as Int
        if (veggieSearch.equals(veggieName, ignoreCase = true)){
            found = true
            println("There are ${veggieCount} ${veggieName} in the fridge.")
            println("=====================")
        }
    }
    if (!found) {
        println("Sorry, but we don't have that veggie in the fridge.")
        println("=====================")
    }

    println("Please enter the name of the veggie you want to modify: ")
    val veggieChange = readLine()
    var changeAmount = 0
    for (x in veggieInventory){
        val veggieName = x[0] as String
        var veggieCount = x[1] as Int
        if (veggieChange.equals(veggieName, ignoreCase = true)){
            println("Please enter how many you would like to add/subtract: ")
            changeAmount = readln()?.toIntOrNull() ?: 0
            var newAmount = veggieCount + changeAmount
            var adjustedAmount = if (newAmount < 0){
                println("I'm sorry, we can't have a negative number of veggies!")
                newAmount = 0
            } else {
                newAmount
            println("Veggie: ${veggieName}")
            println("Original number of that veggie: ${veggieCount}")
            println("Number added/subtracted: ${changeAmount}")
            println("New number of that veggie: ${newAmount}")
            }
        }
    }
}
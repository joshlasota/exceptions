import java.text.DecimalFormat

fun main() {
    val decimalFormat = DecimalFormat("#.##")

    var totalCost = 0.0

    // Prompt user to enter costs until they enter 0
    while (true) {
        println("Enter the cost of the item (enter 0 to finish): $")
        val input = readLine()

        val cost = input?.toDoubleOrNull()

        if (cost == null) {
            println("Invalid input. Please enter a valid number.")
            continue
        }

        if (cost == 0.0) {
            break
        }

        totalCost += cost
    }

    // Calculate taxes
    val taxes = totalCost * 0.025

    // Calculate total with taxes
    val totalWithTaxes = totalCost + taxes

    // Calculate recommended tip
    val tip = totalWithTaxes * 0.175

    // Display results
    println("Total Cost: $${decimalFormat.format(totalCost)}")
    println("Taxes (2.5%): $${decimalFormat.format(taxes)}")
    println("Total with Taxes: $${decimalFormat.format(totalWithTaxes)}")
    println("Recommended Tip (17.5%): $${decimalFormat.format(tip)}")
}

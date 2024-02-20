import java.text.DecimalFormat

fun main() {
    val decimalFormat = DecimalFormat("#.##")

    var totalCost = 0.0

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

    val taxes = totalCost * 0.025

    val totalWithTaxes = totalCost + taxes

    val tip = totalWithTaxes * 0.175

    println("Total Cost: $${decimalFormat.format(totalCost)}")
    println("Taxes (2.5%): $${decimalFormat.format(taxes)}")
    println("Total with Taxes: $${decimalFormat.format(totalWithTaxes)}")
    println("Recommended Tip (17.5%): $${decimalFormat.format(tip)}")
}

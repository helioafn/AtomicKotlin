package numberTypes

fun bmiMetric(weight: Double, height: Double): String {
//    Calculates BMI using International units (kilos)
    val bmi = weight / (height * height)
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}

fun bmiEnglish(
    weight: Int,
    height: Int
): String {
// Calculates Body mass index (BMI) using english units, represented by Int parameters
    val bmi = 703.07 * weight / (height * height)
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal Weight"
    else "Overweight"
}


fun main() {
    val weight = 86.0
    val height = 1.76
    val status = bmiMetric(weight, height)
    println(status)
}
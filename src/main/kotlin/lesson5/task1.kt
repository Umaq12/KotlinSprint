package lesson5

fun main() {
    println("Докажите, что вы настоящий пользователь, для этого решите пример")
    val firstNum = 1
    val secondNum = 1
    println("$firstNum + $secondNum")
    println("Введите ответ:")
    val answerOfCustomer = readln().toInt()
    if (answerOfCustomer == 2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
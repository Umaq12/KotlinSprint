package lesson5

fun main () {
    println("Докажите, что вы настоящий пользователь, для этого решите пример")
    println("1 + 1")
    println("Введите ответ:")
    var answerOfCustomer = readln().toInt()
    if (answerOfCustomer == 2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
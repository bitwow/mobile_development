fun main() {
    var greeting = "Lesson 5"

    // Объявим строку из массива символов и выведем результат
    val string = String(charArrayOf('H', 'e', 'l', 'l', 'o'))
    println(string)
    println("Количество символов в строке: ${string.length}")

    // Проверим, содержит ли строка символ "h"
    println("Содержит ли строка 'h': ${string.contains('h')}")

    // Работа с графем-скалярами и эмодзи
    val manEmoji = "\uD83D\uDC68"
    val brownEmoji = "\uD83C\uDFFD"
    val emojiResult = "$manEmoji$brownEmoji"
    println("Эмодзи с коричневым цветом кожи: $emojiResult")

    // Работа с массивами
    val numericArray = (0..20).toList()
    val subArray = numericArray.subList(5, 11)
    println("Элементы с 5 по 10 индексы: $subArray")

    // Работа с ArraySlice
    val subArraysuffix = numericArray.takeLast(5)
    println("Пять последних элемента массива: $subArraysuffix")

    // Методы first и last
    println("Первый элемент массива: ${numericArray.firstOrNull() ?: -1}, последний элемент массива: ${numericArray.lastOrNull() ?: -1}")

    // Методы dropFirst и dropLast
    println("Удалим первый элемент коллекции и вернем массив: ${numericArray.drop(1)}")
    println("Удалим последний элемент коллекции и вернем массив: ${numericArray.dropLast(1)}")
    println("Исходный массив: $numericArray")

    // Методы min и max
    println("Минимальный элемент массива: ${numericArray.minOrNull() ?: -1}")
    println("Максимальный элемент массива: ${numericArray.maxOrNull() ?: -1}")

    // Метод reverse
    val reversedArray = numericArray.reversed()
    println("Перевернутый массив: $reversedArray")

    // Методы sort и sorted
    println("Коллекция была отсортирована методом sorted(): ${numericArray.sorted()}")
    println("Исходная коллекция: $numericArray")
    val sortedArray = numericArray.sorted()
    println("Коллекция была отсортирована методом sort(): $sortedArray")

    // Метод sorted с параметром
    println("Коллекция была отсортирована методом sorted(by: >): ${numericArray.sortedDescending()}")

    // Метод randomElement
    println("Случайный элемент массива: ${numericArray.randomOrNull() ?: -1}")

    // Работа с множествами
    val oddDigits = setOf(1, 3, 5, 7, 9)
    val evenDigits = setOf(0, 2, 4, 6, 8)
    val differentDigits = setOf(3, 4, 7, 8)

    val intersection = differentDigits.intersect(oddDigits)
    println("Общие элементы: $intersection")

    val exclusive = differentDigits.union(oddDigits).subtract(differentDigits.intersect(oddDigits))
    println("Симметрическая разность: $exclusive")

    val union = evenDigits.union(oddDigits)
    println("Объединение: $union")

    val subtract = differentDigits.subtract(evenDigits)
    println("Разность: $subtract")

    val firstSet = setOf(1, 2, 3, 4, 5)
    val secondSet = setOf(1, 3)
    val thirdSet = setOf(5, 6, 7, 8)

    println("secondSet является подмножеством firstSet: ${secondSet.all { it in firstSet }}")
    println("firstSet является надмножеством secondSet: ${firstSet.containsAll(secondSet)}")
    println("secondSet и thirdSet не пересекаются: ${secondSet.intersect(thirdSet).isEmpty()}")
    println("secondSet является строгим подмножеством firstSet: ${secondSet.size < firstSet.size && secondSet.all { it in firstSet }}")
    println("firstSet является строгим надмножеством secondSet: ${firstSet.size > secondSet.size && firstSet.containsAll(secondSet)}")

// ПРАКТИЧЕСКАЯ РАБОТА №2
// 1
// Создайте два множества: setA и setB. setA должен содержать числа от 1 до 10, а setB — числа от 5 до 15.
// 2
// Найдите пересечение множеств setA и setB.
// Найдите объединение множеств setA и setB.
// Найдите разность множеств setA и setB.

//3
//Проверьте, является ли setA подмножеством setB.
//Проверьте, является ли setB подмножеством setA.

//4
//Найдите симметрическую разность множеств setA и setB.
//Проверьте, являются ли множества setA и setB равными.
//5
//Выведите результат в форматированном виде
//    println("Пересечение: $intersectionAB")
//    println("Объединение: $unionAB")
//    println("Разность: $differenceAB")
//    println("setA является подмножеством setB: $isSubsetA")
//    println("setB является подмножеством setA: $isSubsetB")
//    println("Симметрическая разность: $symmetricDifferenceAB")
//    println("Множества равны: $isEqual")

    // Операторы управления

    // Утверждения
    val userYears = 19
    assert(userYears >= 18) { "доступ запрещен" }

    // Оператор IF
    if (userYears < 18) {
        println("доступ запрещен")
    } else {
        println("доступ разрешен")
    }

    // ЗАДАЧА: реализуйте вывод сообщения "Добро пожаловать \(name)", если имя пользователя "Admin"
    val nameUserAccount = "Admin"
    if (nameUserAccount == "Admin") {
        println("Добро пожаловать $nameUserAccount")
    }

    // Расширим возможности нашего сокращенного if до полноценного
    if (userYears < 18) {
        println("доступ запрещен")
    } else {
        println("доступ разрешен")
    }

    // ЗАДАЧА: расширьте предыдущую задачу, добавив сообщение "отказано в доступе"
    if (nameUserAccount == "Admin") {
        println("Добро пожаловать $nameUserAccount")
    } else {
        println("Отказано в доступе")
    }

    // Ошибка в коде
    if (true) {
        println(true)
    } else if (true) {
        println(true)
    } // Ошибка: оба условия всегда истинны

    // ЗАДАЧА: расширьте предыдущую задачу, добавив еще одного пользователя
    if (nameUserAccount == "Admin") {
        println("Добро пожаловать $nameUserAccount")
    } else if (nameUserAccount == "User") {
        println("Добро пожаловать, пользователь $nameUserAccount")
    } else {
        println("Отказано в доступе")
    }

    // Работа с температурой
    var temperature = 100

    if (temperature < 18) {
        println("На улице холодно")
    } else if (temperature < 25) {
        println("На улице тепло")
    } else {
        println("На улице очень жарко")
    }

    var weather = if (temperature < 18) {
        "На улице холодно"
    } else {
        "На улице тепло"
    }

    println(weather)
}

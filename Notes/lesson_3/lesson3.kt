fun main() {
    // Объявите переменные firstString со значением "I can" и secondString со значением "code". В значениях переменных никаких хитростей с лишними пробелами быть не должно. Выведите на консоль фразу "I can code!" с восклицательным знаком, используя эти строковые свойства.
    val firstString = "I can"
    val secondString = "code"

    println("$firstString $secondString!")

    // 2.1 Объявите переменную myAge и присвойте ей значение вашего возраста.
    val myAge = 25

    // 2.2 Объявите переменную myAgeInTenYears и присвойте ей значение вашего возраста через 10 лет (используйте для этого переменную myAge и оператор сложения).
    val myAgeInTenYears = myAge + 10

    // 2.3 Объявите переменную daysInYear и присвойте ей значение 365.25 (число дней в году с учетом високосных годов). Тип данных, который переменная примет по умолчанию, менять не нужно.
    val daysInYear = 365.25

    // 2.4 Объявите переменную daysPassed с типом Float и присвойте ей значение количества дней с момента вашего рождения плюс 10 лет (используйте для этого myAgeInTenYears и daysInYear).
    val daysPassed = myAgeInTenYears * daysInYear

    // 2.5 При помощи функции println() выведите на консоль фразу: «Мой возраст <...> лет. Через 10 лет мне будет <...> лет, с момента моего рождения пройдет <...> дней». Символы (<...>) необходимо заменить на значения переменных.
    println("Мой возраст $myAge лет. Через 10 лет мне будет $myAgeInTenYears лет, с момента моего рождения пройдет ${daysPassed.toInt()} дней.")

    // Задание 3

    // Необходимо вычислить площадь и периметр прямоугольного треугольника.

    // Катет AC = 8.0
    // Катет CB = 6.0
    // Гипотенузу AB вычисляем при помощи функции sqrt(), поместив в скобки сумму квадратов катетов. В расчетах можно использовать только арифметические операторы. Функцию pow использовать не надо.
    val sideAC = 8.0
    val sideCB = 6.0

    val sideAB = kotlin.math.sqrt(sideAC * sideAC + sideCB * sideCB)
    val triangleArea = sideAC * sideCB / 2
    val trianglePerimeter = sideAC + sideCB + sideAB

    println("Площадь треугольника: $triangleArea")
    println("Периметр треугольника: $trianglePerimeter")

    // Пример строки с юникодом
    val someText: String = "\u041F\u0440\u0438\u0432\u0435\u0442, \u0433\u0440\u0443\u043F\u043F\u0430 \u0050\u0034\u0032\u0035\u0030!"

    // Символ в Kotlin
    val someCharacter: Char = '\u0438'

    // Работа с типами
// В Kotlin typealias используется немного иначе, чем в Swift. В Kotlin typealias применяется для создания псевдонимов
// для существующих типов, но его нельзя использовать для примитивных типов (например, для String). В вашем случае typealias для String не имеет смысла.
//    typealias NameType = String // не обязательно, но Kotlin это поддерживает
//    val nameAdmin: NameType = "Vadim"


    // Пример использования hashCode
    val someNumValue = 1984
    val someBoolValue = true
    println(someNumValue.hashCode())
    println(someBoolValue.hashCode())

    // Пример использования кортежей
    val backpack = Triple("notebook", "charge cable", 10)
    println("First element: ${backpack.first}, and second element ${backpack.second}")

    // Пример работы с Pair
    val modelPhone = Pair("iPhone", 16)
    println("Модель телефона ${modelPhone.first}, его номер ${modelPhone.second}")

    // Модификация данных
    var serverStatus = Pair(200, "OK")
    println("Status: ${serverStatus.second}, Code: ${serverStatus.first}")

    serverStatus = Pair(404, "Not found!")
    println("Status: ${serverStatus.second}, Code: ${serverStatus.first}")

    // Пример работы с диапазонами
    val range1 = 1..5 // закрытый диапазон
    val range2 = 1 until 5 // полуоткрытый диапазон
    val range3 = -5..5 // диапазон с отрицательными числами
    // Исходный текст смотреть в файле MD
    val arrayChar = arrayOf("Й", "О", "Д")
    val wordInArray = "${arrayChar[0]}${arrayChar[1]}${arrayChar[2]}"

    println(wordInArray)
    println(arrayChar[0])
    println(arrayChar[1])
    println(arrayChar[2])

    // Типы Bool
    val someBool = true
}

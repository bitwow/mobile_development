fun main() {
    // Если Вы встретили две слеши, то это значит, что впереди комментарий или закомментированный блок кода, который был изменен на лекции и его предыдущая версия сохранена в комментарии.

    val greeting = "Lesson 2"

    // Оператор присваивания – это символ =, позволяет поместить значение какого-либо типа (any type) в созданное хранилище.

    // Создадим переменную helloGroup, но не будем инициализировать никакого значения. Если же мы не укажем тип переменной (хранилища), то компилятор выдаст ошибку.
    // Объявить константу либо переменную можно лишь с указанием типа (в таком случае можно будет инициализировать значение после создания константы).

    var helloGroup: String
    helloGroup = "Hello Students"
    println(helloGroup)

    // Мы изменили значение переменной, если же мы попробовали изменить значение в константе, то получили бы ошибку:
    // "Val cannot be reassigned". IntelliJ IDEA предложит заменить ключевое слово 'val' на 'var': "Change 'val' to 'var' to make it mutable".
    helloGroup = "Goodbye Students"
    println(helloGroup)

    // Ниже представлен код, который показывает парадигму работы value type (значимых типов). Значения значимых типов передаются копированием, а не ссылкой.
    var parametr1: Int = 10
    var parametr2 = parametr1
    parametr2 += 5
    println(parametr1)  // Параметр 1 не был изменен, так как мы вносили изменения в его копию – параметр 2.

    val result = parametr1 * parametr2
    println(result)  // Третья переменная result содержит в себе значения умножения копий – параметр 1 и параметр 2.

    // Также отмечу, что Kotlin является языком со строгой типизацией. Тип параметра мы не можем изменить после его инициализации.
    var numberPhone = 1234
    numberPhone = 5678
    // numberPhone = "+7qwerty"  // Ошибка: Cannot assign value of type 'String' to type 'Int'

    // Пример приведения типов.
    val year = 365
    val day = 0.25
    println("Value = ${(year.toDouble()) + day}")

    // Типы данных
    // Числовые: Int, Float, Double
    var integer: Int = -63646783
    var unsignedInteger: UInt = 80u

    // Выведем минимальные и максимальные значения целочисленных типов.
    println(Int.MIN_VALUE)      // -2^31
    println(Int.MAX_VALUE)      // 2^31 - 1
    println(UInt.MIN_VALUE)     // 0
    println(UInt.MAX_VALUE)     // 2^32 - 1

    // Пример с плавающей точкой.
    var double = 3.141592653589793
    var float: Float = 3.141592653589793f
    println(double)
    println(float)

    // Строки и символы.
    var string = "Hello"
    var character: Char = 'H'

    // Пример арифметических операций.
    val a = 9
    val b = 5

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)

    // Составной оператор присваивания.
    var count = 10
    count += 1
    count -= 1
    count *= 1
    count %= 1

    // Операторы сравнения.
    println(a == b)
    println(a != b)
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)

    // Логический оператор НЕ.
    var booleanValue = true
    println(!booleanValue)

    // Условная конструкция if-else.
    var allow = false
    var printMessage = "Hello"
    var printMessage2 = "Goodbye"

    if (!allow) {
        println(printMessage2)
    } else {
        println(printMessage)
    }

    // Логический оператор И.
    val key = false
    val face = true

    if (key && face) {
        println("Good")
    }

    // Логический оператор ИЛИ.
    if (key || face) {
        println("Good")
    }

    // Работа со строками.
    var nameUser = "Alexey"
    var greetingUser = "Hello!"

    // Конкатенация строк.
    val greetingUserPrint = nameUser + " – " + greetingUser
    println(greetingUserPrint)

    // Интерполяция строк.
    val greetingUserInterpolation = "$nameUser – $greetingUser"
    println(greetingUserInterpolation)

    // Многострочные литералы.
    val profileUser = """
        full name: $nameUser
        greeting: $greetingUser
        company: University ITMO
        post: student
    """.trimIndent()
    println(profileUser)

    // Числа можно задавать в разных системах счисления.
    val decimalNumber = 17
    val binaryNumber = 0b10001
    //val octalNumber = 0o21

    //Обратите, пожалуйста, внимание на то, что в Kotlin нет поддержки восьмеричной системы счисления,
    //в отличие от языка swift. Однако, можно воспользоваться функцией преобразования восьмеричной системы
    //в десятичную
    val octalNumber = "21".toInt(8)
    println(octalNumber)  // 17
    val hexNumber = 0x11

    // Для лучшего понимания числа можно его разделять андерскорами.
    var million = 1_000_000
    println(million)

    // Работа с дробными числами.
    var myWallet: Double = 0.0
    val incomeAfterOperation = 0.1

    myWallet += incomeAfterOperation
    println(myWallet)
    myWallet += incomeAfterOperation
    println(myWallet)
    myWallet += incomeAfterOperation
    println(myWallet)

    // Использование Decimal для большей точности.
    var decimalWallet: Double = 0.0

    decimalWallet += incomeAfterOperation
    println(decimalWallet)
    decimalWallet += incomeAfterOperation
    println(decimalWallet)
    decimalWallet += incomeAfterOperation
    println(decimalWallet)
}

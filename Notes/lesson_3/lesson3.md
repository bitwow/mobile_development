import UIKit

// Объявите константу firstString со значением "I can" и secondString со значением "code". В значениях констант никаких хитростей с лишними пробелами быть не должно. Выведите на консоль фразу "I can code!" с восклицательным знаком, используя эти строковые свойства.
let firstString = "I can"
let secondString = "code"

print(firstString + " " + secondString + "!")
print("\(firstString) \(secondString)!")

// 2.1 Объявите свойство myAge и присвойте ему значение вашего возраста.
let myAge = 25
// 2.2 Объявите свойство myAgeInTenYears и присвойте ему значение вашего возраста через 10 лет (используйте для этого константу myAge и оператор сложения).
let myAgeInTenYears = myAge + 10

// 2.3 Объявите свойство daysInYear и присвойте ему значение 365.25 (число дней в году с учетом високосных годов). Тип данных, который свойство примет по умолчанию, менять не нужно.
let daysInYear = 365.25

// 2.4 Объявите свойство daysPassed с типом Float и присвойте ему значение количества дней с момента вашего рождения плюс 10 лет (используйте для этого myAgeInTenYears и daysInYear).
let daysPassed = Float(myAgeInTenYears) * Float(daysInYear)

// 2.5 При помощи функции print() выведите на консоль фразу: «Мой возраст <...> лет. Через 10 лет мне будет <...> лет, с момента моего рождения пройдет <...> дней». Символы (<...>) необходимо заменить на значения свойств.
print("Мой возраст \(myAge) лет. Через 10 лет мне будет \(myAgeInTenYears) лет, с момента моего рождения пройдет \(Int(daysPassed)) дней.")

// Задание 3

// Необходимо вычислить площадь и периметр прямоугольного треугольника.

// Катет AC = 8.0
// Катет CB = 6.0
// Гипотенузу AB вычисляем при помощи функции sqrt(Double), поместив в скобки вместо Double сумму квадратов катетов. В расчетах можно использовать только арифметические операторы. Функцию pow использовать не надо.

let sideAC = 8.0
let sideCB = 6.0

let sideAB = sqrt(sideAC * sideAC + sideCB * sideCB)
let triangleArea = sideAC * sideCB / 2
let trianglePerimeter = sideAC + sideCB + sideAB

print("Площадь треугольника: \(triangleArea)")
print("Периметр треугольника: \(trianglePerimeter)")

var greeting = "lesson 3"

// На прошлой лекции мы затронули базовые типы данных, рассмотрели операции над ними, свойства и способы преобразования типов. Сегодня расширим знания о базовых функциональных возможностях языков программирования.

// Вернемся к строкам. В прошлый раз мы разобрали, что тип String отвечает за хранение строк произвольной длины, а тип Character отвечает за хранение только одного символа.

// Для нас строка состоит из символов, которые мы можем соединить в слова, а для компьютера – это лишь символы, которые передаются при помощи кодовых значений. Символы современных алфавитов кодируются стандартом Юникод.

// Рассмотрим следующую строку:

let someText: String = "\u{041F}\u{0440}\u{0438}\u{0432}\u{0435}\u{0442}, \u{0433}\u{0440}\u{0443}\u{043F}\u{043F}\u{0430} \u{0050}\u{0034}\u{0032}\u{0035}\u{0030}\u{0021}"

// Как мы помним, тип Character может принять в себя только один символ. Давайте рассмотрим следующую константу типа Character, содержащую в себе некоторое значение:

let someCharacter: Character = "\u{0438}\u{0306}"

// Почему же так произошло? Дело в том, что мы вывели букву й, а она состоит из двух элементов – и и черточки над ней. Таким образом, мы комбинируем два элемента Юникод-таблицы в один. Если же мы попытаемся совместить другую букву и символ черточки, то получим ошибку. Подобное разложение буквы и дополнительного символа называют графем-скаляром.

// Теперь обсудим, каким образом можно задать тип. Допустим, мы работаем в компании, где есть собственные кодовые наработки, включая собственные типы данных. Тип данных построен на определенной структуре, и мы можем его использовать. Некоторые (более сложные) типы можно именовать собственными значениями. Например, создадим тип Name, основанный на типе String.

typealias NameType = String

// Создадим константу с этим именем и поместим туда значение "Vadim"
let nameAdmin: NameType = "Vadim"

// Если мы зажмем клавишу 'option' и наведем на тип, то получим следующую аннотацию: typealias NameType = String. Компилятор говорит нам, что исходный тип данных – это String, для которого мы создали псевдоним. В некоторых случаях, при использовании более сложных типов, это упрощает работу и повышает читабельность кода.

// Также можно узнать тип данных, если вызвать функцию type(of: _). Периодически данная функция используется при работе с классами. Выведем при помощи этой функции тип ранее созданной константы nameAdmin.
print(type(of: nameAdmin))

// В консоли мы получили значение String.

// Одним из аспектов работы современных языков программирования является использование хэшируемых типов данных.
// Типы данных подразделяются на сопоставимые и хэшируемые.
// С сопоставимыми типами мы уже взаимодействовали – это значения тех типов данных, которые можно сравнить между собой. Все числовые типы являются сопоставимыми, так как их значения можно сравнить и вывести true или false, а вот логические типы сравнить нельзя. Например:

10 > 15
"Name1" <= "Name2"
0.341 >= 0.241

// Для сравнения можно использовать только знаки <, >, ≥, ≤.
// Операторы == (сравнения) и != (эквивалентности) применимы к категории эквивалентных типов.

// Для хэшируемых типов может быть получен цифровой код – хэш. Получим хэш из нескольких констант при помощи свойства hashValue.

nameAdmin.hashValue
let someNumValue = 1984
let someBoolValue = true
someNumValue.hashValue
someBoolValue.hashValue

// При каждой новой итерации значения хэшей будут изменяться, так как хэш-сумма зависит от переменных значений (время, распад радиоактивных элементов и так далее).
// Все фундаментальные типы являются хэшируемыми.

// Некоторый итог изучения фундаментальных типов

// Целочисленные типы можно применять для хранения определенных значений, например в переменной temp типа Int8 можно хранить (и динамично обновлять) значение температуры на улице, а переменная health типа UInt8 может хранить очки здоровья игрового персонажа в игре:

var temp: Int8 = -27
var health: UInt8 = 10

// Типы UInt8, 16, 32 могут быть использованы в приложениях, где задается определенная глубина цвета, которая должна быть ограничена.

// Числа с плавающей точкой позволяют хранить данные с дробными значениями, например скорость автомобиля speedCar или же процентный коэффициент mortgageInterest.

var speedCar: Float = 120.3
var mortgageInterest: Float = 20.5

// Для хранения информации с большей точностью используется тип Double, допустим для хранения числа e и pi.

let e = 2.718281828459045
let pi = 3.141592653589793

// Тип Decimal применяется для хранения точных значений до 38 знаков после запятой.

var cryptoOperation: Decimal = 0.1000000000000000000000001

// Тип String предназначен для хранения строк произвольной длины, также может использоваться многострочный литерал или же символьный тип Character.

let comeText = "съешь ещё этих мягких французских булок, да выпей чаю"
let comeCharacter: Character = "\u{0438}\u{0306}"
let object = "ЙОД"
// object[0] // "Й" – как это мы себе представляем
// object[0] // "И" – как оно есть на самом деле
// object[1] // "О" – как это мы себе представляем
// object[1] // "\u{0306}" – как оно есть на самом деле
// Каким образом у нас выглядит строка по элементам: 1. И 2. ^ 3. О 4. Д
// object.count = 3 – (в данной строке мы храним 3 элемента)

// ДОПОЛНИТЕЛЬНО:
// Разберем теперь такой же принцип с массивом, объявим массив, содержащий в себе три буквы.

let arrayChar = ["Й", "О", "Д"]

// Получили массив, из которого можно собрать слово йод

let wordInArray = "\(arrayChar[0])\(arrayChar[1] )\(arrayChar[2])"

//Обратимся по индексам к элементам массива

arrayChar[0]
arrayChar[1]
arrayChar[2]

// Мы вывели все значения по индексам. Массивы мы разберем на следующей лекции. 

// Тип Bool предназначен для хранения логических значений: true или false.

let someBool = true

// Псевдонимы типов удобны при работе с более сложными типами данных.
// typealias TransitionDelegate = UIViewController & UIViewControllerTransitionDelegate

// Мы с вами прошли фундаментальные типы данных, теперь нам предстоит затронуть контейнерные типы данных. К ним относятся: массивы, множества, кортежи, диапазоны, последовательности, словари, строки и коллекции.

// Вернемся к аналогии с фигурами. Представим, что у нас есть корзина с множеством фигур различных типов и свойств. Контейнерные типы позволяют использовать эту корзину как единый объект, а для доступа к объектам в корзине могут быть использованы специальные механизмы, которые мы сегодня рассмотрим.

// Начнем наше знакомство с кортежей. Кортеж может группировать объекты разных типов в пределах одного значения (условно, используем пример с корзиной). Также кортеж предоставляет возможность обратиться к конкретному объекту адресно (по его индексу либо идентификатору). Порядок следования объектов в кортеже фиксированный. Зададим кортеж с элементами нашего портфеля.

let backpack = ("notebook", "charge cable", "apple", "phone", 10, true)

// Не удивляйтесь, 10 – это, допустим, монета, а true – это наличие чего-либо необходимого в нашем портфеле. Нам было необходимо продемонстрировать факт наличия объектов разного типа в рамках одного объекта. Выведем значения кортежа на боковую панель и консоль.

backpack

// После того, как мы вывели элементы, в боковой панели можно открыть аннотацию и увидеть все наши элементы, расположенные по индексам. Индексы начинаются с нуля.

// Какой же тип данных у нашего кортежа?

type(of: backpack) // (String, String, String, String, Int, Bool).Type

// Если же мы явно задаем тип кортежа, то типы должны быть расположены в таком же порядке, иначе получим ошибку.

let modelPhone: (String, Int) = ("iPhone", 16)

// Допустим, нам нужно проинициализировать данные кортежа в переменные. Для этого создаем несколько переменных следующим образом:

let (phoneModel, indexPhone) = modelPhone

print("Модель телефона \(phoneModel), его номер \(indexPhone)")

// При этом подобный синтаксис может быть удобен при задании нескольких значений в несколько переменных.

// let (number1, number2) = (1, 2)

// Если же нам нужно получить отдельное значение из кортежа, то воспользуемся следующей конструкцией:

let (phoneBrand, _) = modelPhone

print(phoneBrand)

// Таким образом, мы передали значение из кортежа в переменную, при этом отбросив ненужный блок данных.

// Однако можно получить доступ к элементу через его индекс. Обратимся к нашему портфелю и выведем первые два элемента.

print("First element: \(backpack.0), and second element \(backpack.1)")

// В коде есть неопределенность при использовании индексов, так как нужно повторно обращаться к кортежу и смотреть на его значения. При наличии объемного кода делать это практически невозможно. Для решения этой ситуации придумали имена для каждого из параметров кортежа. Рассмотрим их в константе ниже.

var serverStatus = (statusCode: 200, textStatus: "OK")

// Представим, что наш кортеж вернул такие данные с сервера, и нам нужно вывести эти значения в консоль:

print("Status: \(serverStatus.textStatus), Code: \(serverStatus.statusCode)")

// Таким образом, мы повысили читабельность кода и повысили определенность в названиях элементов.

// Давайте теперь обновим данные в кортеже.

type(of: serverStatus) // (statusCode: Int, textStatus: String).Type

// Изменим данные в кортеже.

serverStatus = (404, "Not found!")

// Повторим принт.

print("Status: \(serverStatus.textStatus), Code: \(serverStatus.statusCode)")

serverStatus.statusCode = 502
serverStatus.textStatus = "Bad gateway"
print("Status: \(serverStatus.textStatus), Code: \(serverStatus.statusCode)")

var coordinate = (x: 200, y: 35, z: 50)

// Кортежи используются для группировки небольшого количества значений (не более 7).

// Последовательность (Sequence)

// Последовательность – это коллекция однотипных элементов, расположенных друг за другом. Доступ есть только к последнему элементу. Допустим, если у нас есть тубус с шариками разных цветов, то нам нужно последовательно перебрать все шары, пока мы не найдем искомый. Получается, что нельзя обратиться к элементу напрямую.

// Коллекции – имеют более расширенный функционал, есть регламентация доступа к отдельному элементу.

// Диапазоны:

let range1 = 1...5 // закрытый диапазон
let range2 = 1..<5 // полуоткрытый диапазон
let range3 = ...5
let range4 = 0...






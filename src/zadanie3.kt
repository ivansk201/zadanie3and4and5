fun main() {
    try {
        print("Введите число: ")
        var a = readLine()!!.toInt()
        when (a) {
            in 0..2 -> print("Младенец")
            in 3..11 -> print("Ребенок")
            in 12..17 -> print("Подросток")
            in 18..21 -> print("Юноша")
            in 22..60 -> print("Зрелый мужчина")
            in 61..75 -> print("Пожилой")
            in 76..90 -> print("Старик")
            in 90..100 -> print("Долгожитель")
        else -> print("Вы ввели больше или меньше 100")
        }
    }
    catch (e:Exception)
    {
        print("Ошибка, неверный ввод")
    }
}
fun main()
{
    try {
        println("Первое число: ")
        val S: String? = readLine()
        val X: Int = S!!.toInt()
        println("Второе число: ")
        val Q: String? = readLine()
        val Y: Int = Q!!.toInt()

        if (X < 0 || Y > 0) {
            println("Условие верное")
        }
    }
        catch(e:Exception)
        {
            println("Ошибка, неверный ввод")
        }
    }

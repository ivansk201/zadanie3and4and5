fun main()
{
    try
    {
        print("Введите чему будет равен x: ")
        var x = readLine()!!.toDouble()
        when
        {
        (x<-3.5) -> print(4*(x*x)+2*x-19)
        else -> println(-2+x/(-4+x+1))
        }
    }
    catch (e:Exception)
    {
    println("Ошибка, неверный ввод")
    }
}
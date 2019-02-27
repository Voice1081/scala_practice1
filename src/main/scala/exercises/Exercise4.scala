package exercises

object Exercise4 {

  //Число Армстронга - натуральное число, которое равно сумме своих цифр, возведённых в степень,
  // равную количеству его цифр.
  //Например:
  //11 не число Армстронга, потому что 11 != 1^1 + 1^1 != 2
  //153 число Армстронга, потому что: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
  //Напишите некоторый код, чтобы определить, является ли число числом Армстронга.
  //нельзя использовать var, while, .asInctanceOf(), регулярные выражения, .split()
  //можно использовать scala.math
  //Входные данные: 11(нет) и 153(да)

  import scala.math

  def countOfDigits(x: Int): Int = math.ceil(math.log10(x + 0.5)).toInt
  def sum(x: Int, n: Int, counter: Int): Int = if (counter >= 0)
    math.pow(x%10, n).toInt + sum((x-x%10)/10, n, counter - 1)
  else 0

  def isArmNum(n: Int): Boolean = n == sum(n, countOfDigits(n), countOfDigits(n))
}
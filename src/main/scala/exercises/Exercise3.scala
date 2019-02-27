package exercises

object Exercise3 {

  //У нас появилась задача делать арифметические операции над числами начинающихся с 0 и с плавающей точкой
  //Мы хотим уметь делать вот так: Number("000123.7") + Number("009856.3") и получать Number = 246.0
  //Реализуйте правильно класс, функции и подсказка pretty syntax: реализуйте объект компаньон
  //Входные данные: Number("000123.9") + Number("009876.3")

  class Number(x: String) {

    val stringValue: String = x

    val value: Double = x.toDouble

    def +(r: Number): Number = Number((value + r.value).toString)

    def -(r: Number): Number = Number((value - r.value).toString)

    def *(r: Number): Number = Number((value * r.value).toString)

    def /(r: Number): Number = Number((value / r.value).toString)
  }

  object Number {
    def apply(x: String): Number = new Number(x)
    def fromNumber(num: Number): String = num.stringValue
  }
}
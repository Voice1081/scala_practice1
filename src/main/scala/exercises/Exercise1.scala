package exercises

object Exercise1 {

  //Создайте класс Сoordinates, который содержит 2 числовых поля и
  //переопределите в нем метод toString таким образом, чтобы
  //он возвращал строку вида: (Число, Число)
  //Входные данные: числа 4 и 2

  class Сoordinates(val x: Int, val y: Int){
    override def toString(): String = "(" + x + ", " + y + ")"
  }


}


package exercises


object Exercise2 {

  //Реализуйте пару чистых функций cube и sum
  //sumCub должна возвращаь сумму кубов
  ///Входные данные: числа 4 и 2
  def cube(x: Int): Int = x*x*x

  def sumCube(x: Int, y: Int): Int = cube(x) + cube(y)

}

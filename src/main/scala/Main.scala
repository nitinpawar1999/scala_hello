object  Geeks {
  def main(args: Array[String]){

    var name: String = "Started to learn scala, it seems cool"
    println(name)

    var y = 0

    for(y <- 1 to 10){
      println("Value of y is: " + y)
    }

    var name_arr = Array("A", "B", "C", "D", "E", 1)

    var name_list = List("a", "b", "c", "d", 1)

    println(name_arr(1))
    println(name_list(1))
    println(name_list(4))
    println(name_list.length)

    println(functionToAdd(1,5))

  }

  def functionToAdd(a:Int, b:Int) : Int = {
    return a+b
  }
}
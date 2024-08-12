object Q2 {

  def main(args: Array[String]): Unit = {
    if (args.length != 1 || !args(0).forall(_.isDigit)) {
      println("Please provide a valid integer as input.")
    } else {
      val number = args(0).toInt

      val categorize: Int => String = {
        case n if n % 3 == 0 && n % 5 == 0 => "Multiple of Both Three and Five"
        case n if n % 3 == 0               => "Multiple of Three"
        case n if n % 5 == 0               => "Multiple of Five"
        case _                             => "Not a Multiple of Three or Five"
      }
      
      println(categorize(number))
    }
  }
}


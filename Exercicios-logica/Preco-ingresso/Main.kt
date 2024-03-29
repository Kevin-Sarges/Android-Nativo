fun main() {
  val child = 5
  val adult = 28
  val senior = 87

  val isMonday = true

  println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
  println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
  println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
  // Fill in the code.
  return when {
      age < 13 -> 15
      age in 13..60 -> if(isMonday) 25 else 30
      age > 60 -> 20
      else -> {
        println("Preço invalido")
          -1    
      }
  }
}
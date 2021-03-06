
class Exercise {

  def square(x: Double) = x * x

  def abs(x: Double) = if (x >= 0) x else -x

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def isGoodEnough(guess: Double, x: Double) =
    abs(square(guess) - x) <= math.ulp(x) // Relatively represent the distance between x and it's neighbour with ulp 'units in the last place'.

  def sqrt(x: Double) = sqrtIter(1.0, x)
}

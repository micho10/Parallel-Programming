import scalashop._

def boxBlurKernel(src: Img, x: Int, y: Int, radius: Int): RGBA = {
  // TODO implement using while loops
  var accumulator = Array(0, 0, 0, 0)
  val divider = math.pow(radius * 2 + 1, 2).toInt
  var yIndex = y - radius

  while ( yIndex <= y + radius ) {
    var xIndex = x - radius
    while ( xIndex <= x + radius ) {
      src.data.

//      val sum = (accumulator, src.data()).zipped.map(_ + _)
    }
  }

  rgba(
    accumulator(0) / divider,
    accumulator(1) / divider,
    accumulator(2) / divider,
    accumulator(3) / divider
  )
}

val arr1 = Array(1, 3, 5, 7)
val arr2 = Array(2, 4, 6, 8)
arr1.

val sum = (arr1, arr2).zipped.map(_ + _)

sum.length

package Experiment

import scala.math.sqrt

/**
 * Created by adav on 06/07/2015.
 */
object CosineSimilarity {

    // cos(theta) = (A . B) / (||A|| ||B||)
    def calculateSimilarity(providerVector: Array[Int], userVector: Array[Int]): Double = {

      assert(providerVector.length == userVector.length)

      dotProduct(providerVector, userVector) / (euclideanNorm(providerVector) * euclideanNorm(userVector))

    }

    //e.g. (x[0] * y[0]) + (x[1] * y[1]) + ... + (x[n] * y[n])
    //TODO There must be a better way to do this with some scala-isms?
    private def dotProduct(x: Array[Int], y: Array[Int]): Int = {
      //zip makes 2 lists to list of tuples, then I map the tuples to multiply them
      (x zip y).map({case (a: Int, b: Int) => a * b }).sum
    }

    //e.g. sqrt( x[0]^2 + x[1]^2 + ... + x[n]^2 )
    private def euclideanNorm(x: Array[Int]): Double = {
      sqrt(x.map(a => a * a).sum)
    }
}

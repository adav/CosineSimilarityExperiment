package Experiment

import Experiment.CosineSimilarity._

/**
 * Created by adav on 06/07/2015.
 */
case class Spice(name: String, traits: Array[Int])

object PretendNaiveRecommender {
  def main (args: Array[String]) {
    val registeredProviders = List(
      Spice("Nutmeg", Array(2,2,2)),
      Spice("Ginger", Array(1,2,3)),
      Spice("Cardamom", Array(1,0,1)),
      Spice("Vanilla", Array(1,2,4)),
      Spice("Turmeric", Array(1,1,1))
    )

    val supposedUserPreference = Array(1,2,3)

    val naiveRecommendations = registeredProviders.map(provider => (provider.name, calculateSimilarity(provider.traits, supposedUserPreference)))

    println(naiveRecommendations.sortBy(x => 1 - x._2).take(3))
  }
}

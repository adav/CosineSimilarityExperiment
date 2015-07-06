package Experiment

import Experiment.CosineSimilarity._

/**
 * Created by adav on 06/07/2015.
 */
case class Provider(name: String, traits: Array[Int])

object PretendNaiveRecommender {
  def main (args: Array[String]) {
    val registeredProviders = List(
      Provider("Nutmeg", Array(2,2,2)),
      Provider("Ginger", Array(1,2,3)),
      Provider("Cardamom", Array(1,0,1)),
      Provider("Vanilla", Array(1,2,4)),
      Provider("Turmeric", Array(1,1,1))
    )

    val supposedUserPreference = Array(1,2,3)

    val naiveRecommendations = registeredProviders.map(provider => (provider.name, calculateSimilarity(provider.traits, supposedUserPreference)))

    println(naiveRecommendations.sortBy(x => 1 - x._2).take(3))
  }
}

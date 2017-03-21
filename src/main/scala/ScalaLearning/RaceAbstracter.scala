package ScalaLearning

/**
  * Created by chris on 1/29/2017.
  */
abstract class RaceAbstracter(private var speed: Int) {
  def getSpeed : Int
  def setSpeed(speed: Int) : Int
}

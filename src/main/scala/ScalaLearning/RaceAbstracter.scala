package ScalaLearning

/**
  * Created by andrew25ism on 1/29/2017.
  */
abstract class RaceAbstracter(private var speed: Int) {
  def getSpeed : Int
  def setSpeed(speed: Int) : Int
}

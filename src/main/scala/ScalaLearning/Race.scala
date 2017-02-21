package ScalaLearning

/**
  * Created by andrew25ism on 1/29/2017.
  */
class Race(private var speed: Int) extends RaceAbstracter(speed) {
  this.speed = speed
  override def getSpeed: Int = {
    this.speed
  }

  override def setSpeed(speed: Int): Unit = {
    this.speed = speed
  }
}

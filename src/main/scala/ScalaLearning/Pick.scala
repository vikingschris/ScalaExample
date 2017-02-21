package ScalaLearning

/**
  * Created by andrew25ism on 1/29/2017.
  */
class Pick(private var name:String,private var sound:String) {
  this.name = name
  this.sound = sound

  def this(name: String){
    this("no name","no sound")
  }
  override def toString(): String = {
    return "%s makes %s".format(this.name,this.sound)
  }

  def getName() : String = name
  def getSound() : String = sound
  def setName(name: String): Unit ={
    this.name = name
  }
  def setSound(sound:String): Unit = {
    this.sound = sound
  }
  def fib(n: Int): Int= {
    if (n == 1) {
      n
    }
    else {
      n * fib(n - 1)
    }
  }
  // not returning anything, use unit
  def test(): Unit = {
    println("hello void method")
  }
  // like arguments in javascript
  def getSum(args: Int*): Int = {
    var sum: Int = 0
    for(num <- args) {
      sum += num
    }
    sum
  }
}

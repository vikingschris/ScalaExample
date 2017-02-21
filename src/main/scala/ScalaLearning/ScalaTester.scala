package ScalaLearning

/**
  * Created by andrew25ism on 1/28/2017.
  */
import scala.io.Source
import java.io.PrintWriter

import scala.collection.immutable.HashMap
import scala.collection.mutable.ArrayBuffer
object ScalaTester {
  def main(args: Array[String]): Unit ={
    println("hello world")
    var author: String ="chris"
    var str = "bye bye"
    var num = 5
    var favNum: Int = 3
    var bool: Boolean = true
    var lang: Array[String] = Array("java","javascript","css")
    var learnLang: Array[String] = new Array[String](2)
    learnLang(0) = "german"
    learnLang(1) = "french"
    println(author)
    for(i <- 0 to lang.length - 1){
      println(lang(i))
    }
    for (j <- 0 until lang.length) {
      println(lang(j))
    }
    var aList = List(1,3,5,7)
    for (k <- aList) {
      println(k)
    }
    for (x <- learnLang) {
      println(x)
    }
    if (num == 1) {
      println("is 1")
    }
    else if (num == 2) {
      println("is 2")
    }
    else {
      println("is 3")
    }
    val pickCondition = if(num == 5) true else false
    println(pickCondition)

    var ab = 0
    while (ab < learnLang.length) {
      println(learnLang(ab))
      ab += 1
    }
    var oddList = for {i <- 1 to 20
      if (i % 2) != 0
        } yield i
    for (ol <- oddList) {
      println(ol)
    }
    println(s"Author: $author")
    println(f"I have been writing for $num years")

    val pp = new Pick("dog","rufff")
    println(pp.fib(5))
    println(pp.fib(n=3))
    pp.test()
    println("1 + 2 + 3 + 4 = " + pp.getSum(1,2,3,4))

    val country = ArrayBuffer[String]()
    country += "canada"
    country.insert(0,"germany")
    // add multiple items
    country ++= Array("switzerland","bahi")
    for (c <- country) {
      println(c)
    }
    println("\nreverse order: ")
    country += "france"
    for (cc <- country.reverse) {
      println(cc)
    }
    var timesNum = for {g <- 1 to 4} yield g * 2
    timesNum.foreach(println)

    // multidimension array
    var multiBox = Array.ofDim[Int](3,3)
    for (m <- 0 to 2) {
      for (o <- 0 to 2) {
        multiBox(m)(o) = m * o
      }
    }
    for (x <- 0 to 2) {
      println("")
      for (z <- 0 to 2) {
        print(multiBox(x)(z) + " ")
      }
    }
    println("\n\n")
    // immutable maps
    var magic = Map("point guard" -> "elfrid payton",
    "small guard" -> "evan fournier",
    "small forward" -> "aaron gordon")
    for ((k,v) <- magic) {
      println(k)
    }

    // mutable maps
    var vikings = collection.mutable.Map(5 -> "teddy bridgewater",
      28 -> "adrian peterson", 21 -> "matt asiata")
    vikings(21) = "jerick mckinnon"

    for ((i,j) <- vikings) {
      printf("jersey#: %d -> %s\n",i,j)
    }
    var tupleList = (10.57,"oxtail and rice n peas","caribbean market")
    println(tupleList._1)
    printf("I bought %s at %s for $%.2f\n",tupleList._2,tupleList._3,tupleList._1)
    tupleList.productIterator.foreach(i => println(i))

    printf("Pick name: %s\n",pp.getName())
    printf("Pick sound of %s: %s\n",pp.getName(),pp.getSound())

    val decisions = new Choose("cat","meow")
    printf("My %s %s too much",decisions.getName(),decisions.getSound())
  }
}

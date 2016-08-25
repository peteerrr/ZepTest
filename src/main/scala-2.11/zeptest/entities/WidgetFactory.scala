package zeptest.entities

import scala.util.Random
import WidgetModels._

class WidgetFactory {

  val rand = new Random(System.currentTimeMillis())

  val owners = Seq("Peter", "Rahul", "Bob", "Sally", "Pam", "Michael", "Scott")
  val makers = Seq("Acme", "Dunder", "Mifflin", "Vandelay")
//  val models = Seq("Cog", "Lever", "Cover", "Cube")
  val models = Seq(sprocketOne, sprocketTwo, cogOneThousand, sphere)

  def makeWidgets(n: Int): Seq[Widget] = {
    for(i <- 1 to n) yield {
      Widget(rand.nextDouble() * 100, randomFrom(owners), randomFrom(makers), randomFrom(models))
    }
  }

  private def randomFrom[T](c: Seq[T]): T = {
    val random_index = rand.nextInt(c.length)
    c(random_index)
  }
}
